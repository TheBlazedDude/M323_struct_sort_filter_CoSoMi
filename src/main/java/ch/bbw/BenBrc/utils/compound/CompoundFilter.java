package ch.bbw.BenBrc.utils.compound;

import ch.bbw.BenBrc.models.Compounds;

import java.util.*;
import java.util.stream.*;
/**
 * Filter utility for Compounds.
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class CompoundFilter {

    public static List<Compounds> byName(List<Compounds> list, String keyword) {
        return list.stream()
                .filter(c -> c.getName().toLowerCase().contains(keyword.toLowerCase()))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Compounds> byFormula(List<Compounds> list, String formula) {
        return list.stream()
                .filter(c -> c.getFormula().equalsIgnoreCase(formula))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Compounds> byCAS(List<Compounds> list, String casPrefix) {
        return list.stream()
                .filter(c -> c.getCasNumber().startsWith(casPrefix))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Compounds> byIUPAC(List<Compounds> list, String iupac) {
        return list.stream()
                .filter(c -> c.getIUPACName().toLowerCase().contains(iupac.toLowerCase()))
                .limit(5).collect(Collectors.toList());
    }
}

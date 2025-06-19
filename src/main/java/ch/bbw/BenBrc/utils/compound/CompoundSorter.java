package ch.bbw.BenBrc.utils.compound;

import ch.bbw.BenBrc.models.Compounds;

import java.util.*;
import java.util.stream.*;
/**
 * Sorter utility for Compounds.
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class CompoundSorter {

    public static List<Compounds> byName(List<Compounds> list) {
        return list.stream()
                .sorted((a, b) -> a.getName().compareToIgnoreCase(b.getName()))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Compounds> byMolecularWeight(List<Compounds> list, boolean ascending) {
        return list.stream()
                .sorted((a, b) -> {
                    double w1 = Double.parseDouble(a.getMolecularWeight());
                    double w2 = Double.parseDouble(b.getMolecularWeight());
                    return ascending ? Double.compare(w1, w2) : Double.compare(w2, w1);
                })
                .limit(5).collect(Collectors.toList());
    }

    public static List<Compounds> byCreatedDate(List<Compounds> list, boolean ascending) {
        return list.stream()
                .sorted((a, b) -> ascending
                        ? a.getCreatedAt().compareTo(b.getCreatedAt())
                        : b.getCreatedAt().compareTo(a.getCreatedAt()))
                .limit(5).collect(Collectors.toList());
    }
}

package ch.bbw.BenBrc.utils.solution;

import ch.bbw.BenBrc.models.Solutions;

import java.util.*;
import java.util.stream.*;
/**
 * Sorter utility for Solutions.
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class SolutionSorter {

    public static List<Solutions> byMolecularWeight(List<Solutions> list, boolean ascending) {
        return list.stream()
                .sorted((a, b) -> ascending
                        ? Double.compare(a.getMolecularWeight(), b.getMolecularWeight())
                        : Double.compare(b.getMolecularWeight(), a.getMolecularWeight()))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Solutions> byMass(List<Solutions> list, boolean ascending) {
        return list.stream()
                .sorted((a, b) -> ascending
                        ? Double.compare(a.getMolecularMass(), b.getMolecularMass())
                        : Double.compare(b.getMolecularMass(), a.getMolecularMass()))
                .limit(5).collect(Collectors.toList());
    }
}

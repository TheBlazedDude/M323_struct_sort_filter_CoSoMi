package ch.bbw.BenBrc.utils.solution;

import ch.bbw.BenBrc.models.Solutions;

import java.util.*;
import java.util.stream.*;
/**
 * Filter utility for Solutions.
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class SolutionFilter {

    public static List<Solutions> byName(List<Solutions> list, String keyword) {
        return list.stream()
                .filter(s -> s.getName().toLowerCase().contains(keyword.toLowerCase()))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Solutions> byClassificationContains(List<Solutions> list, String keyword) {
        return list.stream()
                .filter(s -> s.getClassification().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public static List<Solutions> bySynonym(List<Solutions> list, String keyword) {
        return list.stream()
                .filter(s -> s.getSynonyms().stream()
                        .anyMatch(syn -> syn.toLowerCase().contains(keyword.toLowerCase())))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Solutions> byMassRange(List<Solutions> list, double min, double max) {
        return list.stream()
                .filter(s -> s.getMolecularMass() >= min && s.getMolecularMass() <= max)
                .limit(5).collect(Collectors.toList());
    }
}

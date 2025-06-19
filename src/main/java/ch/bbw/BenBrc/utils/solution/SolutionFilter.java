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

    public static List<Solutions> byClassification(List<Solutions> list, String classification) {
        return list.stream()
                .filter(s -> s.getClassification().equalsIgnoreCase(classification))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Solutions> bySynonym(List<Solutions> list, String synonym) {
        return list.stream()
                .filter(s -> s.getSynonyms().stream()
                        .anyMatch(syn -> syn.equalsIgnoreCase(synonym)))
                .limit(5).collect(Collectors.toList());
    }
}

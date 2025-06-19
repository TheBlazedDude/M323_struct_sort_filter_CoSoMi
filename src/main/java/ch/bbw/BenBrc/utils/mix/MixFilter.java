package ch.bbw.BenBrc.utils.mix;

import ch.bbw.BenBrc.models.Mixes;

import java.util.*;
import java.util.stream.*;
/**
 * Filter utility for Mixes.
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class MixFilter {

    public static List<Mixes> byType(List<Mixes> list, String keyword) {
        return list.stream()
                .filter(m -> m.getType().equalsIgnoreCase(keyword))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Mixes> byTypeEquals(List<Mixes> list, String type) {
        return list.stream()
                .filter(m -> m.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    public static List<Mixes> byDescriptionKeyword(List<Mixes> list, String keyword) {
        return list.stream()
                .filter(m -> m.getDescription().toLowerCase().contains(keyword.toLowerCase()))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Mixes> byVolumeRange(List<Mixes> list, double min, double max) {
        return list.stream()
                .filter(m -> m.getVolume() >= min && m.getVolume() <= max)
                .limit(5).collect(Collectors.toList());
    }

    public static List<Mixes> byPreparationDateRange(List<Mixes> list, Date from, Date to) {
        return list.stream()
                .filter(m -> !m.getPreparationDate().before(from) && !m.getPreparationDate().after(to))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Mixes> byMinComponentCount(List<Mixes> list, int minCount) {
        return list.stream()
                .filter(m -> m.getComponents().size() >= minCount)
                .limit(5).collect(Collectors.toList());
    }

    public static List<Mixes> byMinTotalMass(List<Mixes> list, double minMass) {
        return list.stream()
                .filter(m -> MixUtils.getTotalMass(m) >= minMass)
                .limit(5).collect(Collectors.toList());
    }
}
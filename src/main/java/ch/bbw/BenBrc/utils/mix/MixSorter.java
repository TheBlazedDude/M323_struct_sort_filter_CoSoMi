package ch.bbw.BenBrc.utils.mix;

import ch.bbw.BenBrc.models.Mixes;

import java.util.*;
import java.util.stream.*;
/**
 * Sorter utility for Mixes.
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class MixSorter {
    public static List<Mixes> byPreparationDate(List<Mixes> list, boolean ascending) {
        Comparator<Mixes> comparator = Comparator
                .comparing(Mixes::getPreparationDate);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Mixes> byExpirationDate(List<Mixes> list, boolean ascending) {
        Comparator<Mixes> comparator = Comparator
                .comparing(Mixes::getExpirationDate);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Mixes> byVolume(List<Mixes> list, boolean ascending) {
        Comparator<Mixes> comparator = Comparator
                .comparingDouble(Mixes::getVolume);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Mixes> byComponentCount(List<Mixes> list, boolean ascending) {
        Comparator<Mixes> comparator = Comparator
                .comparingInt(m -> m.getComponents().size());
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Mixes> byTypeThenVolume(List<Mixes> list, boolean ascending) {
        Comparator<Mixes> comparator = Comparator
                .comparing(Mixes::getType)
                .thenComparingDouble(Mixes::getVolume);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Mixes> byTotalMass(List<Mixes> list, boolean ascending) {
        Comparator<Mixes> comparator = Comparator
                .comparingDouble(MixUtils::getTotalMass);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }
}
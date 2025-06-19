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

    public static List<Mixes> byVolume(List<Mixes> list, boolean ascending) {
        return list.stream()
                .sorted((a, b) -> ascending
                        ? Double.compare(a.getVolume(), b.getVolume())
                        : Double.compare(b.getVolume(), a.getVolume()))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Mixes> byName(List<Mixes> list) {
        return list.stream()
                .sorted((a, b) -> a.getName().compareToIgnoreCase(b.getName()))
                .limit(5).collect(Collectors.toList());
    }
}

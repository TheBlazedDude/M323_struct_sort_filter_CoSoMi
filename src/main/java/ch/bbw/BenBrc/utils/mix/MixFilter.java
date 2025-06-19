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

    public static List<Mixes> byType(List<Mixes> list, String type) {
        return list.stream()
                .filter(m -> m.getType().equalsIgnoreCase(type))
                .limit(5).collect(Collectors.toList());
    }

    public static List<Mixes> byPreparationDate(List<Mixes> list, String prefix) {
        return list.stream()
                .filter(m -> m.getPreparationDate().startsWith(prefix))
                .limit(5).collect(Collectors.toList());
    }
}

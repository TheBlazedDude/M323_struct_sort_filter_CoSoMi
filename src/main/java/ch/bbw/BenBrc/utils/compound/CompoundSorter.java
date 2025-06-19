package ch.bbw.BenBrc.utils.compound;

import ch.bbw.BenBrc.models.Compounds;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.*;
/**
 * Sorts a list of compounds using different attribute combinations.
 * This utility class provides methods to sort compounds by various attributes such as name, CAS number, molecular mass, and creation date.
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class CompoundSorter {
    public static List<Compounds> byNameThenCASThenDate(List<Compounds> list, boolean ascending) {
        Comparator<Compounds> comparator = Comparator
                .comparing(Compounds::getName)
                .thenComparing(Compounds::getCasNumber)
                .thenComparing(Compounds::getCreatedAt);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Compounds> byMolecularMassThenIUPAC(List<Compounds> list, boolean ascending) {
        Comparator<Compounds> comparator = Comparator
                .comparingDouble(Compounds::getMolecularMass)
                .thenComparing(Compounds::getIUPACName);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Compounds> byCIDThenSMILES(List<Compounds> list, boolean ascending) {
        Comparator<Compounds> comparator = Comparator
                .comparingInt(Compounds::getCompound_CID)
                .thenComparing(Compounds::getSMILES);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Compounds> byMolecularWeight(List<Compounds> list, boolean ascending) {
        Comparator<Compounds> comparator = Comparator
                .comparingDouble(Compounds::getMolecularWeight);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Compounds> byCreatedAtThenName(List<Compounds> list, boolean ascending) {
        Comparator<Compounds> comparator = Comparator
                .comparing(Compounds::getCreatedAt)
                .thenComparing(Compounds::getName);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Compounds> byInChIThenCAS(List<Compounds> list, boolean ascending) {
        Comparator<Compounds> comparator = Comparator
                .comparing(Compounds::getInChI)
                .thenComparing(Compounds::getCasNumber);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }

    public static List<Compounds> byIUPACNameThenCID(List<Compounds> list, boolean ascending) {
        Comparator<Compounds> comparator = Comparator
                .comparing(Compounds::getIUPACName)
                .thenComparingInt(Compounds::getCompound_CID);
        if (!ascending) comparator = comparator.reversed();
        return list.stream()
                .sorted(comparator)
                .limit(5)
                .collect(Collectors.toList());
    }
}

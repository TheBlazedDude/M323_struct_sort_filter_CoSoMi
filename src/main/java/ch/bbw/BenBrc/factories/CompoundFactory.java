package ch.bbw.BenBrc.factories;

import ch.bbw.BenBrc.models.Compounds;

import java.util.*;
/**
 * Factory class to generate random Compounds.
 * This class creates a list of Compounds with random properties for testing purposes.
 * It generates a unique identifier, formula, and other attributes for each compound.
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class CompoundFactory {
    private static final Random random = new Random();

    public static List<Compounds> generateCompounds(int count) {
        List<Compounds> list = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            list.add(new Compounds(
                    i,
                    "Compound_" + i,
                    randomFormula(),
                    String.format("%03d-%02d-%1d", i, i % 100, i % 10),
                    "Generated compound " + i,
                    "CID" + i,
                    100 + random.nextDouble() * 200,
                    90 + random.nextDouble() * 150,
                    "InChIKey" + i,
                    "InChI=1S/C" + i + "Generated",
                    "C1=CC=CC=" + i,
                    new Date(),
                    "Generated IUPAC Name " + i
            ));
        }
        return list;
    }

    private static String randomFormula() {
        return "C" + (5 + random.nextInt(10)) +
                "H" + (5 + random.nextInt(15)) +
                (random.nextBoolean() ? "O" + random.nextInt(5) : "");
    }
}


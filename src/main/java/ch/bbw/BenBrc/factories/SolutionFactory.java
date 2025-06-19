package ch.bbw.BenBrc.factories;

import ch.bbw.BenBrc.models.*;

import java.util.*;
/**
 * Factory class to generate random Solutions from a list of Compounds.
 * This class creates a list of Solutions with properties derived from the Compounds.
 * It generates a unique identifier, name, formula, molecular weight, mass, SMILES, IUPAC name,
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class SolutionFactory {
    private static final Random random = new Random();

    public static List<Solutions> generateSolutionsFrom(List<Compounds> baseCompounds) {
        List<Solutions> list = new ArrayList<>();
        for (Compounds c : baseCompounds) {
            double weight = c.getMolecularWeight();
            double mass = weight + (random.nextDouble() * 0.02 - 0.01); // ±0.01 variation
            Calendar cal = Calendar.getInstance();
            cal.set(2025, Calendar.JUNE, random.nextInt(30) + 1);

            list.add(new Solutions(
                    c.getCompound_CID(),
                    c.getName() + "_Sol",
                    c.getFormula(),
                    weight,
                    mass,
                    c.getSMILES(),
                    c.getIUPACName(),
                    List.of(c.getName(), "Alt_" + c.getName()),
                    c.getInChIKey(),
                    "Organic compound",
                    cal.getTime()
            ));
        }
        return list;
    }
}


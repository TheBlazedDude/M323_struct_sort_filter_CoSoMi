package ch.bbw.BenBrc.services;

import ch.bbw.BenBrc.factories.*;
import ch.bbw.BenBrc.models.*;

import java.util.*;
/**
 * Total Random Data generator for evaluation, filter and sorting for Compounds, Solutions and Mixes
 * author: Benedict Brück
 * version: 1.0
 * date: 16.06.25
 */
public class DataGenerator {

    public static List<Compounds> generateCompounds() {
        return CompoundFactory.generateCompounds(100);
    }

    public static List<Solutions> generateSolutions(List<Compounds> compounds) {
        return SolutionFactory.generateSolutionsFrom(compounds);
    }

    public static List<Mixes> generateMixes(List<Solutions> solutions) {
        return MixFactory.generateMixesFrom(solutions);
    }

    public static void generateAllAndPrint() {
        List<Compounds> compounds = generateCompounds();
        List<Solutions> solutions = generateSolutions(compounds);
        List<Mixes> mixes = generateMixes(solutions);

        System.out.println("✅ Generated " + compounds.size() + " compounds.");
        System.out.println("✅ Generated " + solutions.size() + " solutions.");
        System.out.println("✅ Generated " + mixes.size() + " mixes.");

        System.out.println("\n📌 Example compound: " + compounds.get(0).getName());
        System.out.println("📌 Example solution: " + solutions.get(0).getName());
        System.out.println("📌 Example mix: " + mixes.get(0).getName());
    }
}


package ch.bbw.BenBrc.services;

import ch.bbw.BenBrc.factories.*;
import ch.bbw.BenBrc.models.*;

import java.util.*;
/**
 * DataGenerator class to create and manage chemical data.
 * author: Benedict Brück
 * version: 1.0
 * date: 16.06.25
 */
public class DataGenerator {

    /**
     * Generates 100 random Compounds with diverse and rich data.
     */
    public static List<Compounds> generateCompounds() {
        return CompoundFactory.generateCompounds(100);
    }

    /**
     * Wraps each Compound with a Solution-level context (e.g., added isotope like Deuterium).
     */
    public static List<Solutions> generateSolutions(List<Compounds> compounds) {
        return SolutionFactory.generateSolutionsFrom(compounds);
    }

    /**
     * Each Mix is created from several Solutions. Mix structure reflects associated Solution content.
     */
    public static List<Mixes> generateMixes(List<Solutions> solutions) {
        return MixFactory.generateMixesFrom(solutions);
    }

    /**
     * Generates all datasets and prints example objects for visual verification.
     */
    public static void generateAllAndPrint() {
        List<Compounds> compounds = generateCompounds();
        List<Solutions> solutions = generateSolutions(compounds);
        List<Mixes> mixes = generateMixes(solutions);

        System.out.println("✅ Generated " + compounds.size() + " compounds.");
        System.out.println("✅ Generated " + solutions.size() + " solutions.");
        System.out.println("✅ Generated " + mixes.size() + " mixes.");

        System.out.println("\\n📌 Example compound: " + compounds.get(0));
        System.out.println("📌 Example solution: " + solutions.get(0));
        System.out.println("📌 Example mix: " + mixes.get(0));
    }
}


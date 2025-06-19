package ch.bbw.BenBrc;

import ch.bbw.BenBrc.models.*;
import ch.bbw.BenBrc.services.*;
import ch.bbw.BenBrc.utils.compound.*;
import ch.bbw.BenBrc.utils.mix.*;
import ch.bbw.BenBrc.utils.solution.*;

import java.util.*;
/**
 * This is the main class for the CoSoMi application.
 * It serves as the entry point for the application, where data is generated, filtered, sorted, and displayed (limited by 5 per request).
 * author: Benedict Brück
 * version: 1.0
 * startDate: 13.06.25
 * FinalDate: 19.06.25
 */
public class CoSoMi {
    public static void main(String[] args) {
        // Step 1: Generate Data
        List<Compounds> compounds = DataGenerator.generateCompounds();
        List<Solutions> solutions = DataGenerator.generateSolutions(compounds);
        List<Mixes> mixes = DataGenerator.generateMixes(solutions);

        // Step 2: Filter & Sort Examples
        List<Compounds> topCompoundsByName = CompoundFilter.byName(compounds, "acid");
        List<Compounds> heaviestCompounds = CompoundSorter.byMolecularWeight(compounds, false);

        List<Solutions> organicSolutions = SolutionFilter.byClassification(solutions, "Organic compound");
        List<Solutions> lightestSolutions = SolutionSorter.byMass(solutions, true);

        List<Mixes> buffers = MixFilter.byType(mixes, "buffer");
        List<Mixes> largestMixes = MixSorter.byVolume(mixes, false);

        // Step 3: Print Example Output
        System.out.println("🔬 Filtered Compounds by Name:");
        topCompoundsByName.forEach(c -> System.out.println("- " + c.getName()));

        System.out.println("\n⚖️ Heaviest Compounds:");
        heaviestCompounds.forEach(c -> System.out.println("- " + c.getName() + ": " + c.getMolecularWeight()));

        System.out.println("\n🧪 Organic Solutions:");
        organicSolutions.forEach(s -> System.out.println("- " + s.getName()));

        System.out.println("\n💧 Largest Mixes:");
        largestMixes.forEach(m -> System.out.println("- " + m.getName() + ": " + m.getVolume() + " L"));
    }
}

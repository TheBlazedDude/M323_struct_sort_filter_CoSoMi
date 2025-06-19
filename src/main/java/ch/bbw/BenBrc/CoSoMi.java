package ch.bbw.BenBrc;

import ch.bbw.BenBrc.models.*;
import ch.bbw.BenBrc.services.ConsolePrinter;
import ch.bbw.BenBrc.services.DataGenerator;
import ch.bbw.BenBrc.utils.compound.*;
import ch.bbw.BenBrc.utils.mix.*;
import ch.bbw.BenBrc.utils.solution.*;
import ch.bbw.BenBrc.factories.*;

import java.util.*;
import java.util.stream.Collectors;

/**
 * This is the main class for the CoSoMi application.
 * It serves as the entry point for the application, where data is generated, filtered, sorted, and displayed.
 * author: Benedict Brück
 * version: 1.0
 * startDate: 13.06.25
 * FinalDate: 19.06.25
 */
public class CoSoMi {
    public static void main(String[] args) {
        // 🔄 Daten generieren
        List<Compounds> compounds = DataGenerator.generateCompounds();
        List<Solutions> solutions = DataGenerator.generateSolutions(compounds);
        List<Mixes> mixes = DataGenerator.generateMixes(solutions);

        // 🧪 COMPOUNDS
        ConsolePrinter.prettyPrintCompounds(
                CompoundSorter.byNameThenCASThenDate(compounds, true),
                "COMPOUND SORTIERUNG ⬆ Name → CAS → CreatedAt"
        );

        ConsolePrinter.prettyPrintCompounds(
                CompoundSorter.byMolecularMassThenIUPAC(compounds, false),
                "COMPOUND SORTIERUNG ⬇ Mol. Mass → IUPAC"
        );

        ConsolePrinter.prettyPrintCompounds(
                CompoundFilter.byNameContains(compounds, "5").stream().limit(5).collect(Collectors.toList()),
                "COMPOUND FILTER: Name enthält '5'"
        );

        // ⚗️ SOLUTIONS
        ConsolePrinter.prettyPrintSolutions(
                SolutionSorter.byNameThenMass(solutions, true),
                "SOLUTION SORTIERUNG ⬆ Name → Mass"
        );

        ConsolePrinter.prettyPrintSolutions(
                SolutionFilter.byClassificationContains(solutions, "organic").stream().limit(5).collect(Collectors.toList()),
                "SOLUTION FILTER: Classification enthält 'organic'"
        );

        // 🧫 MIXES
        ConsolePrinter.prettyPrintMixes(
                MixSorter.byTypeThenVolume(mixes, false),
                "MIX SORTIERUNG ⬇ Type → Volume"
        );

        ConsolePrinter.prettyPrintMixes(
                MixFilter.byTypeEquals(mixes, "buffer").stream().limit(5).collect(Collectors.toList()),
                "MIX FILTER: Type = 'buffer'"
        );
    }
}

package ch.bbw.BenBrc.services;

import ch.bbw.BenBrc.models.*;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Utility class for pretty-printing compound, solution, and mix data to the console.
 * This class formats and displays chemical data in a user-friendly way.
 * author: Benedict Brück & ChatGPT for pretty printing
 * version: 1.0
 * date: 19.06.25
 */
public class ConsolePrinter {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static void prettyPrintCompounds(List<Compounds> compounds, String title) {
        System.out.println("\n🔍 " + title + " (" + compounds.size() + " Treffer)");
        System.out.println("--------------------------------------------------");

        for (Compounds c : compounds) {
            System.out.println("✓ " + c.getName());
            System.out.println("   - CID:     " + c.getCompound_CID());
            System.out.println("   - CAS:     " + c.getCasNumber());
            System.out.println("   - Mass:    " + format(c.getMolecularWeight()));
            System.out.println("   - IUPAC:   " + c.getIUPACName());
            System.out.println("   - Created: " + format(c.getCreatedAt()));
            System.out.println();
        }
    }

    public static void prettyPrintSolutions(List<Solutions> solutions, String title) {
        System.out.println("\n🔍 " + title + " (" + solutions.size() + " Treffer)");
        System.out.println("--------------------------------------------------");

        for (Solutions s : solutions) {
            System.out.println("✓ " + s.getName());
            System.out.println("   - CID:       " + s.getCid());
            System.out.println("   - Formula:   " + s.getMolecularFormula());
            System.out.println("   - Weight:    " + format(s.getMolecularWeight()));
            System.out.println("   - Mass:      " + format(s.getMolecularMass()));
            System.out.println("   - IUPAC:     " + s.getIupacName());
            System.out.println("   - Class:     " + s.getClassification());
            System.out.println("   - Created:   " + format(s.getCreatedAt()));
            System.out.println();
        }
    }

    public static void prettyPrintMixes(List<Mixes> mixes, String title) {
        System.out.println("\n🔍 " + title + " (" + mixes.size() + " Treffer)");
        System.out.println("--------------------------------------------------");

        for (Mixes m : mixes) {
            System.out.println("✓ " + m.getName());
            System.out.println("   - Type:        " + m.getType());
            System.out.println("   - Volume:      " + format(m.getVolume()));
            System.out.println("   - Components:  " + m.getComponents().size());
            System.out.println("   - Prepared:    " + format(m.getPreparationDate()));
            System.out.println("   - Expires:     " + format(m.getExpirationDate()));
            System.out.println("   - Description: " + m.getDescription());
            System.out.println();

            for (Solutions s : m.getComponents()) {
                System.out.println("     • " + s.getName() + " (" + s.getMolecularFormula() + ")");
            }
            System.out.println();
        }
    }

    private static String format(Object obj) {
        if (obj == null) return "-";
        if (obj instanceof java.util.Date) return DATE_FORMAT.format(obj);
        if (obj instanceof Double) return String.format("%.2f", (Double) obj);
        return obj.toString();
    }
}

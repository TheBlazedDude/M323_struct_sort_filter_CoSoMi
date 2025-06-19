package ch.bbw.BenBrc.utils.mix;

import ch.bbw.BenBrc.models.Mixes;
import ch.bbw.BenBrc.models.Solutions;

/**
 * Utility class for Mixes.
 * Includes mass calculation from components.
 */
public class MixUtils {
    public static double getTotalMass(Mixes mix) {
        return mix.getComponents()
                .stream()
                .mapToDouble(Solutions::getMolecularMass)
                .sum();
    }
}
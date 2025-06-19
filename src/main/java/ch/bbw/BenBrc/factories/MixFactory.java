package ch.bbw.BenBrc.factories;

import ch.bbw.BenBrc.models.*;

import java.util.*;
/**
 * Factory class to generate random Mixes from a list of Solutions.
 * This class creates a list of Mixes with properties derived from the Solutions.
 * It generates a unique identifier, name, description, type, concentration,
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class MixFactory {
    private static final Random random = new Random();

    public static List<Mixes> generateMixesFrom(List<Solutions> allSolutions) {
        List<Mixes> mixes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Solutions s = allSolutions.get(random.nextInt(allSolutions.size()));
            mixes.add(new Mixes(
                    i + 1,
                    "Mix_" + (i + 1),
                    "Mix containing " + s.getName(),
                    randomType(),
                    0.01 + random.nextDouble() * 0.99,
                    "2025-06-" + (10 + random.nextInt(20)),
                    "2026-06-" + (10 + random.nextInt(20))
            ));
        }
        return mixes;
    }

    private static String randomType() {
        return Arrays.asList("solution", "suspension", "buffer").get(random.nextInt(3));
    }
}


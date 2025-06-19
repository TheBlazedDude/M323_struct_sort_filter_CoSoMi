package ch.bbw.BenBrc.factories;

import ch.bbw.BenBrc.models.*;

import java.util.*;

/**
 * Factory class to generate random Mixes from a list of Solutions.
 * Each Mix contains 2–4 Solutions, has a name, type, concentration and preparation date.
 * author: Benedict Brück
 * version: 1.0
 * date: 19.06.25
 */
public class MixFactory {
    private static final Random random = new Random();

    public static List<Mixes> generateMixesFrom(List<Solutions> allSolutions) {
        List<Mixes> mixes = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            int mixId = i;
            String name = "Mix_" + i;
            String type = randomType();
            String description = "Random " + type + " composed of various solutions.";
            double volume = 0.1 + random.nextDouble() * 99.9;

            // Select 2–4 unique Solutions randomly
            List<Solutions> components = new ArrayList<>();
            Collections.shuffle(allSolutions);
            for (int j = 0; j < Math.min(2 + random.nextInt(3), allSolutions.size()); j++) {
                components.add(allSolutions.get(j));
            }

            // preparationDate as Date
            Calendar prepCal = Calendar.getInstance();
            prepCal.set(2025, Calendar.JUNE, 10 + random.nextInt(20));
            Date preparationDate = prepCal.getTime();

            // expirationDate as Date
            Calendar expCal = Calendar.getInstance();
            expCal.set(2026, Calendar.JUNE, 10 + random.nextInt(20));
            Date expirationDate = expCal.getTime();

            mixes.add(new Mixes(
                    mixId,
                    name,
                    description,
                    type,
                    volume,
                    components,
                    preparationDate,
                    expirationDate
            ));
        }

        return mixes;
    }

    private static String randomType() {
        return Arrays.asList("solution", "suspension", "buffer").get(random.nextInt(3));
    }
}

package org.example.util;

import java.util.Random;

public final class RandomSequenceGenerator {

    private RandomSequenceGenerator() {}

    public static int[] generateIntArray(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Подбери значения в диапазоне [0; бесконечность)");
        }
        return new Random()
                .ints(size)
                .toArray();
    }
}

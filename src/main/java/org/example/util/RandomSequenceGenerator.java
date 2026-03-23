package org.example.util;

import java.util.ArrayList;
import java.util.List;
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

    public static List<Double> generateDoubleList(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Подбери значения в диапазоне [0; бесконечность)");
        }
        List<Double> list = new ArrayList<>(size);
        new Random().doubles(size).forEach(list::add);
        return list;
    }
}

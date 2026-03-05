package org.example.second;

import java.util.List;

public class SelectionSort {

    public void sort(List<Double> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(min)) {
                    min = j;
                }
            }
            if (min != i) {
                double temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }
        }
    }
}

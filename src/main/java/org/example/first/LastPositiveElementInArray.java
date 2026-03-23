package org.example.first;

public class LastPositiveElementInArray {

    public int findLastPositiveInArray(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                return array[i];
            }
        }
        return -1;
    }

}

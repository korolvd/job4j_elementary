package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        for (int index = 0; index < rsl.length; index++) {
            if (i < left.length && j < right.length) {
                if (left[i] < right[j]) {
                    rsl[index] = left[i];
                    i++;
                } else if (left[i] > right[j]) {
                    rsl[index] = right[j];
                    j++;
                } else {
                    rsl[index] = left[i];
                    rsl[index + 1] = left[i];
                    index++;
                    i++;
                    j++;
                }
            } else {
                if (i < left.length) {
                    rsl[index] = left[i];
                    i++;
                } else if (j < right.length) {
                    rsl[index] = right[j];
                    j++;
                }
            }
        }
        return rsl;
    }
}

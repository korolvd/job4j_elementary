package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int change = money - price;
        for (int i = 0; i < coins.length; i++) {
            change = Math.abs(change);
            while (change > 0) {
                change = change - coins[i];
                if (change >= 0) {
                    rsl[i] = coins[i];
                    size++;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
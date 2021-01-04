package ru.job4j.condition;

public class SqArea {

    public static double square(int p, int k) {
        double h = (double) p / (2 * (k + 1));
        double l = h * k;
        double rsl = l * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println("Если p = 6, а k = 2, то S = " + result1);
    }
}

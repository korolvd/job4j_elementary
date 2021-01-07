package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Сергей Сергеенко";
        names[1] = "Василий Васильев";
        names[2] = "Иван Иванов";
        names[3] = "Гендальф Серый";
        System.out.println("размер массива ages - " + ages.length);
        System.out.println("размер массива surnames - " + surnames.length);
        System.out.println("размер массива prices - " + prices.length);
        System.out.println();
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}

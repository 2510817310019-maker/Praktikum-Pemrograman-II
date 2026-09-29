package module01.problem05;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    static final double PI = 3.14;

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double radius = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        double height = input.nextDouble();

        double volume = PI * radius * radius * height;

        System.out.printf("Volume tabung dengan jari-jari %s cm dan tinggi %s cm adalah %.3f m3%n",
                radius, height, volume);
    }
}
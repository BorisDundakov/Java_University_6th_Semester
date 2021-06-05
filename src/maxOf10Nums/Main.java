package maxOf10Nums;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        int[] number = new int[10];

        numberDeclaration(number);
        printNumberDeclaration(number);
        maxNumber(number);

        System.out.println("Max: " + maxNumber(number));
    }

    private static void numberDeclaration(int[] number) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < number.length; i++) {
            System.out.printf("Number %d: ", i + 1);
            int num = Integer.parseInt(scanner.nextLine());
            number[i] = num;
        }
    }

    private static void printNumberDeclaration(int[] number) {

        for (int i = 0; i < number.length; i++) {
            System.out.printf("Number %d: %d\n", i + 1, number[i]);
        }
    }

    private static int maxNumber(int[] number) {
        Arrays.sort(number);

        return number[number.length - 1];
    }
}
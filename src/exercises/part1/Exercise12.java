package exercises.part1;

import java.util.Locale;
import java.util.Scanner;

/* 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/
public class Exercise12 {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro número: ");
        double number1 = input.nextDouble();

        System.out.println("Informe o segundo número: ");
        double number2 = input.nextDouble();

        System.out.println("Informe o terceiro número: ");
        double number3 = input.nextDouble();

        double average = (number1 + number2 + number3) / 3;

        System.out.printf("Average: %.2f",average);

        input.close();
    }
}
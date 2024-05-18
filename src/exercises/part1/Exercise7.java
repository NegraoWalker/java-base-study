package exercises.part1;

import java.util.Scanner;

/* 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.*/
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + number * i);
        }

        input.close();
    }
}

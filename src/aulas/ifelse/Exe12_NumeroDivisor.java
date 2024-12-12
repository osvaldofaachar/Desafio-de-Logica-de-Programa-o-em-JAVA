package aulas.ifelse;

import java.util.Scanner;

public class Exe12_NumeroDivisor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite O Primeiro Numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite O segundo Numero: ");
        num2 = scanner.nextInt();

        if (num1 % num2 == 0){
            System.out.println("O numero " + num2 + " é divisor de " + num1);
        } else if (num2 % num1 == 0) {
            System.out.println("O numero " + num1 + " é divisor de " + num2);
        } else if (num1 % num2 != 0) {
            System.out.println("O numero " + num2 + " não é divisor de " + num1);
        } else if (num2 % num1 != 0) {
            System.out.println("O numero " + num1 + " não é divisor de " + num2);
        }
    }
}

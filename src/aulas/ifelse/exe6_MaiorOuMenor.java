package aulas.ifelse;

import java.util.Scanner;

public class exe6_MaiorOuMenor {
    public static void main(String[] args) {

        double num1, num2;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero: ");
        num1 = scanner.nextDouble();

        System.out.println("Digite o Segundo Numero: ");
        num2 = scanner.nextDouble();

        if (num1 > num2){
            System.out.println("O Maior é: "+ num1 + " O Menor é: " + num2);
        }else {
            System.out.println("O Maior é: "+ num2 + " O Menor é: " + num1);
        }
    }
}

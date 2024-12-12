package aulas.ifelse;

import java.util.Scanner;

public class Exe8_OMaiorNumero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Primeiro Numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o Segundo Numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite o Terceiro Numero: ");
        double num3 = scanner.nextDouble();

        if (num1 > num2 && num1 > num3){
            System.out.println("Entre " + num1 + ", " + num2 + " e " + num3 + " o maior é : " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Entre " + num1 + ", " + num2 + " e " + num3 + " o maior é : " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Entre " + num1 + ", " + num2 + " e " + num3 + " o maior é : " + num3);
        }else {
            System.out.println("Os Numeros São Iguais");
        }
    }
}

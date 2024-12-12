package aulas.ifelse;

import java.util.Scanner;

public class exe4_ParOuImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um numero: ");
        int num = scanner.nextInt();

        if (num % 2 == 0){
            System.out.println("O numero é Par");
        }else {
            System.out.println("O numero é Impar");
        }
    }
}

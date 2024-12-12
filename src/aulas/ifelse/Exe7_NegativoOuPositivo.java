package aulas.ifelse;

import java.util.Scanner;

public class Exe7_NegativoOuPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num;


        System.out.println("Digite Um Numero: ");
        num = scanner.nextDouble();

        if (num > 0){
            System.out.println("o Numero " + num + " é Positivo");
        } else if (num < 0) {
            System.out.println("o Numero " + num + " é Negativo");
        }else {
            System.out.println("O Numero é Zero");
        }
    }
}

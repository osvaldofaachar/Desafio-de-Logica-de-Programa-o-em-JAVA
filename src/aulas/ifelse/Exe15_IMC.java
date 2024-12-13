package aulas.ifelse;

import java.util.Scanner;

public class Exe15_IMC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leitura dos dados do usuário
        System.out.print("Digite sua altura em metros (exemplo: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso em quilogramas (exemplo: 70): ");
        double peso = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Exibe o IMC
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // Classificação do IMC
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso.");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Classificação: Obesidade grau 1.");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Classificação: Obesidade grau 2.");
        } else {
            System.out.println("Classificação: Obesidade grau 3.");
        }

        scanner.close();
    }

}

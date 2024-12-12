package aulas.ifelse;

import java.util.Scanner;

public class Exe10_AjusteSalarial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float salarioInicial;

        System.out.println("Digite o Seu Salário: ");
        salarioInicial = scanner.nextFloat();

        if (salarioInicial < 5000){
            float ajusteSalarial = (salarioInicial * 10) / 100;
            float salarioAjustado = salarioInicial + ajusteSalarial;
            System.out.println("O Seu Salario Inicial é: " + salarioInicial + " MZN");
            System.out.println("O Ajuste foi de 10% equivalente a " + ajusteSalarial+ " MZN");
            System.out.println("O Salário Ajustado é: " + salarioAjustado+ " MZN");
        }else {
            System.out.println("O Seu Salário é " + salarioInicial + " MZN e não Precisa de Ajuste.");
        }
    }
}

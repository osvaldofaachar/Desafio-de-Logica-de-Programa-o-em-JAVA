package aulas.ifelse;

import java.util.Scanner;

public class Exe9_AprovadoOuReprovado {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a Sua Nota Final: ");
        double nota = scanner.nextDouble();

        if (nota >= 10){
            System.out.println("Aluno Aprovado");
        }else {
            System.out.println("Aluno Reprovado");
        }
    }
}

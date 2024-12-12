package aulas.variaveis;

import java.util.Scanner;

public class exe3 {

    public static void main(String[] args){

        double salario;

        Scanner sal = new Scanner(System.in);

        System.out.println("Digite o teu salário: ");
        salario = sal.nextDouble();

        double salarioReajustado = (salario * 1) / 100 + salario;

        System.out.println("O Seu Antigo Salário era: " + salario);
        System.out.println("O Seu Novo Salário é: " + salarioReajustado);


    }
}

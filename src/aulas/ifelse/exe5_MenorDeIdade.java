package aulas.ifelse;

import java.util.Scanner;

public class exe5_MenorDeIdade {

    public static void main(String[] args) {
        int idade;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        idade = scanner.nextInt();

        if (idade <= 17){
            System.out.println("Voce é menor de idade!");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Voce é Maior de Idade!");
        }else {
            System.out.println("Voce é Idoso!");
        }
    }

}

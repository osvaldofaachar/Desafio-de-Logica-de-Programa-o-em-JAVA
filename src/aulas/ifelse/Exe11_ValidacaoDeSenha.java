package aulas.ifelse;

import java.util.Scanner;

public class Exe11_ValidacaoDeSenha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String senhaCorreta = "osvaldo";

        System.out.println("Digite a Senha: ");
        String senha = scanner.nextLine();

        if (senha.equals(senhaCorreta)){
            System.out.println("Bem Vindo ao Sistema de Desafios!!!");
        }else {
            System.out.println("Senha Incorrecta, tente novamente.");
        }
    }
}

package aulas.ifelse;

import java.util.Scanner;

public class Exe13_VogalOuConsoante {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char letra;

        System.out.println("Digite uma letra qualquer: ");
        letra = scanner.next().charAt(0);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("A Letra " + letra + " é uma vogal.");
        }else {
            System.out.println("A Letra " + letra + " é uma consoante.");
        }
    }
}

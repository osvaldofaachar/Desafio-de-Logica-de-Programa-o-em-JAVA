package aulas;

import java.util.Scanner;

public class exe1 {
    public static void main(String[] args){
        int idadeEmDias;
        final int ano = 365;
        final int mes = 30;


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de anos: ");
        int anosInformado = sc.nextInt();
        System.out.println("Digite o número de meses: ");
        int mesesInformado = sc.nextInt();
        System.out.println("Digite o número de dias: ");
        int diasInformado = sc.nextInt();

        idadeEmDias = (anosInformado * ano) + (mesesInformado * mes)  + diasInformado;

        System.out.println("Tens um total de " + idadeEmDias + " dias de idade!");
    }
}

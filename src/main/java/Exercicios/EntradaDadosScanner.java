package Exercicios;

import java.util.Scanner;

public class EntradaDadosScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, media, faltas, exame, mediaFinal;
        System.out.println("Calculo da Média");

//Entrada de Dados
        System.out.println("Nota 1: ");
        n1 = sc.nextFloat();
        System.out.println("Nota 2: ");
        n2 = sc.nextFloat();
        System.out.println("Digite a Quantidade de faltas: ");
        faltas = sc.nextFloat();

//Processamento          
        media = (n1 + n2) / 2;
        if (media >= 6 && faltas <= 18) {
            System.out.println("Aprovado!");
            System.out.println("Média : " + media);
        } else if (faltas > 18) {
            System.out.println("Reprovado");
            System.out.println("Média : " + media);
        } else {
            System.out.println("Precisa fazer exame!!! "+"Sua média : "+ media);
            System.out.println("Digite a nota do exame: ");
            exame = sc.nextFloat();
            mediaFinal = (n1 + n2 + exame) / 3;
            if (mediaFinal >= 6) {
                System.out.println("Aprovado definitivo");
                System.out.println("Média final : " + mediaFinal);
            } else {
                System.out.println("Reprovado definitivo");
            }
        }
    }
//Saída de Dados       
    //  System.out.println("Média: " + mediaFinal);
}

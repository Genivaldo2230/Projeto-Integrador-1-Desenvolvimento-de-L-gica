package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numContador = 0, soma = 0, media;
        System.out.println("Números pares :");

        for (int num = 13; num <= 73; num++) {
            if (num % 2 == 0) {
                System.out.println(" número par ! " + num);
                numContador++;
                soma += num;
            }
        }
        media = soma / numContador;
        System.out.println("Média: " + media);
    }
}

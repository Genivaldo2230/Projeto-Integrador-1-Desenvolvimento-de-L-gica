//RESOLVIDO
package Exercicios;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1, n2, resultado;

        System.out.println("Digite os números que serão divididos: ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();

        if (n1 > n2) {
            resultado = n1 / n2;
        } else {
            resultado = n2 / n1;
        }
        System.out.println("O resultado é " + resultado);
    }
}

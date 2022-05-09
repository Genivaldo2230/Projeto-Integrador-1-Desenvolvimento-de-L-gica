//RESOLVIDO
package Exercicios;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1;

        System.out.println("Digite o número: ");
        n1 = sc.nextInt();

        if (n1 < 0) {
            System.out.println("Número negativo");
        } else {
            System.out.println("Número positivo");
        }
    }
}

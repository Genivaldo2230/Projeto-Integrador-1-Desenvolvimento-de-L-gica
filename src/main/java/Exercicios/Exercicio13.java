//RESOLVIDO
package Exercicios;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Digite o 1º número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o 2º número: ");
        n2 = sc.nextInt();
        System.out.println("Digite o 3º número: ");
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n3);
        }
    }
}

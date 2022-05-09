//RESOLVIDO
package Exercicios;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, n4, media;
        System.out.println("Média");

        System.out.println("Digite o 1º número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o 2º número: ");
        n2 = sc.nextInt();
        System.out.println("Digite o 3º número: ");
        n3 = sc.nextInt();
        System.out.println("Digite o 4º número: ");
        n4 = sc.nextInt();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média é  " + media);

    }

}

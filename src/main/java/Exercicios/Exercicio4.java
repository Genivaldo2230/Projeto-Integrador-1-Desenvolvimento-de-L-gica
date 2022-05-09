//RESOLVIDO
package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1, n2;
        System.out.println("Resultado");

        System.out.println("Digite o 1º número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o 2º número: ");
        n2 = sc.nextInt();
        n1 = n1 + 1;
        n2 = n2 + 1;

        System.out.println("O número consecutivo é " + n1);
        System.out.println("O número consecutivo é " + n2);
    }

}

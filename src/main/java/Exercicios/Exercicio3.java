//RESOLVIDO
package Exercicios;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float n1, n2, resultado;
        System.out.println("Resultado");

        System.out.println("Digite o 1º número: ");
        n1 = sc.nextFloat();
        System.out.println("Digite o 2º número: ");
        n2 = sc.nextFloat();

        resultado = (n1 * n1) + (n2 * n2);
        System.out.println("O resultado é " + resultado);
    }

}

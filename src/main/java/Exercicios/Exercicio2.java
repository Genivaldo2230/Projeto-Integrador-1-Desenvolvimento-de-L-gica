//RESOLVIDO
package Exercicios;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float base, expoente;
        System.out.println("Resultado");

        System.out.println("Digite o número de base: ");
        base = sc.nextFloat();
        System.out.println("Digite o número expoente: ");
        expoente = sc.nextFloat();
        // Resultado = Math.pow(base, expoente);

        double Resultado = Math.pow(base, expoente);

        System.out.println("O resultado é " + Resultado);
    }
}

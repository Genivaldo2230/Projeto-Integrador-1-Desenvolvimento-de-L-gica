package Aula2;

import java.util.Scanner;

public class Exemplo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Início: ");
        int i = sc.nextInt();
        System.out.println("Fim: ");
        int f = sc.nextInt();
        if (i < f) {
            System.out.printf("%d E menor que %d ", i, f);
        } else {
            while (i >= f) {
                if (i % 2 == 0) {
                    System.out.println("i: " + i);
                    i--;
                }
            }
        }
        System.out.println("Fora do laço");
    }
}

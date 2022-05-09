package Aula2;

import java.util.Scanner;

public class Dowhile2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, soma = 0, i = 0;

        while (i < 10) {
            System.out.println("Digite um número ");
            x = sc.nextInt();
            if (x < 0) {
                break;
            }
            soma += x;
            i++;
        }
        System.out.println("Total " + soma);
    }
}

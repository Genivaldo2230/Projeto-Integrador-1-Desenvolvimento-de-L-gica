package Aula2;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        System.out.println("Escolha apenas as opções a seguir :");
        do {
            System.out.println("1-Adição");
            System.out.println("2-Subtração");
            System.out.println("3-multiplicação");
            System.out.println("4-divisão");
            System.out.println("Opção: ");
            op = input.nextInt();
        } while (op > 4 || op < 1);

    }
}

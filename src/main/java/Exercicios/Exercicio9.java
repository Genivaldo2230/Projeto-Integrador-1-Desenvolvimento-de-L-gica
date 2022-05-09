package Exercicios;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        float n3, n4;
        String mensagem1 = "Elvis Ederson Martins de Andrade";

        System.out.println("Digite o número de cadastro: ");

        n1 = sc.nextInt();

        if (n1 == 1) {
            System.out.println("O nome do funcionário: " + mensagem1);
            System.out.println("Digite o salário do funcionário:");
            n3 = sc.nextInt();
            System.out.println("Digite a quantidade de horas trabalhadas:");
            n2 = sc.nextInt();
            n3 = n3 / n2;
            n4 = n3 * n2;
            System.out.println("O salário hora é de " + n3);
            System.out.println("O salário do funcionário é " + mensagem1 + " " + n4);
            n4 = sc.nextFloat();
        } else {
            System.out.println("Tente novamente");
        }
    }
}

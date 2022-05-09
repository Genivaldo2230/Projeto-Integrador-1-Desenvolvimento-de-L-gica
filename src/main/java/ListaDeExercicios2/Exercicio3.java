package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(" Digite um número :");
        num = sc.nextInt();

        for (int n = 1; n <= 10; n= n+1) {
           num = n+1;
            System.out.println("número " + num);

        }
    }

}

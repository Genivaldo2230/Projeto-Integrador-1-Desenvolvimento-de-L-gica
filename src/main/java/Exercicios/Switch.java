package Exercicios;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        int nota1, nota2, media;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira nota : ");
        nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota : ");
        nota2 = sc.nextInt();

        media = (nota1 + nota2) / 2;
        System.out.print("A média é : " + media + " ");

        switch (media) {
            case 10:
            case 9:
                System.out.print("Conceito A");
                break;
            case 8:
                System.out.print("Conceito B");
                break;
            case 7:
                System.out.print("Conceito C");
                break;
            case 6:
                System.out.print("Conceito D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.print("Conceito E");
                break;
        }

    }

}

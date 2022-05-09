package Exercicios;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        int nota1, nota2, media;
        Scanner sc = new Scanner(System.in);
        char grade;

        System.out.println("Digite a primeira nota : ");
        nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota : ");
        nota2 = sc.nextInt();

        media = (nota1 + nota2) / 2;
        System.out.print("A média é : " + media + " ");

        if (media >= 9) {
            grade = 'A';
        }
        else if (media >= 8 && media < 9){
        grade = 'B';
        }
        else if (media >= 7 && media < 8){
        grade = 'C';
        }
        else if (media >= 6 && media < 7){
        grade = 'D';
        }
        
    }

    }

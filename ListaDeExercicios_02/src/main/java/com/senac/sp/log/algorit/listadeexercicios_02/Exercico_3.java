package com.senac.sp.log.algorit.listadeexercicios_02;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author gda_a
 */
public class Exercico_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x[] = new int[10];
        int i, n;
        int maior = 0;

        for (i = 0; i < x.length; i++) {

            System.out.print("\t" + (i + 1) + "Digite numero:");

            n = sc.nextInt();
            if (n > maior) {
                maior = n;
            }
        }
        System.out.println("Maior é: " + maior);
    }

}

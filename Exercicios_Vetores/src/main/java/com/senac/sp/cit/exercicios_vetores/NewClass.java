/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sp.cit.exercicios_vetores;

import java.util.Random;

/**
 *
 * @author gda_a
 */
public class NewClass {

    public static void main(String[] args) {
        int[] vetor = new int[15];

        for (int i = 0; i < vetor.length; i++) {

            int random = new Random().nextInt(9);
            vetor[i] = random;
        }

        for (int i = 0; i < vetor.length; i++) {

        }

        for (int c = 1; c < vetor.length; c++) {
            int i = 0;
            for (int j = 0; j < i; j++) {
                if (vetor[i] > vetor[j]) {
                   
                }
            }
 System.out.println(vetor[i]);

        }
    }
}

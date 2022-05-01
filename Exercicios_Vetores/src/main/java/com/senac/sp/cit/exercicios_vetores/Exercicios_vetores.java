package com.senac.sp.cit.exercicios_vetores;

import java.util.Random;

/**Verificar quais são os números que não se repetem, portanto, a saída do 
programa deverá demostrar a quantidade de números não repetidos e quais são eles 
em ordem crescente. Exemplo de saída: Array Gerado: [5,4,9,5,3,6,7,5,7,3,9,8,1,7,1]
Quantidade de números sem repetição: 3
Números:
4
6
8
 * @author gda_a
 */
public class Exercicios_vetores {

    public static void main(String[] args) {

        int[] vetor = new int[15];

        for (int i = 0; i < vetor.length; i++) {

            int random = new Random().nextInt(9);
            vetor[i] = random;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }

    }
}

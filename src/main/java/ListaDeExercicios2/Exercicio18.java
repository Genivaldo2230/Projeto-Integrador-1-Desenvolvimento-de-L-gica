package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = 0;    //número atual
        int numB = 0;   //número anterior

        for (int num = 0; num <= 46; num++) {
            if (num == 1) {
                numA = 1;
                numB = 0;
            } else {
                numA += numB;
                numB = numA - numB;
            }
        }
        System.out.println("teste Num A " + numA);
        System.out.println("teste Num B " + numB);
        
    }
}

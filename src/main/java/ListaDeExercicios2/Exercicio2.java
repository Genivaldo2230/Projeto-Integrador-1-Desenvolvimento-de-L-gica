//Não resolvido ainda.
package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
        int resultado = 0;

        System.out.println("Digite o número N :");
        int n = sc.nextInt();
        while (num > n) {
            
            resultado = resultado + num;
            num++;
        }

    }

}

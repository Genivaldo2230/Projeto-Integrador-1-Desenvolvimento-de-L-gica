package ADO_09052022;

import java.util.Scanner;

public class Massa {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float altura, peso, massa;

        System.out.println("Digite o seu paso : ");
        peso = sc.nextFloat();

        System.out.println("Digite sua altura : ");
        altura = sc.nextFloat();

        massa = peso / (altura * altura);

        if (massa < 18.50) {
            System.out.println("Você apresenta estar com Magreza e o resultado do seu IMC é : " + massa);
        } else if (massa > 18.50 && massa < 24.90) {
            System.out.println("Você apresenta estar Normal e o resultado do seu IMC é : " + massa);
        } else if (massa > 24.90 && massa < 30.00) {
            System.out.println("Você apresenta estar com Magreza e o resultado do seu IMC é : " + massa);
        } else {
            System.out.println("Você apresenta estar com Magreza e o resultado do seu IMC é : " + massa);
        }

    }

}

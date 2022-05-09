package ListaDeExercicios2;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario, user;
        int senha, pwd;

// Dados armazenados para seres validados
        user = "Elvis";
        pwd = 2002;
        int cont = 2;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Usuário: ");
            usuario = sc.next();
            System.out.println("Senha: ");
            senha = sc.nextInt();

            if (usuario.equals(user) && senha == pwd) {
                System.out.println("Acesso Permitido!");
                break;
            } else {
                System.out.println("Senha Invalida!");
                System.out.println("Você tem " + cont-- + " chance(s)");
            }
        }
        System.out.println("Fora do laço de repetição");
    }
}

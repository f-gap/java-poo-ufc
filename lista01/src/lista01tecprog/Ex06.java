package lista01tecprog;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Senha: ");
            String senha = scanner.nextLine();
            if (senha.equals("1234")) {
                break;
            }
            System.out.println("Acesso negado! Tente novamente.");
        }
        System.out.println("Acesso permitido!");
    }
}

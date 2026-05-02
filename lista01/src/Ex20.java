

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "senha";
        for(int i = 0;i<3;i++) {
        	System.out.print("SENHA: ");
        	String resposta = scanner.nextLine();
        	if(resposta.equals(senha)) {
        		System.out.println("SENHA CORRETA");
        		return;
        	}
        	else {
        		System.out.println("SENHA INCORRETA");
        	}
        }
        System.out.println("SENHA INCORRETA FOI DIGITADA 3 VEZES. TENTE MAIS TARDE.");
    }
}
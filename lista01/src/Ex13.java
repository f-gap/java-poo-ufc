

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valor = 1000;
        while(true) {
        	System.out.println("VALOR EM CONTA: " + valor + "R$");
        	System.out.println("[1] - DEPOSITAR");
        	System.out.println("[2] - SACAR");
        	System.out.println("[3] - SAIR");
        	System.out.print("Escolha: ");
        	int opcao = Integer.valueOf(scanner.nextLine());
        	if(opcao == 1)
        	{
        		System.out.print("Valor do depósito: ");
        		double x =  Double.valueOf(scanner.nextLine());
        		valor += x;
        	}
        	else if (opcao == 2) {
        		System.out.print("Valor do saque: ");
        		double x =  Double.valueOf(scanner.nextLine());
        		valor -= x;
        	}
        	else if (opcao == 3) {
        		System.out.println("Obrigado por usar o programa!");
        		break;
        	}
        	else {
        		System.out.println("Opção inválida!");
        	}
        }
    }
}
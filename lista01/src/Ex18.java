

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double soma=0,numFuncionarios=0,acima2000=0;
		while (true) {
			System.out.print("Salário:");
			double salario = Double.valueOf(scanner.nextLine());
			if(salario == 0) {
				break;
			}
			soma += salario;
			if(salario>2000) {
				acima2000++;
			}
			numFuncionarios++;
		}
		System.out.println("A média salarial é " + (soma/numFuncionarios));
		System.out.println("O número de funcionários com salários acima de 2000 é: " + acima2000);		
	}

}

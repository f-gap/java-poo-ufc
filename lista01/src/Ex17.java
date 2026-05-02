

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int random = 83;
		System.out.print("Tente acertar o número secreto: ");
		while (true) {
			int resposta = Integer.valueOf(scanner.nextLine());
			if (resposta == random) {
				break;
			}
			else if(resposta > random) {
				System.out.println("O valor informado é maior que o número secreto");
			}
			else {
				System.out.println("O valor informado é menor que o número secreto");
			}
		}
		System.out.println("Você acertou! o número certo era " + random);
	}

}

package lista01tecprog;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lado = Integer.valueOf(scanner.nextLine());
		for(int i=0;i<lado;i++) {
			for(int j=0;j<lado;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

package lista01tecprog;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota do " + (i+1) + "° aluno: ");
            double n = Double.valueOf(scanner.nextLine());
            nota += n;
        }
        System.out.println("Média: " + nota/5.0);
    }
}

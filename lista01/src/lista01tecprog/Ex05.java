package lista01tecprog;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número: ");
        int valor = Integer.valueOf(scanner.nextLine());
        System.out.print(parOuImpar(valor) + " e " + sinal(valor));
    }

    public static String parOuImpar(int number) {
        if(number % 2 == 0) {
            return "Par";
        }
        else {
            return "Ímpar";
        }
    }

    public static String sinal(int number) {
        if(number > 0) {
            return "Positivo.";
        }
        else if (number < 0) {
            return "Negativo.";
        }
        else {
            return "Nulo.";
        }
    }
}

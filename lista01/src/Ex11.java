

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maior = 0,menor = 2147483647;
        for (int i = 0; i<10; i++) {
            System.out.printf("Nota n°%d: ", i+1);
            double nota = Double.valueOf(scanner.nextLine());
            if (nota > maior) {
                maior = nota;
            }
            if (nota < menor) {
                menor = nota;
            }
        }
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}
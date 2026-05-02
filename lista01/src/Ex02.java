

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Consumo: ");
        double valor = Double.valueOf(scanner.nextLine());
        if(valor > 300) {
            System.out.println("Consumo alto!");
        }
        else if (valor > 150) {
            System.out.println("Consumo moderado!");
        }
        else {
            System.out.println("Consumo baixo!");
        }
    }
}

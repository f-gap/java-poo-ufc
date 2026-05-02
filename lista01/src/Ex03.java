

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperatura em °Celsius: ");
        double valor = Double.valueOf(scanner.nextLine());
        if(valor > 30) {
            System.out.println("Calor!");
        }
        else if (valor > 19) {
            System.out.println("Conforto térmico!");
        }
        else {
            System.out.println("Frio!");
        }
    }
}

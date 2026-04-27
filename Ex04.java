import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Valor do produto: ");
        double valor = Double.valueOf(scanner.nextLine());
        if(valor >= 100) {
            valor -= valor * 0.1;
        }
        System.out.println("Valor a ser pago: " + valor);
    }
}

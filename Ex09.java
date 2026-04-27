import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        double soma = 0;
        Scanner scanner = new Scanner(System.in);
        while(true) {
            double valor = Double.valueOf(scanner.nextLine());
            if (valor == 0) {
                break;
            }
            soma += valor;
        }
        System.out.println("Soma: " + soma);
    }
}

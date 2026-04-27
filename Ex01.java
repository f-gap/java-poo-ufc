import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota final: ");
        double valor = Double.valueOf(scanner.nextLine());
        if(valor > 7) {
            System.out.println("Aprovado!");
        }
        else if (valor > 5) {
            System.out.println("Recuperação!");
        }
        else {
            System.out.println("Reprovado!");
        }
    }
}

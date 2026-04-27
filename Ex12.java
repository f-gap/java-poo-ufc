import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int aprovadas = 0,defeituosas = 0;
        for (int i = 0; i<10; i++) {
            System.out.printf("Peça n°%d (digite 1 ou 0): ", i+1);
            int nota = Integer.valueOf(scanner.nextLine());
            if (nota == 1) {
                aprovadas++;
            }
            else if (nota == 0) {
                defeituosas++;
            }
        }
        System.out.println("N° de defeituosas: " + defeituosas);
    }
}
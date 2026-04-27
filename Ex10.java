import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A=0,B=0;
        while(true) {
            int escolha = Integer.valueOf(scanner.nextLine());
            if (escolha == 1) {
                A++;
            }
            else if (escolha == 2) {
                B++;
            }
            else if (escolha == 0) {
                break;
            }
        }
        if(A>B) {
            System.out.println("O vencedor foi o candidato A");
        }
        else {
            System.out.println("O vencedor foi o candidato B");
        }
    }
}
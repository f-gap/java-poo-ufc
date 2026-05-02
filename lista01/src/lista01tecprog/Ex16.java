package lista01tecprog;

public class Ex16 {
	public static void main(String[] args) {
		System.out.println("Números primos de 1 a 100: ");
		for(int i = 2; i < 100; i++) {
			for(int j = 2;j<100;j++) {
				if(i%j == 0) {
					if(i!=j) {
						break;
					}
				}
				if(j == 99) {
					System.out.println(i);
				}
			}
		}
	}
}

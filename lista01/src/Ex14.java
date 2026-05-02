

public class Ex14 {
	public static void main(String[] args) {
		double habitantes = 1000;
		int anos = 0;
		System.out.println("População inicial: " + habitantes);
		while (habitantes < 5000) {
			habitantes += habitantes*(0.03);
			anos++;
		}
		System.out.println("Anos necessários para a população atingir/superar 5.000 habitantes: " + anos);
	}
}

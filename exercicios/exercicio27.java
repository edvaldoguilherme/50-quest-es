import java.util.Scanner;

public class exercicio27 {
	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int med = 0;
		int soma = 0;
		double media = 0;

		for (int c = 0; c < 4.; c++) {
			System.out.println(c + 1 + "° Medição: ");
			med = ent.nextInt();

			if (med < 110) {
				System.out.println(med + " NORMAL");
				soma += med;
			} else if (med >= 100 && med <= 125) {
				System.out.println(med + " ALTERADA");
				soma += med;
			} else {
				System.out.println(med + " MUITO ALTA");
				soma += med;
			}
		}
		media = (soma / 4);
		System.out.println("MÉDIA DAS LEITURAS " + media);
		
}

}

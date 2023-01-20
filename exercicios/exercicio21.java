import java.util.Scanner;
import java.util.Arrays;

public class exercicio21 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		int[] ano = new int[3];
		double[] velocidade = new double[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("Ano do " + (i + 1) + " carro");
			ano[i] = ent.nextInt();
			System.out.println("Velocidade do " + (i+ 1) + " carro");
			velocidade[i] = ent.nextDouble();
		}

		Arrays.sort(ano);
		Arrays.sort(velocidade);

		System.out.println("ANO DO CARRO MAIS NOVO: " + ano[2]);
		System.out.println("MAIOR VELOCIDADE: " + velocidade[2]);
	
	
	
	
	
	
	
	
	
	
	
	
	
}

}
    

import java.util.Scanner;

public class exercicio20 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		double desconto = 0;
		double valor = 0;

		System.out.println("Código do bairro [s/i/t]");
		String bairro = ent.next();
		System.out.println("Valor da renda: ");
		double renda = ent.nextDouble();
		System.out.println("Valor do consumo: ");
		double consumo = ent.nextDouble();

		if (bairro.equals("s")) {
			bairro = "s";
		} else if (bairro.equals("i")) {
			bairro = "i";

		} else if (bairro.equals("t")) {
			bairro = "t";
		} else {
			bairro = "BAIRRO INVÁLIDO";

		}

		if (bairro == "s") {
			if (renda >= 50 && renda <= 500) {
				desconto = 50;

			} else if (renda >= 500 && renda <= 1000) {
				desconto = 25;
			}
		} else if (bairro == "i") {
			if (renda >= 240 && renda <= 1000) {
				desconto = 240;
			} else if (renda >= 1000 && renda <= 5000) {
				desconto = 120;
			}
		} else {
			if (renda >= 5000 && renda <= 10000) {
				desconto = 720;
			} else if (renda >= 1000 && renda <= 20000) {
				desconto = 360;
			}
		}

		valor = (consumo - desconto);

		if (renda < 0 || consumo < 0) {
			System.out.println("RENDA OU CONSUMO NÃO PODEM SER NEGATIVOS");
		} else if (bairro == "BAIRRO INVÁLIDO") {
			System.out.println(bairro);
		}else {
			System.out.println("VALOR DA CONTA R$" + valor);
		}
	}

}

import java.util.Scanner;

public class exercicio32 {public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int X = 0,fuel,customerAlcohol = 0,customerGasolin = 0,customerDisel = 0,contador=0,y=0; 
		int w = 0;
		int z=0;
		int somaw=0;
		int somay=0;
		int somaz=0;
		
		while (contador<5) {
			System.out.println("Tipo de combustível: ");
			X = teclado.nextInt();
			if (X == 1) {
				System.out.println("Quantidade de litros");
				y=teclado.nextInt();
				customerAlcohol+=1;
				somay+=y;
			}else if (X == 2) {
				System.out.println("Quantidade de litros");
				w=teclado.nextInt();
				customerGasolin += 1;
				somaw+=w;
				
			}else if (X == 3) {
				System.out.println("Quantidade de litros");
				z=teclado.nextInt();
				customerDisel += 1;
				somaz+=z;
			}
			contador++;
		}
		System.out.println("Alcool: "+customerAlcohol+" Quantidade de litros "+somay);
		System.out.println("Gasolina: "+customerGasolin+" Quantidade de litros "+somaw);
		System.out.print("Diesel: "+customerDisel+" Quantidade de litros "+somaz);


teclado.close();

}}
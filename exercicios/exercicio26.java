import java.util.Scanner;

public class exercicio26 {public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);
	
	double altura=0;
	int idade=0;
	int contador=0;
	
	System.out.println("Altura: ");
	altura=ent.nextDouble();
	
	System.out.println("Idade: ");
	idade=ent.nextInt();
	
	if (altura>=1.5 && idade>=12) {
		contador++;	
	}
	if (altura>=1.4 && idade>=14) {
			contador++;
	}
	if (altura>1.7 || idade>16) {
				contador++;
	}
	
	System.out.println(contador);
	
	
	
	
	
	
	
	
}

}

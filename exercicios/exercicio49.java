import java.util.Scanner;

public class exercicio49 {public static void main(String[] args) {
	
	Scanner ent = new Scanner(System.in);
	
	    double peso, altura, imc;

	   System.out.println("Digite seu peso ");
	    peso=ent.nextDouble();
	    
	    System.out.println("Digite a altura ");
	    altura=ent.nextDouble();
	    
	    

	    imc=peso / (altura * altura);

	   
	   if(imc >= 20 && imc < 25){
	    	System.out.println("IMC = "+imc+ " Peso normal" );}

	    else if(imc >= 25 && imc < 30){
	    	System.out.println("IMC = "+imc+ " Sobrepeso" );}

	    else if(imc >= 30 && imc < 40){
	    	System.out.println("IMC = "+imc+ " Obeso" );}

	    else if(imc>40){
	    	System.out.println("IMC = "+imc+ " Obeso mórbido" );}
	   
	}

	
	
	
	
	
	
}
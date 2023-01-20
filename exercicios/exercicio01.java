import java.util.Scanner;


public class exercicio01 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("digite sua primeira nota");
        double nota1 = sc1.nextDouble();
        System.out.println("digite sua segunda nota");
        double nota2 = sc1.nextDouble();
        double media = ((nota1*3.5)+(nota2*7.5))/11;
        System.out.printf("MÉDIA: %.4f %n", media);
        sc1.close();


    }
    
}

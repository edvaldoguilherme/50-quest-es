import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("quantos km voce percorreu?");
        Double km = entrada.nextDouble();
        System.out.println("quantos litros você gastou?");
        Double litros = entrada.nextDouble();
        double consumo = km/litros;
        System.out.printf("consumo foi de: %.3f", consumo);
        System.out.println(" KM/L");


        entrada.close();
    }
}

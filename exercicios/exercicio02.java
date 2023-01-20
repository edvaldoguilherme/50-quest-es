import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("qual seu numero, funcionario?");
        entrada.nextInt();
        System.out.println("quantas horas você trabalha por mês?");
        int horas = entrada.nextInt();
        System.out.println("qual valor você ganha por hora");
        double valorhora = entrada.nextDouble();
        double conta = horas*valorhora;
        System.out.printf("o valor do salario do funcionarioe é de: %.2f %n",conta);
        entrada.close();

    }
    
}

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("qual seu nome, funcionario?");
        String nome = entrada.nextLine();
        System.out.println("qual seu salario fixo, "+nome+"?");
        Double fixo = entrada.nextDouble();
        System.out.println("por ultimo, quanto em vendas fez esse mês, "+nome+"?");
        Double vendas = entrada.nextDouble();
        Double conta = (((vendas*15)/100)+fixo);
        System.out.printf("seu salário total esse mês foi de: %.2f", conta);

 entrada.close();
    }
    
}

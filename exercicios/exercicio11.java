import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
    Scanner ent = new Scanner(System.in);
    System.out.println("digite a hora de inicio do jogo");
    int inicio = ent.nextInt();
    System.out.println("digite a hora de final do jogo");
    int fim = ent.nextInt();
    int soma = 0;

    if(inicio>=0 && inicio<=23 && fim>=0 && fim<=23){
        if(inicio<fim){
            soma= fim-inicio;
            System.out.println("durou: "+soma+" horas.");
            
        }
        else if(fim<inicio){
            soma=24-inicio+fim;
            System.out.println("durou: "+soma+" horas.");
        }
        else if(inicio==00 && fim==0){
            System.out.println("durou 24 horas.");
        }
        else{
            System.out.println("não podemos apresentar horas iguais.");
        }
    }
    else{
        System.out.println("valores não correspondem com horas diarias");
    }
    ent.close();
    }
}

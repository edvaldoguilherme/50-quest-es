import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner ent= new Scanner(System.in);
        System.out.println("digite seu salario atual");
        double salario= ent.nextDouble();
        Double percent;
        Double soma;
        if(salario>500){
            percent=salario+(salario*10/100);
            System.out.println("seu salario total é de: "+percent);
        }
        else if(salario>300 && salario<=500){
            percent=salario+(salario*7/100);
            System.out.println("seu salario total é de: "+percent);
        }
        else if(salario>0 && salario<=300){
            percent=salario+(salario*5/100);
            System.out.println("seu salario total é de: "+percent);
        }
        else{
            System.out.println("valor invalido");
        }
        ent.close();
    }
    
}

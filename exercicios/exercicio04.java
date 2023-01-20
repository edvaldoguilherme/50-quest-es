import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        System.out.println("digite 3 numeros e o sistema mostrará o maior e o menor entre eles: ");
        int n1=entrada.nextInt();
        int n2=entrada.nextInt();
        int n3=entrada.nextInt();
        if(n1>n2 & n1>n3){
            System.out.println("O MAIOR: "+n1);
        }
        else if(n2>n1 & n2>n3){
            System.out.println("O MAIOR: "+n2);
        }
        else if(n3>n1 & n3>n2){
            System.out.println("O MAIOR: "+ n3);
        }
        else{
            System.out.println("numeros iguais dao bug no sistema");
        }
        if(n1<n2 & n1<n3){
            System.out.println("O MENOR: "+n1);
        }
        else if(n2<n1 & n2<n3){
            System.out.println("O MENOR: "+n2);
        }
        else if(n3<n1 & n3<n2){
            System.out.println("O MENOR: "+ n3);
        }
        else{
            System.out.println("numeros iguais dao bug no sistema ");
        }


        entrada.close();
    }
}

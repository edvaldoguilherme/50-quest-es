import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        System.out.println("digite 3 numeros e o sistema mostrará a ordem crescente deles: (nao digite nnumeros iguais)");
        int n1=entrada.nextInt();
        int n2=entrada.nextInt();
        int n3=entrada.nextInt();
        if(n1>n2 & n1>n3 & n2>n3){
            System.out.println("a ordem crescente é: "+n3+", "+n2+", "+n1);
        }
        else  if(n1>n2 & n1>n3 & n3>n2){
            System.out.println("a ordem crescente é: "+n2+", "+n3+", "+n1);
        }
        else  if(n2>n1 & n2>n3 & n1>n3){
            System.out.println("a ordem crescente é: "+n3+", "+n1+", "+n2);
        }
        else  if(n2>n1 & n2>n3 & n3>n1){
            System.out.println("a ordem crescente é: "+n1+", "+n3+", "+n2);
        }
        else  if(n3>n1 & n3>n2 & n2>n1){
            System.out.println("a ordem crescente é: "+n1+", "+n2+", "+n3);
        }
        else  if(n3>n1 & n3>n2 & n1>n2){
            System.out.println("a ordem crescente é: "+n2+", "+n1+", "+n3);
        }
        else{
            System.out.println("numeros iguais nao sao aceirtos.");
        }
        entrada.close();
    }
}

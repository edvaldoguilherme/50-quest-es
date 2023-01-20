import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("digite o valor que voce deseja ver os proximos 6 numeros impares:");
        int num = ent.nextInt();
        if(num==0){
            System.out.println("zero nao se configura impar ou par.");
        }
        else if(num%2==0){
            System.out.println("os numeros são:\n"+(num+1)+"\n"+(num+3)+"\n"+(num+5)+"\n"+(num+7)+"\n"+(num+9)+"\n"+(num+11));
        }
        else{
            System.out.println("os numeros são:\n"+(num+2)+"\n"+(num+4)+"\n"+(num+6)+"\n"+(num+8)+"\n"+(num+10)+"\n"+(num+12));
        }
    ent.close();
    }
    
}

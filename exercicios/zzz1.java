import java.util.Scanner;

public class zzz1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("digite uma frase");
        String frase = ent.nextLine();

        ent.close();


        int contador = 0;

        for (int i = 0; i<frase.length();i++){
            char caracterAtual = frase.charAt(i);
            if(caracterAtual == 'A' || caracterAtual =='a'){
                contador++;
            }

        }
        System.out.println("total de a(s) = "+contador);
    }
}

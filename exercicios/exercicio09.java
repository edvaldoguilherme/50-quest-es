import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("digite quantos segundos você deseja converter:");
        int segundos = ent.nextInt();
        int minutos = 0;
        int horas = 0;
        
        while(segundos>=60){
            if(segundos>=60){
                segundos=segundos-60;
                minutos=minutos+1;
                if(minutos>=60){
                    minutos=minutos-60;
                    horas=horas+1;
                }
            }
        }
        System.out.println("SS: "+segundos+"\nMM: "+minutos+"\nHH: "+horas);
        ent.close();
    }
    
}

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("ESCOLHA SEMPRE COM 1 OU 2");
        System.out.println("o animal que você escolherá é Vertebrado ou invertebrado: \n 1= vertebrado \n 2=invertebrado");
        int tipo1 = ent.nextInt();
        if(tipo1 == 1){
            System.out.println("o animal que você escolherá é mamifero ou ave \n 1= ave\n 2=mamifero");
            int tipo2 = ent.nextInt();
            if(tipo2==1){
                System.out.println("a ave que você escolherá é carnivoro ou onivoro \n 1= carnivoro\n 2= onivoro");
                int tipo3 = ent.nextInt();
                if(tipo3==1){
                    System.out.println("você escolheu o animal aguia");
                }
                else if(tipo3==2){
                    System.out.println("você escolheu o animal pombo");

                }
                else{
                    System.out.println("invalido");
                }            
            } 
            else if(tipo2==2){
                System.out.println("o mamifero que você escolherá é herbivoro ou onivoro \n 1= herbivoro\n 2= onivoro");
                int tipo3 = ent.nextInt();
                if(tipo3==1){
                    System.out.println("você escolheu o animal vaca");
                }
                else if(tipo3==2){
                    System.out.println("você escolheu o animal homem");

                }
                else{
                    System.out.println("invalido");
                }
            }
        }
        else if(tipo1 == 2){
            System.out.println("o animal que você escolherá é inseto ou anelidio \n 1= inseto\n 2=anelidio");
            int tipo2 = ent.nextInt();
            if(tipo2==1){
                System.out.println("a ave que você escolherá é hematofago ou herbivoro \n 1= hematofago\n 2= herbivoro");
                int tipo3 = ent.nextInt();
                if(tipo3==1){
                    System.out.println("você escolheu o animal pulga");
                }
                else if(tipo3==2){
                    System.out.println("você escolheu o animal lagarta");

                }
                else{
                    System.out.println("invalido");
                }            
            } 
            else if(tipo2==2){
                System.out.println("o mamifero que você escolherá é hematofago ou onivoro \n 1= hematofago\n 2= onivoro");
                int tipo3 = ent.nextInt();
                if(tipo3==1){
                    System.out.println("você escolheu o animal sanguessuga");
                }
                else if(tipo3==2){
                    System.out.println("você escolheu o animal minhoca");

                }
                else{
                    System.out.println("invalido");
                }
            }
            else{
                System.out.println("invalido");
        }
        
        ent.close();
        
    }
    
}
}

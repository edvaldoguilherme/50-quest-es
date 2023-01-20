import java.util.Scanner;

public class exercicio16 {  
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("digite a população do país 1");
        Double pais1=ent.nextDouble();
        System.out.println("digite a população do país 1");
        Double pais2=ent.nextDouble();
        int ano=0;
        int anoatual = 2023;
        if(pais1>pais2){
            System.out.println("a população já é maior.");
        }
        else{
            while(pais1<pais2){
                pais1=pais1+(pais1*3/100);
                pais2=pais2+(pais2*1.5/100);
                ano=ano+1;

            
            }
        anoatual=anoatual+ano;
        System.out.println("para ultrapassar em população irá demorar: "+ano+" anos ou seja em "+anoatual);
        }
        ent.close();
    }
    
}

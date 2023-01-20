import java.util.Scanner;

public class zzz3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("digite o coeficiente A");
        double a = ent.nextDouble();
        System.out.println("digite o coeficiente B");
        double b = ent.nextDouble();
        System.out.println("digite o coeficiente C");
        double c = ent.nextDouble();

        double raiz1,raiz2;

        double delta = Math.pow(b, 2) -4*a*c;
        if(delta<0){
            System.out.println("raizes indeterminadas");
            return;
        }
        else if(delta==0){
            raiz1=-b/(2*a);
            raiz2=raiz1;
            System.out.println("X1 = X2 = " + raiz1);
            return;
        }
        else{
            raiz1=(-b - Math.sqrt(delta))/(2*a);
            raiz2=(-b + Math.sqrt(delta))/(2*a);

            System.out.println("X1= "+raiz1+"\nX2= "+raiz2);

        }
    }
    
}

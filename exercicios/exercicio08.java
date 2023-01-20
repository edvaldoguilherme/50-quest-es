import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("qual valor da renda do homem?");
        double rh= entrada.nextDouble();
        System.out.println("qual valor da renda da mulher?");
        double rm= entrada.nextDouble();
        double rc= rh+rm;
        int aliquota = 0;
        double ir = 0;
        double rl = 0;

        if(rc>0 & rc<=900){
             aliquota=0;
             ir = (aliquota*rc)/100;
             rl = rc-ir;
             System.out.println("renda do casal é de: "+ rc+"R$ \n"+
             "aliquota é no valor de: "+aliquota+"% \n"+
             "o imrposto de renda é no valor de: "+ir+"R$ \n"+
             "a renda liquida do casal é de: "+rl+"R$");
        }
        else  if(rc>900 & rc<=1500){
            aliquota=10;
            ir = (aliquota*rc)/100;
            rl = rc-ir;
            System.out.println("renda do casal é de: "+ rc+"R$ \n"+
            "aliquota é no valor de: "+aliquota+"% \n"+
            "o imrposto de renda é no valor de: "+ir+"R$ \n"+
            "a renda liquida do casal é de: "+rl+"R$");
        }
        else if(rc>1500 & rc<=2500){
            aliquota=15;
            ir = (aliquota*rc)/100;
            rl = rc-ir;
            System.out.println("renda do casal é de: "+ rc+"R$ \n"+
            "aliquota é no valor de: "+aliquota+"% \n"+
            "o imrposto de renda é no valor de: "+ir+"R$ \n"+
            "a renda liquida do casal é de: "+rl+"R$");
        }
        else if(rc>2500){
            aliquota=25;
            ir = (aliquota*rc)/100;
            rl = rc-ir;
            System.out.println("renda do casal é de: "+ rc+"R$ \n"+
            "aliquota é no valor de: "+aliquota+"% \n"+
            "o imrposto de renda é no valor de: "+ir+"R$ \n"+
            "a renda liquida do casal é de: "+rl+"R$");
        }
        else{
            System.out.println("Não são aceitos valores negativos");
        }

        entrada.close();
    }
    
}

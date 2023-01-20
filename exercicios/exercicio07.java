import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("bem vindo ao caixa, qual valor deseja sacar?");
        int valor = entrada.nextInt();
        int total = valor;
        int cedula = 100;
        int totaldecedulas = 0;
        while (true){
            if(total>cedula){
                total = total-cedula;
                totaldecedulas+=1;
               
            }
            else{
                System.out.println(totaldecedulas+"de"+cedula+" reais");
                
                if(valor>=50){
                    cedula = 50;
                    totaldecedulas+=1;
                }
                else if(valor>=20){
                    cedula = 20;
                    totaldecedulas +=1;
                }
                else if(valor>=10){
                    cedula = 10;
                    totaldecedulas+=1;
                }
                else if(valor>=5){
                    cedula = 5;
                    totaldecedulas+=1;
                }
                else if(valor>=2){
                    cedula = 2;
                    totaldecedulas+=1;
                }
                else if(valor>=1){
                    cedula = 1;
                    totaldecedulas+=1;
                }
                else{
                    break;
                }



        
    }
    entrada.close();
    
}
    }
}

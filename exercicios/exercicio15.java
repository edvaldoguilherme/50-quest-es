public class exercicio15 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        int aux;
        for(int i=0;i<46;i++){
            System.out.print(a+" ");
            aux=a;
            a=a+b;
            b=aux;

        }
    }
    
}

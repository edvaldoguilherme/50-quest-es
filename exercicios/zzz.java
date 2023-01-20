public class zzz {
    public static void main(String[] args) {
        double n = 10;
        double a = 0;
        double num = n;
        double den = 1;

       while(den<=n){
        a+=num/den;
        num--;
        den++;

       }
        
        System.out.println(a);
    }
    
}

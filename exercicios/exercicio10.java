import java.util.Scanner;

public class exercicio10 {

    public static void main(String[] args) {
      Scanner ent = new Scanner(System.in);
      System.out.println("digite quantod dias de vida você tem: ");
      int dias = ent.nextInt();
      int meses = 0;
      int anos=0;
      while(dias>=30){
        if(dias>=30){
          dias=dias-30;
          meses=meses+1;
          if(meses==12){
            meses=meses-12;
            anos=anos+1;          }
        }

      }
      System.out.println("dias: "+dias+"\n"+
      "meses: "+meses+"\n"+
      "anos: "+anos);
      ent.close();
}
}

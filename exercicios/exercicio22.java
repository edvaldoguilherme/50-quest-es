import java.util.Scanner;

public class exercicio22 {public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
	int v=0;
	
	System.out.println("metros cubicos:");
	int uso=ent.nextInt();
	
	if (uso<=10) {
		v=7;
	}
	else if (uso>=11 && uso<=30) {
		v=7 + (uso-10);
	}
	else if (uso>=31&& uso<=100) {
		v=7+ (uso-10) + (uso-30)*2;
	}
	else{
		v=7+ (uso-10) + (uso-30)*2 + (uso - 100)*3;
	}
	System.out.println(v);
	
	ent.close();
	
	
	
	
}

}

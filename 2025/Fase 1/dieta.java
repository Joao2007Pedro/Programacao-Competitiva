import java.util.*;
public class dieta {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int consumir = 0;
		int calorias = 0;
		int proteina = 0;
		int gordura = 0;
		int carboidrato = 0;
		
		int p=0,g=0,c=0;
		for (int i = 0; i < n; i++) {
			p = in.nextInt();
			proteina = p*4;
			g = in.nextInt();
			gordura = g*9;
			c = in.nextInt();
			carboidrato = c*4;
			calorias += proteina + gordura + carboidrato;
		}
		
		consumir = m - calorias;
		if (consumir < 0) {
			consumir = 0;
		}
		System.out.println(consumir);
		
	}
 
}

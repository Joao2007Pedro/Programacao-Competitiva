import java.util.*;
public class festa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int e = in.nextInt();
		int s = in.nextInt();
		int l = in.nextInt();
		
		int escola = e-s;
		if (escola <0) {
			escola = s-e;
		}
		int loja = s-l;
		if (loja <0) {
			loja = l-s;
		}
		int supermercado = l-e;
		if (supermercado <0) {
			supermercado = e-l;
		}
		
		int distancia = escola+loja+supermercado;
		
		System.out.println(distancia);
	}
 
}
 

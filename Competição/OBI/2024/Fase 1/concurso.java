import java.util.Scanner;
import java.util.Arrays;
public class concurso {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int corte = 0;
		int cont = 0;
		 int n = in.nextInt();
		 int k = in.nextInt();
		 
		 int[] p = new int[n];
		 
		 for(int i = 0; i < n; i++) {
	            p[i] = in.nextInt();
	        }
		 
		 Arrays.sort(p);
		 for(int i = n - 1; i >= 0; i--) {
			 cont++;
			 if (cont == k) {
				 corte = p[i];
			 }
	    }
		 System.out.println(corte);
		
		
	}
}

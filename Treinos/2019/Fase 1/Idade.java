import java.util.Scanner;
public class idade {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int soma = a + b;
		int c =  m - soma;
		
		if (c > a && c > b) {
			System.out.println(c);
		} else if (b > c && b > a) {
			System.out.println(b);
		} else {
			System.out.println(a);
		}
	}
}

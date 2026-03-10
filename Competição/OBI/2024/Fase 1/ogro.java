import java.util.Scanner;
public class ogro {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int e = in.nextInt();
		int d = in.nextInt();
		
		if (e > d) {
			int valorF = e + d;
			System.out.println(valorF);
		} else if (e < d ) {
			int valorF = (d-e) *2;
			System.out.println(valorF);
		}
	}
}

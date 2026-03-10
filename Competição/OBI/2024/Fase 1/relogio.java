import java.util.Scanner;
public class relogio {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
		
		int t = in.nextInt();
		
		s = s + 60;
		t = t - 60;
		if (t <60) {
			s += t;
		}
		
		if (s >= 60) {
			m++;
			s = s - 60;
			if (m >= 60) {
				h++;
				m = m - 60;
				if ( h >= 24) {
					h = 0;
				}
			}
		}
		System.out.println(h);
		System.out.println(m);
		System.out.println(s);
		System.out.println();
			}
			
		}
			

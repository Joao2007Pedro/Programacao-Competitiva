import java.util.Scanner;
public class camisetas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tp = 0;
        int tm = 0;
        int n = in.nextInt();
        
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            if (t == 1) {
                tp++;
            } else if (t == 2) {
                tm++;
            }
        }

        int p = in.nextInt();
        int m = in.nextInt();
        if (p <= tp && m <= tm) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}

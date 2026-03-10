import java.util.Scanner;
public class lampadasHotel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int Ia = in.nextInt();
        int Ib = in.nextInt();
        int Fa = in.nextInt();
        int Fb = in.nextInt();
        int count = 0;
        
        if (Ia == Fa && Ib == Fb) {
            count = 0;
        } else if (Ia != Fa && Ib == Fb) {
            count = 1;
        } else if (Ia == Fa && Ib != Fb) {
            count = 1;
        } else if (Ia != Fa && Ib != Fb) {
            count = 1;
        } else {
            count = 2;
        }

        System.out.println(count);
        in.close();
    }
}

import java.util.*;
public class cafeteria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
 
        int minCafe = C - B;
        int maxCafe = C - A;
 
        boolean possivel = false;
 
 
        for (int cafe = minCafe; cafe <= maxCafe; cafe++) {
            if (cafe % D == 0) {
                possivel = true;
                break;
            }
        }
 
        if (possivel) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }
    }
}

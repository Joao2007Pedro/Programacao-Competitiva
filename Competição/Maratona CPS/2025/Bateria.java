import java.util.*;
import java.util.BigDecimal;
public class Bateria {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int n = 0;
    
    while (true) {
      n = in.nextInt();
      if (n==0) {
        break;
      }
      
      int soma = 0;
      int[] arr = new int[n];

      for(int i=0; i<n; i++){
        arr[i] = in.nextInt();
        soma += arr[i] * 0.9;
      }

      System.out.println("");
    }
  }
}

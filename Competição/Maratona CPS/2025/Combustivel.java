import java.text.DecimalFormat;
import java.util.*;

public class Combustivel {

  public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
    DecimalFormat deci = new DecimalFormat("0.0");

    while (true) {
      int n = in.nextInt();
      if (n == 0) break;

      double maior = 0;
      double somaKm = 0;
      double somaL = 0;

      for (int i = 0; i < n; i++) {
        double a = in.nextInt();
        double b = in.nextInt();
        double consumo = b / a;

        if (consumo > maior) {
          maior = consumo;
        }

        somaKm += b;
        somaL += a;
      }
      
      double media = somaKm / somaL;

      System.out.println("Media: " +  deci.format(media));
      System.out.println("Melhor: " + deci.format(maior));
    }
  }
}
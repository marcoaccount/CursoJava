package CursoJava;
import java.util.Scanner;

public class bhaskara {
  public static void main(String[] args){
    Scanner x = new Scanner(System.in);
    System.out.println("Valor de 'a': ");
    double a = x.nextDouble();
    System.out.println("Valor de 'b': ");
    double b = x.nextDouble();
    System.out.println("Valor de 'c': ");
    double c = x.nextDouble();
    double menosb = b * (-1);
    double delta = Math.pow(b, 2) - (4*a*c);
    double divisor = 2*a;
    double x1 = (menosb + Math.sqrt(delta)) / divisor;
    double x2 = (menosb - Math.sqrt(delta)) / divisor;
    if (delta<=0) {
      System.out.println("Raiz impossivel.");
    }else if (x1==x2) {
      System.out.println("Ambos os resultadoss são: "+x1);
    }else{
      System.out.println("S= {"+x1+", " +x2+"}");
    }
  }
}

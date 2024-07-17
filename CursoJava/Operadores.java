package CursoJava;

public class Operadores {
  public static void main(String[] args){
    // + - / *
    int idade1 = 12;
    int idade2 = 16;
    System.out.println(idade1+idade2);
    //Se colocar uma String antes, não irá somar.
    System.out.println("Valor"+idade1+idade2);
    System.out.println("------------------------------------------");

    // resto == %
    double num1 = 20;
    double num2 = 10;
    double resultado = num1 / num2;
    System.out.println(resultado);
    double resto = num1 % num2;
    System.out.println(resto);
    System.out.println("------------------------------------------");

    // < > <= >= == !=
    
  }
}

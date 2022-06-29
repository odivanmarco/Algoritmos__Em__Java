import java.util.Scanner;

class Questao5 {
  // Método recursivo que retorna o máximo divisor comum 
  static int gcd(int a, int b) {
      if (a == 0) return b;
      return gcd(b % a, a);
  }
  // Medo que retorna o minimo divisor comum
  static int lcm(int a, int b) {
      return (a / gcd(a, b)) * b;
  }
  
  public static void main(String[] args) {
    // Ler valores do teclado
      Scanner sc = new Scanner(System.in);
      int a, b;
      System.out.print("Digite o primeiro numero: ");
    //   Le um numero inteiro do teclado
      a = sc.nextInt();
      System.out.print("Agora digite o segundo: ");
      b = sc.nextInt();

      System.out.println("Minimo divisor comum de " + a + " e " + b + " eh: " + lcm(a, b));

    //   Fechando o Scanner do teclado
    sc.close();
  }
}
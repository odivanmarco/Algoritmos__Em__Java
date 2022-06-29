class Questao2 {
  // Funçao para reconhecer palindromos
    static void palindromo(int n){
       int invertido = 0, aux = n;
      //  while para inverter o número
       while(aux  > 0) {
                 invertido = invertido * 10 + aux % 10;
                 aux = aux / 10;
           }
          //  Se for igual é palindromo
          if (n == invertido){
            System.out.println(n+" É palíndromo");
          }
          // Não é palindromo
          else{
            System.out.println(n+" Não é Palíndromo");
          }
    }
    
    public static void main(String[] args) {
      // Vetor com os numeros
      int vetor[] = {10, 22, 11, 123321, 94, 53, 99,88,101,906};
      // For chamando a função para cada item do vetor
      for(int i : vetor){
        palindromo(i);
      }
    }
  }
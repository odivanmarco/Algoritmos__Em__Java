import java.util.Scanner;
import java.util.ArrayList;

//Classe pessoa
class Pessoa{
  int idade;
  String sexo;
  float salario;

  // Construtor da classe pessoa
  Pessoa(int idade, String sexo, float salario){
    this.idade = idade;
    this.sexo = sexo;
    this.salario = salario;
  }

  // Construtor vazio
  Pessoa(){
    
  }
  
}


class Questao1 {
  // Função Main
  public static void main(String[] args) {
    // Array do tipo Pessoa 
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    // Scanner para ler do teclado
    Scanner sc = new Scanner(System.in);
    int idade=0;
    String sexo;
    float salario;
    float media = 0;
    int maior = 0;
    int menor = 999;
    int cont = 0;
    int mulheres200 = 0;

    // Loop infinito  
    while(true){
      System.out.println("Digite a idade do cidadão: ");
      idade = sc.nextInt();
        if(idade < 0){
          // Se a idade for negativa, para o loop
          break; 
        }
      // Pra limpar o buuf
      sc.nextLine();
      System.out.println("Digite o sexo do cidadão (F/M): ");
      sexo = sc.nextLine();
      System.out.println("Digite o salário do funcionário: ");
      salario = sc.nextFloat();
      Pessoa p = new Pessoa(idade,sexo,salario);
      // Acionando p no vetor de pessoas
      pessoas.add(p);

      media += salario;

      // Pegar maior idade, e manda para a variavel "maior"
      if(idade > maior){
        maior = idade;
      }

      if(idade < menor){
        menor = idade;
      }

      // Mulheres que ganham menos que 200
      if(sexo.equals("F") && salario <= 200){
        mulheres200++;
      }

      // Conta quantidade de pessoas
      cont ++;
    }
    System.out.println("A média dos salários é: " + (media/cont));
    System.out.println("A maior idade é: " + maior + " e a menor é: " + menor);
    System.out.println("A quantidade de mulheres com salário até 200 é: " + mulheres200);


    // Fechando o scanner do teclado
    sc.close();
  }
}
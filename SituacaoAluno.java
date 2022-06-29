import java.util.Scanner;

public class alunosSituacao {
    
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String nome;
        int nota1, nota2;
        int media = 0;
        for(int i = 0; i < 3; i++){

            System.out.println("Digite o seu nome por favor");  
            nome = ent.next();
            // recebe a 1º nota
            System.out.println("Aluno " + nome + ", digite sua 1ª nota");
            nota1 = ent.nextInt();
            
            // recebe a 2º nota
            System.out.println("Aluno " + nome + ", digite sua 2ª nota");
            nota2 = ent.nextInt();
            

            
            // calcula a média
            media = (nota1 + nota2 ) / 2;
            System.out.println("A média do aluno " + nome + " é " + media);
            
            // mostra a nota do aluno
            if( (media >= 0) && (media <5) ){
                System.out.println("Situação: Reprovado");
            } else if(media >= 5 && media <7){
                System.out.println("Situação: Recuperação");
            } else if(media >= 7){
                System.out.println("Situação: Aprovado");
            } 
        }       
    }
}
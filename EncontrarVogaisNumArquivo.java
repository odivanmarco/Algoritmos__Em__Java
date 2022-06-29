import java.util.*;
import java.io.*;

class Questao4 {
  // Função main
  public static void main(String[] args) throws IOException {
    // Scanner para entrar valores do teclado
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o nome do arquivo que deseja ler?");
    // Le o nome do arquivo 
    String nomeArq = sc.nextLine();
    System.out.println("Qual o nome do arquivo que deseja escrever as vogais?");
    // Le o nome do arquivo de saida
    String nomeArqVogais = sc.nextLine();
  
    // Cria um buffer para ler o arquivo
    BufferedReader txt = new BufferedReader(new FileReader(nomeArq));
    // Abre um arquivo para escrita, com formato append (escrita no final)
    FileWriter saida = new FileWriter(nomeArqVogais,true);
    // Guarda em texto a linha lida
    String texto = txt.readLine();
        // for para percorrer texto, verificar se é vogal, se for, pega a vogal e escreve-la no arquivo de saida
        for (int i = 0; i < texto.length(); i++) {
          if (texto.charAt(i) == 'a' || texto.charAt(i) == 'e' || texto.charAt(i) == 'i'
           || texto.charAt(i) == 'o' || texto.charAt(i) == 'u') {
              saida.write(texto.charAt(i));
            } 
        }

    // Fechando os arquivos e o Scanner
    saida.close();
    txt.close();
    sc.close();
}
 
}
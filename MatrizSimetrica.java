import java.util.Scanner;
// Classe Matriz Simetrica
class MatrizSimetrica{

private final int tamanho = 4;
// Define o tamanho da matriz
private int matriz[][] = new int[tamanho][tamanho];

// Pega os dados via teclado e bota na posição (linha,coluna) da matriz
public void carregaMatriz() {
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < tamanho; i++) {
		for (int j = 0; j < tamanho; j++) {
			System.out.println("Digite o valor da posição [" + (i + 1) + ", " + (j + 1) + "]:");
			matriz[i][j] = sc.nextInt();
		}
	}		
    sc.close();
}

public boolean verificaSimetria() {
	// 2 for para percorrer a matriz (i,j) são iteradores para (linha,coluna)
	for (int i = 0; i < tamanho; i++) {
		for (int j = 0; j < tamanho; j++) {
			// Compara a matriz, se der falso a matriz não é simetrica
			if ((matriz[i][j]) != (matriz[j][i])) 
				return false;
		}
	}
	return true;
}

public static void main(String[] args) {
	// Instanciando uma matriz
	MatrizSimetrica matriz = new MatrizSimetrica();
	// Chama a função para digitar os valores da matriz
	matriz.carregaMatriz();
	// Se é simetrica imprime Matriz Simétrica
	if (matriz.verificaSimetria())
		System.out.println("Matriz simetrica");
	// Se não for simetrica, imprime que a matriz não é simétrica 
	else 
		System.out.println("A matriz nao eh simetrica");
  }
}
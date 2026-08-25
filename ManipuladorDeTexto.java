import java.util.Scanner;

public class ManipuladorDeTexto {

	public static void main(String[] args) {
	 Scanner leitor = new Scanner (System.in);
	 
	 System.out.println("Digite uma frase motivacional;");
	 String frase = leitor.nextLine();
	 
	 // Usando os metódos (comportamentos)que o objetivo String ja possui.
	 int tamanho = frase.length();
	 String fraseGritando = frase.toUpperCase();
	 
	 System.out.println("\n== Análise da frase ==");
	 System.out.println("A  frase tem" + tamanho + 
			 "caracteres (contando os espaços)." );
	 System.out.println("Gritando:" + fraseGritando);
	 
	 leitor.close();

	}

}

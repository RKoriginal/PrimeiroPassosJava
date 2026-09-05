import java.util.Scanner;

public class teste_aula1 {

	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de escritório";
		
		int idade = 30;
		int codigo= 5290;
		char genero = 'F';
		
		double preço1 = 2100.0;
		double preço2 = 650.50;
		double media = 53.234567;
		
		System.out.println("Produto:");
		System.out.println(produto1+ ", Cujo o preço é $"+ preço1);
		System.out.println(produto2+ ", cujo preço é $" + preço2);
		
		System.out.println();
		
		System.out.printf("Registro: %d anos, código %d e gênero: %s", idade,codigo,genero);
		
		System.out.println();
		
		System.out.println("Medida com oitos casas decimais:"+ media);
		System.out.printf("Arredondado (Três casas decimais): %.3f%n", media);
		System.out.printf("Ponto decimal americano: %.3f", media);
		
		
	}

}

import java.util.Scanner;

public class Desafio2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite sua Idade:");
		int idade = leitor.nextInt();
		
		System.out.print("Qual seu tempo em meses, de experiência na empresa:");
		int tempo = leitor.nextInt();
		
		boolean aprovado = (idade > 18 && tempo >= 6 || idade > 25);
		
		System.out.println("Candidato aprovado? " + aprovado);
		
		leitor.close();

	}

}

import java.util.Scanner;

public class BlocoDeNotas {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a nota do aluno (0 a 100)");
		int nota = leitor.nextInt();
		
		//Estrutura Condicional
		if (nota >= 60) {
			System.out.println("O aluno foi Aprovado! Parábens!");
			
		}else {
				System.out.println("O aluno foi Reprovado!");
		}
		leitor.close();
		
	}

}

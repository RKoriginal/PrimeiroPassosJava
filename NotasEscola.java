import java.util.Scanner; 

public class NotasEscola {

	public static void main(String[] args) {
	// O (Scanner entrada ) permite eu digitar. 
		
	Scanner entrada = new Scanner (System.in);
		
		System.out.println("Qual o seu nome?");
			String nome = entrada.nextLine(); 
		
		System.out.println("Olá " + nome + "," + " "
				+ "Seja Bem-vindo ao sistema de notas. ");
		
		// Isso faz quebrar uma linha tipo dar um enter. 
		System.out.println();
		
		
		System.out.println("Digite a primeira nota do aluno(a) (0 a 10):");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite a segunda nota do aluno(a) (0 a 10):");
		double nota2 = entrada.nextDouble();
		
		// Processamento
		double soma = nota1 + nota2;
		double media = soma /2;
		
		System.out.println();
		
		// Condições de como funciona,a regra para ser aprovado ou reprovado 
		if (media >= 6.0) {
				System.out.println("Você foi aprovado!" + "Parabéns continue se esforçando.");
		}
		else if (media >= 3.1 && media <6){
			System.out.println("Você está de recuperação! Estude mais. ");
		}
			
		else {
			System.out.println("Você foi REPROVADO!");
		}
		
		System.out.println();
		
		// Saída dos Dados
		System.out.println("Prova p1, nota:" + nota1);
		System.out.println("Prova p2, nota:" + nota2);
		System.out.println("Média da duas provas:" + media );
		
		System.out.println();
	
		System.out.println("Obrigado por usar nosso site!");
		
		
		
	}

}

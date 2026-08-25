import java.util.Scanner; 
public class CalculadoraSimples {

	public static void main (String[] args) {
		Scanner  leitor = new Scanner (System.in);
	
		System.out.println("Digite o 1º Número");
			int numero1 = leitor.nextInt();	
		System.out.println("Digite o 2º Número");
			int numero2 = leitor.nextInt();
		
		// Processamento 
			int soma = numero1 + numero2; 
		
		//cast(double) converter temporariamente a soma para decimal 	
		// para garantir que a divisão seja exata (ex: 5/2 = 2.5)
			double media = (double) soma /2;
			
		// Saída dos Dados
		System.out.println("A soma dos números é:" + soma);
		System.out.println("Á Média exta é:" + media);
		
         leitor.close();	
		
	}
}
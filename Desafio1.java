import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("Digite a base");
		int base = entrada.nextInt();
		
		System.out.print("Digite o expoente");
		int expoente = entrada.nextInt();
		
		double potencia = Math.pow(base, expoente);
		
		System.out.print("Digite a primeira nota:");
		double nota1 = entrada.nextDouble();
		
		System.out.print("Digite a segunda nota:");
		double nota2 = entrada.nextDouble();
		
		System.out.print("Digite a terceira nota:");
		double nota3 = entrada.nextDouble();
		
		double media = (nota1 + nota2 + nota3) / 3;
		
		System.out.printf("Potencia: %.2f%n", potencia);
		System.out.printf("Média : %.2f%n", media);
		
		entrada.close();
			
	}

}

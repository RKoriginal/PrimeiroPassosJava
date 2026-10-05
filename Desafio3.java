import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new  Scanner(System.in);
		
		System.out.print("Digite o valor da compra :");
		double compra = entrada.nextDouble();

		double desconto = (compra >= 1000.0)? 150.0 : 50.0;
		
		double valorFinal = compra - desconto;
		
		System.out.printf("Valor da compra: R$ %.2f%n", compra);
		System.out.printf("Desconto: R$ %.2f%n", desconto);
		System.out.printf("Valor final: R$ %.2f%n", valorFinal);
		
		entrada.close();
	}

}

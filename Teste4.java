import java.util.Scanner;

public class Teste4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Para cria menu principal de jogos?
		// do-while com switch case dentro.

		int opcao;

		do {
			System.out.println("=== MENU PRINCIPAL === ");
			System.out.println("1 - Jogar");
			System.out.println("2 - configurações");
			System.out.println("3 - sair ");
			System.out.println("Escolha a opção:");

			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Iniciando jogo ...");
				break;
			case 2:
				System.out.println("Abrindo configurações...");
				break;
			case 3:
				System.out.println("Saindo do jogo....");
				break;
			default:
				System.out.println("OPÇÃO INVALIDA");

			}

		} while (opcao != 3);

		sc.close();
	}

}

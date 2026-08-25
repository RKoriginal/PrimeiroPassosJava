import java.util.Scanner;
public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Criação dos objetos Scanner: pense nela como o "ouvido" do programa.
        Scanner leitor = new Scanner(System.in);
        
        //1. Saída : avisar o Usúario o que ele deve fazer.
	System.out.print("Por favor, digite o seu nome:");
	
	//2. Entrada : Cria uma várialvel (uma caixa na mémoria) para guradar 
	String nomeUsuario = leitor.nextLine();
	
	// 3. Processamento e Saída: Juntar (Concatenar) o texto fixo com variável.
	System.out.println("Óla," + nomeUsuario + " ! Bem-Vindo ao mundo java");
	
	// Boa prática: avisar ao sistema que não vamos mais ler dados.
   leitor.close(); 
   

	}

}

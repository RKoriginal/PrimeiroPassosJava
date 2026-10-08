import java.util.Scanner;

public class CombustivelTipoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		
		
		int combustivel = sc.nextInt();
		
		while(combustivel != 4) {
			if(combustivel == 1){
				alcool += 1;
			}else if (combustivel == 2) {
				gasolina += 1;
			}else if(combustivel == 3) {
				disel += 1;
			}
				combustivel = sc.nextInt();	
		}
		
		System.out.println("MUITO OBRIGADO");
		
		System.out.println("Álcool:" + alcool);
		System.out.println("Gasolina:" + gasolina);
		System.out.println("Disel: " + disel);
		
		
		sc.close();
	}

}

import java.util.Scanner;

public class Desafio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        String cript = frase.toLowerCase();

        cript = cript.replace("a", "4");
        cript = cript.replace("e", "3");
        cript = cript.replace("i", "1");
        cript = cript.replace("o", "0");
        cript = cript.replace("u", "5");

        System.out.println("Frase original: " + frase);
        System.out.println("Frase criptografada: " + cript);

        sc.close();
    }
}
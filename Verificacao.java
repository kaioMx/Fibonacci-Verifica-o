import java.util.Scanner;

public class Verificacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int cont = 0;


        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == 'a' || c == 'A') {
                cont++;
            }
        }


        if (cont > 0) {
            System.out.println("A letra 'a' aparece " + cont + " vezes.");
        } else {
            System.out.println("A letra 'a'  nao foi encontrada.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class VerificaLetraA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que informe uma string
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int contador = 0;

        // Percorre cada caractere da string e verifica se é 'a' ou 'A'
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Verifica se o caractere é 'a' ou 'A
    
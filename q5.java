import java.util.Scanner;

public class q5 { // Declaração da classe q5
    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para entrada de dados

        System.out.print("Digite um número inteiro: "); // Solicita ao usuário que digite um número inteiro
        int numero = scanner.nextInt(); // Lê o número inteiro digitado pelo usuário e armazena na variável 'numero'

        int antecessor = numero - 1; // Calcula o antecessor do número digitado e armazena na variável 'antecessor'
        int sucessor = numero + 1; // Calcula o sucessor do número digitado e armazena na variável 'sucessor'

        System.out.println("O antecessor de " + numero + " é: " + antecessor); // Exibe o antecessor do número digitado
        System.out.println("O sucessor de " + numero + " é: " + sucessor); // Exibe o sucessor do número digitado

        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }
}

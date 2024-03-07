import java.util.Scanner;

public class q12 { // Declaração da classe q12
    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para entrada de dados

        System.out.print("Digite o preço do produto: "); // Solicita ao usuário que digite o preço do produto
        double precoProduto = scanner.nextDouble(); // Lê o preço do produto fornecido pelo usuário e armazena na variável 'precoProduto'

        double desconto = precoProduto * 0.05; // Calcula o valor do desconto, que é 5% do preço do produto
        double novoPreco = precoProduto - desconto; // Calcula o novo preço do produto com o desconto aplicado

        System.out.println("O novo preço do produto com desconto de 5% é: " + novoPreco); // Exibe o novo preço do produto com desconto

        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }
}

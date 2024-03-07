import java.util.Scanner;
import java.util.Random;

public class q45 { // Declaração da classe q45
    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para entrada de dados
        Random random = new Random(); // Criação de um objeto Random para geração de números aleatórios

        String[] opcoes = {"Pedra", "Papel", "Tesoura"}; // Declaração de um array de Strings com as opções do jogo

        // Mensagens de boas-vindas e instruções para o usuário
        System.out.println("Bem-vindo ao JOKENPÔ!");
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        int escolhaUsuario = scanner.nextInt(); // Lê a escolha do usuário
        int escolhaComputador = random.nextInt(3); // Gera um número aleatório entre 0 e 2 para representar a escolha do computador

        // Exibe as escolhas do usuário e do computador
        System.out.println("Você escolheu: " + opcoes[escolhaUsuario - 1]);
        System.out.println("O computador escolheu: " + opcoes[escolhaComputador]);

        // Verifica o resultado do jogo e exibe o resultado
        if (escolhaUsuario == escolhaComputador + 1) {
            System.out.println("Empate!"); // Se as escolhas forem iguais, é um empate
        } else if ((escolhaUsuario == 1 && escolhaComputador == 2) ||
                (escolhaUsuario == 2 && escolhaComputador == 0) ||
                (escolhaUsuario == 3 && escolhaComputador == 1)) {
            System.out.println("Você venceu!"); // Se o usuário ganhar
        } else {
            System.out.println("Você perdeu!"); // Se o usuário perder
        }

        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }
}

import java.util.Scanner;
import java.util.Random;

public class q20 { // Declaração da classe q20
    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para entrada de dados
        Random random = new Random(); // Criação de um objeto Random para geração de números aleatórios

        System.out.println("Digite os nomes dos quatro alunos:"); // Solicita ao usuário que digite os nomes dos quatro alunos

        String[] alunos = new String[4]; // Declaração de um array de Strings para armazenar os nomes dos alunos

        // Loop para solicitar e armazenar os nomes dos quatro alunos
        for (int i = 0; i < 4; i++) {
            System.out.print("Aluno " + (i + 1) + ": "); // Solicita ao usuário que digite o nome do aluno atual
            alunos[i] = scanner.nextLine(); // Lê o nome do aluno fornecido pelo usuário e armazena no array 'alunos'
        }

        // Embaralhando os nomes dos alunos
        for (int i = alunos.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1); // Gera um índice aleatório no intervalo [0, i]
            // Troca alunos[i] com alunos[index]
            String temp = alunos[i];
            alunos[i] = alunos[index];
            alunos[index] = temp;
        }

        System.out.println("\nOrdem sorteada para apresentação:"); // Exibe a mensagem indicando a ordem sorteada para apresentação

        // Loop para exibir a ordem sorteada para apresentação dos alunos
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + ". " + alunos[i]); // Exibe o número de ordem e o nome do aluno na ordem sorteada
        }

        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }
}

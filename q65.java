import java.util.Scanner;

public class q65 { // Declaração da classe q65
    public static void main(String[] args) { // Método principal
        Scanner scanner = new Scanner(System.in); // Criação de um objeto Scanner para entrada de dados

        int soma = 0; // Variável para armazenar a soma dos números digitados
        int quantidade = 0; // Variável para contar a quantidade de números digitados
        int maior = Integer.MIN_VALUE; // Variável para armazenar o maior número digitado (inicializado com o menor valor possível para int)
        int menor = Integer.MAX_VALUE; // Variável para armazenar o menor número digitado (inicializado com o maior valor possível para int)
        char continuar; // Variável para armazenar a opção de continuar ou não

        do { // Loop do-while para permitir que o usuário digite números enquanto desejar
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt(); // Lê o número inteiro digitado pelo usuário

            soma += numero; // Adiciona o número à soma
            quantidade++; // Incrementa a quantidade de números digitados

            if (numero > maior) { // Verifica se o número digitado é maior que o maior número registrado até agora
                maior = numero; // Se for, atualiza o valor da variável 'maior'
            }

            if (numero < menor) { // Verifica se o número digitado é menor que o menor número registrado até agora
                menor = numero; // Se for, atualiza o valor da variável 'menor'
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.next().charAt(0); // Lê o caractere indicando se o usuário deseja continuar ou não
        } while (continuar == 'S' || continuar == 's'); // O loop continua enquanto o usuário digitar 'S' ou 's'

        if (quantidade > 0) { // Verifica se pelo menos um número foi digitado
            double media = (double) soma / quantidade; // Calcula a média dos números digitados
            System.out.printf("Média dos valores digitados: %.2f\n", media); // Exibe a média formatada com duas casas decimais
            System.out.println("Maior valor digitado: " + maior); // Exibe o maior número digitado
            System.out.println("Menor valor digitado: " + menor); // Exibe o menor número digitado
        } else {
            System.out.println("Nenhum número foi digitado."); // Se nenhum número foi digitado, exibe esta mensagem
        }

        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }
}

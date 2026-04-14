import java.util.Scanner;

public class betoneira {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
            double pesoAlvo = 500.0; // Limite de brita em kg
            double pesoAtual = 0.0; // Peso atual da brita na betoneira
            int ciclo = 0; // Contador de ciclos

            System.out.println("Bem-vindo à Betoneira!");
            System.out.println("Meta: " + pesoAlvo + "kg de brita.");

            do {
                System.out.print("Digite o peso da brita a ser adicionada (kg): ");
                double pesoAdicionado = scanner.nextDouble();

                if (pesoAdicionado < 0) {
                    System.out.println("Peso inválido. Por favor, insira um valor positivo.");
                    continue;
                }

                pesoAtual += pesoAdicionado;
                ciclo++;

                System.out.println("Ciclo " + ciclo + ": Peso atual da brita = " + pesoAtual + "kg");

                if (pesoAtual >= pesoAlvo) {
                    System.out.println("Meta atingida! A betoneira está cheia.");
                    break;
                }
            } while (true);

            if (pesoAtual > pesoAlvo) {
                System.out.println("Atenção: A betoneira excedeu o limite de peso!");
            }

            scanner.close();

    }
}
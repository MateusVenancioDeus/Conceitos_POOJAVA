import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        carro Carro = new carro();
        Carro.modelo = "Porche Panamera";
        Carro.cor = "Amarelo";
        Carro.ano = "2025";
        Carro.placa = "AL563T";
        Carro.mostrarDetalhes();

        motor motor = new motor();
        motor.nome = "A combustao";
        motor.cavalos = 500;
        motor.tipo = "Gasolina";
        motor.DetalhesMotor();

        int i = 0;
        // Cria o laço que roda apenas uma vez
        while (i < 1) {
            System.out.println("Quer ligar seu carro? (sim / nao)");
            String escolha = sc.next();

            if (escolha.equalsIgnoreCase("sim")) {
                System.out.println("Seu carro ligou, escuta esse barulho cara que isso!");

                System.out.println("------ ** ------");

                // Pergunta para desligar
                System.out.println("Quer desligar o carro? (sim / nao)");
                String desliga = sc.next();

                //.equalsIgnoreCase() quando quiser comparar Strings sem se importar com letras maiúsculas ou minúsculas.
                //.contentEquals() quando precisar comparar uma String com outros tipos de sequência de caracteres.
                //.equals() quando quiser uma comparação exata de conteúdo.

                if (desliga.equalsIgnoreCase("sim")) {
                    System.out.println("Carro desligado com sucesso!");
                } else if (desliga.equalsIgnoreCase("nao")) {
                    System.out.println("O carro continua ligado!");
                } else {
                    System.out.println("Opção inválida!");
                }

            } else if (escolha.equalsIgnoreCase("nao")) {
                System.out.println("Carro desligado!");
            } else {
                System.out.println("Opção inválida!");
            }

            i++; // garante que vai rodar só uma vez o laço!
        }

        sc.close();
    }
}

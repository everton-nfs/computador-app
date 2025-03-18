package main.java.com.jaylan.projeto.servico;

import java.util.Scanner;

import main.java.com.jaylan.projeto.modelo.Computador;

public class ComputadorServico {
    private final Scanner scanner = new Scanner(System.in);

    public void criarComputadoresDefault(Computador[] computadores, int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            System.out.print("\n");
            computadores[i] = new Computador();
            System.out.println("Digite os dados do Computador " + (i + 1) + ":");
            System.out.print("Marca: ");
            computadores[i].setMarca(scanner.nextLine());
            System.out.print("Modelo: ");
            computadores[i].setModelo(scanner.nextLine());
            System.out.print("Memória RAM (GB): ");
            computadores[i].setMemoriaRAM(scanner.nextInt());
            System.out.print("Armazenamento (GB): ");
            computadores[i].setArmazenamento(scanner.nextInt());
            System.out.print("Preço (R$): ");
            computadores[i].setPreco(scanner.nextDouble());
            scanner.nextLine(); // Consumir a quebra de linha
        }
    }

    public void criarComputadoresComParametros(Computador[] computadores, int quantidade) {
        for (int i = quantidade; i < quantidade * 2; i++) {
            System.out.print("\n");
            System.out.println("Digite os dados do Computador " + (i + 1) + ":");
            System.out.print("Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Memória RAM (GB): ");
            int memoriaRAM = scanner.nextInt();
            System.out.print("Armazenamento (GB): ");
            int armazenamento = scanner.nextInt();
            System.out.print("Preço (R$): ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha

            computadores[i] = new Computador(marca, modelo, memoriaRAM, armazenamento, preco);
        }
    }

    public void exibirComputadores(Computador[] computadores) {
        System.out.println("\n--- Dados dos Computadores Criados ---\n");
        for (Computador computador : computadores) {
            computador.imprimir();
        }
    }
}

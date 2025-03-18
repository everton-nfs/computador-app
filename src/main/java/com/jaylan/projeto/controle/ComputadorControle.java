package main.java.com.jaylan.projeto.controle;

import main.java.com.jaylan.projeto.modelo.Computador;
import main.java.com.jaylan.projeto.servico.ComputadorServico;

public class ComputadorControle {
    private ComputadorServico servico;

    public ComputadorControle() {
        this.servico = new ComputadorServico();
    }

    public void executar() {
        limparTela();
        
        Computador[] computadores = new Computador[4];

        // Criando computadores
        servico.criarComputadoresDefault(computadores, 2);
        servico.criarComputadoresComParametros(computadores, 2);

        // Exibindo computadores
        servico.exibirComputadores(computadores);
    }

    public void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                // Limpa para Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                // Limpa para Linux/Mac
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

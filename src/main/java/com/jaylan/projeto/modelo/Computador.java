package main.java.com.jaylan.projeto.modelo;

public class Computador {
    private String marca;
    private String modelo;
    private int memoriaRAM;
    private int armazenamento;
    private double preco;

    public Computador() {}

    public Computador(String marca, String modelo, int memoriaRAM, int armazenamento, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.preco = preco;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getMemoriaRAM() { return memoriaRAM; }
    public void setMemoriaRAM(int memoriaRAM) { this.memoriaRAM = memoriaRAM; }

    public int getArmazenamento() { return armazenamento; }
    public void setArmazenamento(int armazenamento) { this.armazenamento = armazenamento; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Memória RAM: " + memoriaRAM + "GB");
        System.out.println("Armazenamento: " + armazenamento + "GB");
        System.out.println("Preço: R$ " + preco);
        System.out.println("-------------------------");
    }
}

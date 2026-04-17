package br.com.fiapride.model;

public class Celular {
    private String cor;
    private String marca;
    private double preco;
    private boolean ligado = false;
    private int cargaBateria;

    public Celular(String cor, String marca, int cargaBateria) {
        this.cor = cor;
        this.marca = marca;
        this.cargaBateria = cargaBateria;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        if (preco < 0) {
            System.out.println("Erro: O preco nao pode ser negativo");
        } else {
            this.preco = preco;
        }
    }

    public void ligar(){
        if (cargaBateria <= 0) {
            System.out.println("Erro: Celular sem carga!");
        }
        else if (ligado) {
            System.out.println("Erro: O celular já está ligado");
        }
        else {
            ligado = true;
            System.out.println("O celular ligou. Carga: " + cargaBateria + "%");
        }
    }

    public void aplicarDesconto(double valorDesconto) {
        if (valorDesconto > preco) {
            System.out.println("Erro: o desconto nao pode ser maior que o preco");
        }
        else if (valorDesconto < 0) {
            System.out.println("Erro: Desconto invalido");
        }
        else {
            preco -= valorDesconto;
            System.out.println("Desconto aplicado, novo preco: R$" + preco);
        }
    }
}
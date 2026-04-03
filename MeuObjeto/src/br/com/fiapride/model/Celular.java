package br.com.fiapride.model;

public class Celular {
    public String cor;
    public String marca;
    public double preco;
    public boolean ligado = false;

    public void ligar(){
        if (ligado) {
            System.out.println("Erro o celular ja esta ligado");
        }
        else {
            ligado = true;
            System.out.println("O celular ligou");
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

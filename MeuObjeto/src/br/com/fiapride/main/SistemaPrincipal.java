package br.com.fiapride.main;

import br.com.fiapride.model.Celular;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Celular meuCelular = new Celular();
        meuCelular.cor = "Preto";
        meuCelular.marca = "Samsung";
        meuCelular.preco = 2300.0;

        Celular CelularDoLuiz = new Celular();
        CelularDoLuiz.cor = "Azul";
        CelularDoLuiz.marca = "Apple";
        CelularDoLuiz.preco = 4000.0;


        System.out.println("Meu celular e da: " + meuCelular.marca);
        meuCelular.ligar();
        meuCelular.ligar();
        meuCelular.aplicarDesconto(300.0);

        System.out.println("o celular do luiz e da: " + CelularDoLuiz.marca);
        CelularDoLuiz.aplicarDesconto(5000.0);
    }

}

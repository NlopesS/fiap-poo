package br.com.fiapride.main;

import br.com.fiapride.model.Celular;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Celular meuCelular = new Celular();
        meuCelular.cor = "Preto";
        meuCelular.marca = "Samsung";
        meuCelular.preco = "R$2300";

        Celular CelularDoLuiz = new Celular();
        CelularDoLuiz.cor = "Azul";
        CelularDoLuiz.marca = "Apple";
        CelularDoLuiz.preco = "R$4000";

        System.out.println("Meu celular e da: " + meuCelular.marca);
        System.out.println("o celular do luiz e da: " + CelularDoLuiz.marca);
    }

}

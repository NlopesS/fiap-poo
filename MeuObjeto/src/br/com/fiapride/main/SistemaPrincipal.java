package br.com.fiapride.main;

import br.com.fiapride.model.Celular;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Celular meuCelular = new Celular();
        meuCelular.setCor("Preto");
        meuCelular.setMarca("Samsung");
        meuCelular.setPreco(2300.0);

        Celular CelularDoLuiz = new Celular();
        CelularDoLuiz.setCor("Azul");
        CelularDoLuiz.setMarca("Apple");
        CelularDoLuiz.setPreco(4000.0);


        System.out.println("Meu celular e da: " + meuCelular.getMarca());
        meuCelular.ligar();
        meuCelular.ligar();
        meuCelular.aplicarDesconto(300.0);

        System.out.println("o celular do luiz e da: " + CelularDoLuiz.getMarca());
        CelularDoLuiz.aplicarDesconto(5000.0);
    }

}

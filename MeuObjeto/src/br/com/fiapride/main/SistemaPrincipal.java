package br.com.fiapride.main;

import br.com.fiapride.model.Celular;
import br.com.fiapride.model.Bateria;
import br.com.fiapride.model.Android;
import br.com.fiapride.model.Iphone;

public class SistemaPrincipal {

    public static void main(String[] args) {

        Android meuCelular = new Android("Preto", "Samsung", 100, "Android 14");
        meuCelular.setPreco(2300.0);
        meuCelular.ligar();
        meuCelular.abrirGooglePlay();

        Iphone CelularDoLuiz = new Iphone("Azul", "Apple", 0, "ios 17");
        CelularDoLuiz.setPreco(4000.0);
        CelularDoLuiz.ligar();
        CelularDoLuiz.usarFaceID();
        
        System.out.println("Meu celular e da: " + meuCelular.getMarca() + meuCelular.getCor());
        meuCelular.ligar();
        meuCelular.aplicarDesconto(300.0);

        System.out.println("o celular do luiz e da: " + CelularDoLuiz.getMarca());
        CelularDoLuiz.ligar();
        CelularDoLuiz.aplicarDesconto(5000.0);

    }

}

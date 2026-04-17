package br.com.fiapride.model;

public class Iphone extends Celular {
    private String versaoIos;

    public Iphone(String cor, String marca, int cargaBateria, String versaoIos) {
        super(cor, marca, cargaBateria);
        this.versaoIos = versaoIos;
    }

    public void usarFaceID() {
        System.out.println("Escaneando rosto no iOS " + versaoIos);
    }
}
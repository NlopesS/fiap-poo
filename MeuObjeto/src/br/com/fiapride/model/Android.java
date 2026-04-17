package br.com.fiapride.model;

public class Android extends Celular {
    private String versaoSistema;

    public Android(String cor, String marca, int cargaBateria, String versaoSistema) {
        super(cor, marca, cargaBateria);
        this.versaoSistema = versaoSistema;
    }

    public void abrirGooglePlay() {
        System.out.println("Abrindo a Google Play Store no Android " + versaoSistema);
    }
}
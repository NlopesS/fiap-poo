package br.com.fiapride.model;

public class Bateria {
    private int carga;

    public Bateria(int cargaInicial) {
        this.carga = cargaInicial;
    }

    public int getCarga() {
        return carga;
    }

    public void carregar(int quantidade) {
        if (carga + quantidade > 100) {
            carga = 100;
        } else {
            carga += quantidade;
        }
        System.out.println("Carregando... Carga atual: " + carga + "%");
    }

    public void gastar(int quantidade) {
        if (carga - quantidade < 0) {
            carga = 0;
        } else {
            carga -= quantidade;
        }
    }
}
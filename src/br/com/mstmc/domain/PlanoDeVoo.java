package br.com.mstmc.domain;

import java.util.List;

public class PlanoDeVoo {
    private String id;
    private String origem;
    private String destino;
    private List<String> rotaSegura;
    private String tempoEstimado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public List<String> getRotaSegura() {
        return rotaSegura;
    }

    public void setRotaSegura(List<String> rotaSegura) {
        this.rotaSegura = rotaSegura;
    }

    public String getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(String tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }
}

package br.com.mstmc.domain;

public class EventoClimatico {
    private String id;
    private String tipo;
    private String intensidade;
    private String localizacao;
    private boolean detectado;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(String intensidade) {
        this.intensidade = intensidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public boolean isDetectado() {
        return detectado;
    }

    public void setDetectado(boolean detectado) {
        this.detectado = detectado;
    }
}

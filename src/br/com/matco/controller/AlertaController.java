package br.com.matco.controller;

import br.com.matco.domain.Alerta;
import br.com.matco.service.AlertaService;

import java.util.List;

public class AlertaController {
    private final AlertaService alertaService;

    public AlertaController() {
        this.alertaService = new AlertaService();
    }

    public void createAlerta(Alerta alerta) {
        alertaService.createAlerta(alerta);
    }

    public List<Alerta> listAlertas() {
        return alertaService.listAlertas();
    }
}

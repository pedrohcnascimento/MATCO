package br.com.mstmc.controller;

import br.com.mstmc.domain.PlanoDeVoo;
import br.com.mstmc.service.PlanoDeVooService;

import java.util.List;

public class PlanoDeVooController {
    private final PlanoDeVooService planoDeVooService;

    public PlanoDeVooController() {
        this.planoDeVooService = new PlanoDeVooService();
    }

    public void createPlanoDeVoo(PlanoDeVoo planoDeVoo) {
        planoDeVooService.createPlanoDeVoo(planoDeVoo);
    }

    public List<PlanoDeVoo> listPlanosDeVoo() {
        return planoDeVooService.listPlanosDeVoo();
    }
}

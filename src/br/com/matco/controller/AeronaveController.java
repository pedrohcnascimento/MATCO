package br.com.matco.controller;

import br.com.matco.domain.Aeronave;
import br.com.matco.service.AeronaveService;

import java.util.List;

public class AeronaveController {
    private final AeronaveService aeronaveService;

    public AeronaveController() {
        this.aeronaveService = new AeronaveService();
    }

    public void createAeronave(Aeronave aeronave) {
        aeronaveService.createAeronave(aeronave);
    }

    public List<Aeronave> listAeronaves() {
        return aeronaveService.listAeronaves();
    }
}

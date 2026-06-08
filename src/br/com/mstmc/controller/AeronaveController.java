package br.com.mstmc.controller;

import br.com.mstmc.domain.Aeronave;
import br.com.mstmc.service.AeronaveService;

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

package br.com.mstmc.service;

import br.com.mstmc.domain.PlanoDeVoo;
import br.com.mstmc.repository.GenericRepository;

import java.util.List;
import java.util.UUID;

public class PlanoDeVooService {
    private final GenericRepository<PlanoDeVoo> planoDeVooRepository;

    public PlanoDeVooService() {
        this.planoDeVooRepository = new GenericRepository<>();
    }

    public void createPlanoDeVoo(PlanoDeVoo planoDeVoo) {
        planoDeVoo.setId(UUID.randomUUID().toString());
        planoDeVooRepository.save(planoDeVoo);
    }

    public List<PlanoDeVoo> listPlanosDeVoo() {
        return planoDeVooRepository.findAll();
    }
}

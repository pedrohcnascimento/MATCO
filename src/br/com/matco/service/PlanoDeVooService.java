package br.com.matco.service;

import br.com.matco.domain.PlanoDeVoo;
import br.com.matco.repository.GenericRepository;

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

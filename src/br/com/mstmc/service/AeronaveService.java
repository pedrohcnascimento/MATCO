package br.com.mstmc.service;

import br.com.mstmc.domain.Aeronave;
import br.com.mstmc.repository.GenericRepository;

import java.util.List;
import java.util.UUID;

public class AeronaveService {
    private final GenericRepository<Aeronave> aeronaveRepository;

    public AeronaveService() {
        this.aeronaveRepository = new GenericRepository<>();
    }

    public void createAeronave(Aeronave aeronave) {
        aeronave.setId(UUID.randomUUID().toString());
        aeronaveRepository.save(aeronave);
    }

    public List<Aeronave> listAeronaves() {
        return aeronaveRepository.findAll();
    }
}

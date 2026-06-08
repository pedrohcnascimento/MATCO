package br.com.mstmc.service;

import br.com.mstmc.domain.Alerta;
import br.com.mstmc.repository.GenericRepository;

import java.util.List;
import java.util.UUID;

public class AlertaService {
    private final GenericRepository<Alerta> alertaRepository;

    public AlertaService() {
        this.alertaRepository = new GenericRepository<>();
    }

    public void createAlerta(Alerta alerta) {
        alerta.setId(UUID.randomUUID().toString());
        alertaRepository.save(alerta);
    }

    public List<Alerta> listAlertas() {
        return alertaRepository.findAll();
    }
}

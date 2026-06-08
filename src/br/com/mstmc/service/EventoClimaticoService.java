package br.com.mstmc.service;

import br.com.mstmc.domain.EventoClimatico;
import br.com.mstmc.repository.GenericRepository;

import java.util.List;
import java.util.UUID;

public class EventoClimaticoService {
    private final GenericRepository<EventoClimatico> eventoClimaticoRepository;

    public EventoClimaticoService() {
        this.eventoClimaticoRepository = new GenericRepository<>();
    }

    public void createEventoClimatico(EventoClimatico eventoClimatico) {
        eventoClimatico.setId(UUID.randomUUID().toString());
        eventoClimaticoRepository.save(eventoClimatico);
    }

    public List<EventoClimatico> listEventosClimaticos() {
        return eventoClimaticoRepository.findAll();
    }
}

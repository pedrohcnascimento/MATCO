package br.com.mstmc.controller;

import br.com.mstmc.domain.EventoClimatico;
import br.com.mstmc.service.EventoClimaticoService;

import java.util.List;

public class EventoClimaticoController {
    private final EventoClimaticoService eventoClimaticoService;

    public EventoClimaticoController() {
        this.eventoClimaticoService = new EventoClimaticoService();
    }

    public void createEventoClimatico(EventoClimatico eventoClimatico) {
        eventoClimaticoService.createEventoClimatico(eventoClimatico);
    }

    public List<EventoClimatico> listEventosClimaticos() {
        return eventoClimaticoService.listEventosClimaticos();
    }
}

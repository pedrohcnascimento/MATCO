package br.com.matco.controller;

import br.com.matco.domain.EventoClimatico;
import br.com.matco.service.EventoClimaticoService;

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

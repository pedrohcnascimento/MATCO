package br.com.matco.service;

import br.com.matco.domain.Drone;
import br.com.matco.repository.GenericRepository;

import java.util.List;
import java.util.UUID;

public class DroneService {
    private final GenericRepository<Drone> droneRepository;

    public DroneService() {
        this.droneRepository = new GenericRepository<>();
    }

    public void createDrone(Drone drone) {
        drone.setId(UUID.randomUUID().toString());
        droneRepository.save(drone);
    }

    public List<Drone> listDrones() {
        return droneRepository.findAll();
    }
}

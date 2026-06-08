package br.com.mstmc.controller;

import br.com.mstmc.domain.Drone;
import br.com.mstmc.service.DroneService;

import java.util.List;

public class DroneController {
    private final DroneService droneService;

    public DroneController() {
        this.droneService = new DroneService();
    }

    public void createDrone(Drone drone) {
        droneService.createDrone(drone);
    }

    public List<Drone> listDrones() {
        return droneService.listDrones();
    }
}

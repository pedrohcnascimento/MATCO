package br.com.matco.interfaces;

import br.com.matco.controller.AeronaveController;
import br.com.matco.controller.AlertaController;
import br.com.matco.controller.DroneController;
import br.com.matco.controller.EventoClimaticoController;
import br.com.matco.controller.PlanoDeVooController;
import br.com.matco.domain.Aeronave;
import br.com.matco.domain.Alerta;
import br.com.matco.domain.Drone;
import br.com.matco.domain.EventoClimatico;
import br.com.matco.domain.PlanoDeVoo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exibition {
    private static final Scanner scanner = new Scanner(System.in);
    private static final AeronaveController aeronaveController = new AeronaveController();
    private static final EventoClimaticoController eventoClimaticoController = new EventoClimaticoController();
    private static final DroneController droneController = new DroneController();
    private static final AlertaController alertaController = new AlertaController();
    private static final PlanoDeVooController planoDeVooController = new PlanoDeVooController();

    public static void main(String[] args) {
        System.out.println(Texts.WELCOME);
        boolean running = true;

        while (running) {
            Menus.showMainMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    handleAeronaveMenu();
                    break;
                case "2":
                    handleEventoClimaticoMenu();
                    break;
                case "3":
                    handleDroneMenu();
                    break;
                case "4":
                    handleAlertaMenu();
                    break;
                case "5":
                    handlePlanoDeVooMenu();
                    break;
                case "0":
                    System.out.println(Texts.EXIT_MESSAGE);
                    running = false;
                    break;
                default:
                    System.out.println(Texts.INVALID_OPTION);
            }
        }
    }

    private static void handleAeronaveMenu() {
        boolean back = false;
        while (!back) {
            Menus.showAeronaveMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createAeronave();
                    break;
                case "2":
                    listAeronaves();
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println(Texts.INVALID_OPTION);
            }
        }
    }

    private static void createAeronave() {
        System.out.print(Texts.PROMPT_MODELO_AERONAVE);
        String modelo = scanner.nextLine();
        System.out.print(Texts.PROMPT_STATUS_AERONAVE);
        String status = scanner.nextLine();

        Aeronave novaAeronave = new Aeronave();
        novaAeronave.setModelo(modelo);
        novaAeronave.setStatus(status);

        aeronaveController.createAeronave(novaAeronave);
        System.out.println(Texts.SUCCESS_CREATE_AERONAVE);
    }

    private static void listAeronaves() {
        System.out.println("\n--- Lista de Aeronaves ---");
        aeronaveController.listAeronaves().forEach(a ->
                System.out.println("ID: " + a.getId() + " | Modelo: " + a.getModelo() + " | Status: " + a.getStatus())
        );
    }

    private static void handleEventoClimaticoMenu() {
        boolean back = false;
        while (!back) {
            Menus.showEventoClimaticoMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createEventoClimatico();
                    break;
                case "2":
                    listEventosClimaticos();
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println(Texts.INVALID_OPTION);
            }
        }
    }

    private static void createEventoClimatico() {
        System.out.print(Texts.PROMPT_TIPO_EVENTO);
        String tipo = scanner.nextLine();
        System.out.print(Texts.PROMPT_INTENSIDADE_EVENTO);
        String intensidade = scanner.nextLine();
        System.out.print(Texts.PROMPT_LOCALIZACAO_EVENTO);
        String localizacao = scanner.nextLine();
        System.out.print(Texts.PROMPT_DETECTADO_EVENTO);
        boolean detectado = Boolean.parseBoolean(scanner.nextLine());

        EventoClimatico novoEvento = new EventoClimatico();
        novoEvento.setTipo(tipo);
        novoEvento.setIntensidade(intensidade);
        novoEvento.setLocalizacao(localizacao);
        novoEvento.setDetectado(detectado);

        eventoClimaticoController.createEventoClimatico(novoEvento);
        System.out.println(Texts.SUCCESS_CREATE_EVENTO_CLIMATICO);
    }

    private static void listEventosClimaticos() {
        System.out.println("\n--- Lista de Eventos Climáticos ---");
        eventoClimaticoController.listEventosClimaticos().forEach(e ->
                System.out.println("ID: " + e.getId() + " | Tipo: " + e.getTipo() + " | Intensidade: " + e.getIntensidade() + " | Localização: " + e.getLocalizacao() + " | Detectado: " + e.isDetectado())
        );
    }

    private static void handleDroneMenu() {
        boolean back = false;
        while (!back) {
            Menus.showDroneMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createDrone();
                    break;
                case "2":
                    listDrones();
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println(Texts.INVALID_OPTION);
            }
        }
    }

    private static void createDrone() {
        System.out.print(Texts.PROMPT_MODELO_DRONE);
        String modelo = scanner.nextLine();
        System.out.print(Texts.PROMPT_STATUS_DRONE);
        String status = scanner.nextLine();
        System.out.print(Texts.PROMPT_LOCALIZACAO_DRONE);
        String localizacao = scanner.nextLine();

        Drone novoDrone = new Drone();
        novoDrone.setModelo(modelo);
        novoDrone.setStatus(status);
        novoDrone.setLocalizacao(localizacao);

        droneController.createDrone(novoDrone);
        System.out.println(Texts.SUCCESS_CREATE_DRONE);
    }

    private static void listDrones() {
        System.out.println("\n--- Lista de Drones ---");
        droneController.listDrones().forEach(d ->
                System.out.println("ID: " + d.getId() + " | Modelo: " + d.getModelo() + " | Status: " + d.getStatus() + " | Localização: " + d.getLocalizacao())
        );
    }

    private static void handleAlertaMenu() {
        boolean back = false;
        while (!back) {
            Menus.showAlertaMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createAlerta();
                    break;
                case "2":
                    listAlertas();
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println(Texts.INVALID_OPTION);
            }
        }
    }

    private static void createAlerta() {
        System.out.print(Texts.PROMPT_TIPO_ALERTA);
        String tipo = scanner.nextLine();
        System.out.print(Texts.PROMPT_MENSAGEM_ALERTA);
        String mensagem = scanner.nextLine();
        System.out.print(Texts.PROMPT_LOCALIZACAO_ALERTA);
        String localizacao = scanner.nextLine();

        Alerta novoAlerta = new Alerta();
        novoAlerta.setTipo(tipo);
        novoAlerta.setMensagem(mensagem);
        novoAlerta.setLocalizacao(localizacao);

        alertaController.createAlerta(novoAlerta);
        System.out.println(Texts.SUCCESS_CREATE_ALERTA);
    }

    private static void listAlertas() {
        System.out.println("\n--- Lista de Alertas ---");
        alertaController.listAlertas().forEach(a ->
                System.out.println("ID: " + a.getId() + " | Tipo: " + a.getTipo() + " | Mensagem: " + a.getMensagem() + " | Localização: " + a.getLocalizacao())
        );
    }

    private static void handlePlanoDeVooMenu() {
        boolean back = false;
        while (!back) {
            Menus.showPlanoDeVooMenu();
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    createPlanoDeVoo();
                    break;
                case "2":
                    listPlanosDeVoo();
                    break;
                case "0":
                    back = true;
                    break;
                default:
                    System.out.println(Texts.INVALID_OPTION);
            }
        }
    }

    private static void createPlanoDeVoo() {
        System.out.print(Texts.PROMPT_ORIGEM_PLANO);
        String origem = scanner.nextLine();
        System.out.print(Texts.PROMPT_DESTINO_PLANO);
        String destino = scanner.nextLine();
        System.out.print(Texts.PROMPT_ROTA_SEGURA_PLANO);
        String rotaSeguraStr = scanner.nextLine();
        List<String> rotaSegura = Arrays.asList(rotaSeguraStr.split(",\s*"));
        System.out.print(Texts.PROMPT_TEMPO_ESTIMADO_PLANO);
        String tempoEstimado = scanner.nextLine();

        PlanoDeVoo novoPlanoDeVoo = new PlanoDeVoo();
        novoPlanoDeVoo.setOrigem(origem);
        novoPlanoDeVoo.setDestino(destino);
        novoPlanoDeVoo.setRotaSegura(rotaSegura);
        novoPlanoDeVoo.setTempoEstimado(tempoEstimado);

        planoDeVooController.createPlanoDeVoo(novoPlanoDeVoo);
        System.out.println(Texts.SUCCESS_CREATE_PLANO_DE_VOO);
    }

    private static void listPlanosDeVoo() {
        System.out.println("\n--- Lista de Planos de Voo ---");
        planoDeVooController.listPlanosDeVoo().forEach(p ->
                System.out.println("ID: " + p.getId() + " | Origem: " + p.getOrigem() + " | Destino: " + p.getDestino() + " | Rota Segura: " + p.getRotaSegura() + " | Tempo Estimado: " + p.getTempoEstimado())
        );
    }
}

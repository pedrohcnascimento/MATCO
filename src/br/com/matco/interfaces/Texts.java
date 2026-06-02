package br.com.matco.interfaces;

public class Texts {
    public static final String WELCOME = "\nBem-vindo ao Sistema MARS AIR TRAFFIC & CLIMATE OPS (MATCO)!\n";
    public static final String MAIN_MENU_TITLE = "\n--- MENU PRINCIPAL ---";
    public static final String OPTION_AERONAVE = "1. Gerenciar Aeronaves";
    public static final String OPTION_EVENTO_CLIMATICO = "2. Gerenciar Eventos Climáticos";
    public static final String OPTION_DRONE = "3. Gerenciar Drones";
    public static final String OPTION_ALERTA = "4. Gerenciar Alertas";
    public static final String OPTION_PLANO_DE_VOO = "5. Gerenciar Planos de Voo";
    public static final String OPTION_EXIT = "0. Sair";
    public static final String INVALID_OPTION = "Opção inválida. Tente novamente.";
    public static final String EXIT_MESSAGE = "Saindo do sistema MATCO. Até logo!";

    // Aeronave Menu
    public static final String AERONAVE_MENU_TITLE = "\n--- MENU DE AERONAVES ---";
    public static final String AERONAVE_CREATE = "1. Cadastrar Aeronave";
    public static final String AERONAVE_LIST = "2. Listar Aeronaves";
    public static final String AERONAVE_BACK = "0. Voltar ao Menu Principal";
    public static final String PROMPT_MODELO_AERONAVE = "Digite o modelo da aeronave: ";
    public static final String PROMPT_STATUS_AERONAVE = "Digite o status da aeronave: ";
    public static final String SUCCESS_CREATE_AERONAVE = "Aeronave cadastrada com sucesso!";

    // Evento Climático Menu
    public static final String EVENTO_CLIMATICO_MENU_TITLE = "\n--- MENU DE EVENTOS CLIMÁTICOS ---";
    public static final String EVENTO_CLIMATICO_CREATE = "1. Cadastrar Evento Climático";
    public static final String EVENTO_CLIMATICO_LIST = "2. Listar Eventos Climáticos";
    public static final String EVENTO_CLIMATICO_BACK = "0. Voltar ao Menu Principal";
    public static final String PROMPT_TIPO_EVENTO = "Digite o tipo do evento climático (ex: Tempestade de Poeira): ";
    public static final String PROMPT_INTENSIDADE_EVENTO = "Digite a intensidade do evento (ex: Leve, Moderada, Severa): ";
    public static final String PROMPT_LOCALIZACAO_EVENTO = "Digite a localização do evento: ";
    public static final String PROMPT_DETECTADO_EVENTO = "O evento foi detectado? (true/false): ";
    public static final String SUCCESS_CREATE_EVENTO_CLIMATICO = "Evento Climático cadastrado com sucesso!";

    // Drone Menu
    public static final String DRONE_MENU_TITLE = "\n--- MENU DE DRONES ---";
    public static final String DRONE_CREATE = "1. Cadastrar Drone";
    public static final String DRONE_LIST = "2. Listar Drones";
    public static final String DRONE_BACK = "0. Voltar ao Menu Principal";
    public static final String PROMPT_MODELO_DRONE = "Digite o modelo do drone: ";
    public static final String PROMPT_STATUS_DRONE = "Digite o status do drone: ";
    public static final String PROMPT_LOCALIZACAO_DRONE = "Digite a localização do drone: ";
    public static final String SUCCESS_CREATE_DRONE = "Drone cadastrado com sucesso!";

    // Alerta Menu
    public static final String ALERTA_MENU_TITLE = "\n--- MENU DE ALERTAS ---";
    public static final String ALERTA_CREATE = "1. Emitir Alerta";
    public static final String ALERTA_LIST = "2. Listar Alertas";
    public static final String ALERTA_BACK = "0. Voltar ao Menu Principal";
    public static final String PROMPT_TIPO_ALERTA = "Digite o tipo do alerta (ex: Climático, Operacional): ";
    public static final String PROMPT_MENSAGEM_ALERTA = "Digite a mensagem do alerta: ";
    public static final String PROMPT_LOCALIZACAO_ALERTA = "Digite a localização do alerta: ";
    public static final String SUCCESS_CREATE_ALERTA = "Alerta emitido com sucesso!";

    // Plano de Voo Menu
    public static final String PLANO_DE_VOO_MENU_TITLE = "\n--- MENU DE PLANOS DE VOO ---";
    public static final String PLANO_DE_VOO_CREATE = "1. Criar Plano de Voo";
    public static final String PLANO_DE_VOO_LIST = "2. Listar Planos de Voo";
    public static final String PLANO_DE_VOO_BACK = "0. Voltar ao Menu Principal";
    public static final String PROMPT_ORIGEM_PLANO = "Digite a origem do plano de voo: ";
    public static final String PROMPT_DESTINO_PLANO = "Digite o destino do plano de voo: ";
    public static final String PROMPT_ROTA_SEGURA_PLANO = "Digite a rota segura (separada por vírgulas): ";
    public static final String PROMPT_TEMPO_ESTIMADO_PLANO = "Digite o tempo estimado de voo: ";
    public static final String SUCCESS_CREATE_PLANO_DE_VOO = "Plano de Voo criado com sucesso!";

}

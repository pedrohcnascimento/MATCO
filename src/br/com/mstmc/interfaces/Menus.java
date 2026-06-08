package br.com.mstmc.interfaces;

public class Menus {
    
    public static void showMainMenu() {
        System.out.println(Texts.MAIN_MENU_TITLE);
        System.out.println(Texts.OPTION_AERONAVE);
        System.out.println(Texts.OPTION_EVENTO_CLIMATICO);
        System.out.println(Texts.OPTION_DRONE);
        System.out.println(Texts.OPTION_ALERTA);
        System.out.println(Texts.OPTION_PLANO_DE_VOO);
        System.out.println(Texts.OPTION_EXIT);
        System.out.print("Escolha uma opção: ");
    }

    public static void showAeronaveMenu() {
        System.out.println(Texts.AERONAVE_MENU_TITLE);
        System.out.println(Texts.AERONAVE_CREATE);
        System.out.println(Texts.AERONAVE_LIST);
        System.out.println(Texts.AERONAVE_BACK);
        System.out.print("Escolha uma opção: ");
    }

    public static void showEventoClimaticoMenu() {
        System.out.println(Texts.EVENTO_CLIMATICO_MENU_TITLE);
        System.out.println(Texts.EVENTO_CLIMATICO_CREATE);
        System.out.println(Texts.EVENTO_CLIMATICO_LIST);
        System.out.println(Texts.EVENTO_CLIMATICO_BACK);
        System.out.print("Escolha uma opção: ");
    }

    public static void showDroneMenu() {
        System.out.println(Texts.DRONE_MENU_TITLE);
        System.out.println(Texts.DRONE_CREATE);
        System.out.println(Texts.DRONE_LIST);
        System.out.println(Texts.DRONE_BACK);
        System.out.print("Escolha uma opção: ");
    }

    public static void showAlertaMenu() {
        System.out.println(Texts.ALERTA_MENU_TITLE);
        System.out.println(Texts.ALERTA_CREATE);
        System.out.println(Texts.ALERTA_LIST);
        System.out.println(Texts.ALERTA_BACK);
        System.out.print("Escolha uma opção: ");
    }

    public static void showPlanoDeVooMenu() {
        System.out.println(Texts.PLANO_DE_VOO_MENU_TITLE);
        System.out.println(Texts.PLANO_DE_VOO_CREATE);
        System.out.println(Texts.PLANO_DE_VOO_LIST);
        System.out.println(Texts.PLANO_DE_VOO_BACK);
        System.out.print("Escolha uma opção: ");
    }
}

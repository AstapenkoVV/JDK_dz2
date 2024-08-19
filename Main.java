package ru.gb.lisson2_dz;


import ru.gb.lisson2_dz.client.ClientController;
import ru.gb.lisson2_dz.client.ClientGUI;
import ru.gb.lisson2_dz.server.FileStorage;
import ru.gb.lisson2_dz.server.ServerController;
import ru.gb.lisson2_dz.server.ServerWindow;

public class Main {
    public static void main(String[] args) {

        ServerController serverController = new ServerController(new ServerWindow(), new FileStorage());
        new ClientController(new ClientGUI(), serverController);
        new ClientController(new ClientGUI(), serverController);
    }
}

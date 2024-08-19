package ru.gb.lisson1_dz;

import ru.gb.lisson1_dz.client.ClientGUI;
import ru.gb.lisson1_dz.server.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}

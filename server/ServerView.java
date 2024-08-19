package ru.gb.lisson2_dz.server;

public interface ServerView {
    void showMessage(String text);
    void setServerController(ServerController serverController);
}
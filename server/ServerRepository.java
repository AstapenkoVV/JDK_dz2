package ru.gb.lisson2_dz.server;

public interface ServerRepository {
    void saveInLog(String text);
    String readLog();
}
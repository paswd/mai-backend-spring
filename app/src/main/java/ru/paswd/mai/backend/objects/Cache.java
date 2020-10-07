package ru.paswd.mai.backend.objects;

public interface Cache {
    String get(String key);
    void put(String key, String value);
    void remove(String key);
}

package ru.paswd.mai.backend.objects.impl;

import org.springframework.stereotype.Component;
import ru.paswd.mai.backend.objects.Cache;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

@Component
public class LRUCache implements Cache {

    private int capacity = 10;

    private final Queue<String> queue = new LinkedList<>();

    private final Map<String, String> map = new HashMap<>();

    public LRUCache() {
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String get(String key) {
        if (!map.containsKey(key))
            return null;

        queue.remove(key);
        queue.add(key);

        return map.get(key);
    }

    @Override
    public void put(String key, String value) {
        if (!map.containsKey(key)) {
            if (queue.size() >= capacity) {
                String deleting = queue.remove();
                map.remove(deleting);
            }
        } else {
            queue.remove(key);
        }

        queue.add(key);
        map.put(key, value);
    }

    @Override
    public void remove(String key) {
        queue.remove(key);
        map.remove(key);
    }
}

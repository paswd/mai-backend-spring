package ru.paswd.mai.backend.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.paswd.mai.backend.objects.Cache;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CacheService {
    private final Cache cache;

    public String get(String key) {
        return cache.get(key);
    }

    public void put(String key, String value) {
        cache.put(key, value);
    }

    public void remove(String key) {
        cache.remove(key);
    }
}

package ru.paswd.mai.backend.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.paswd.mai.backend.api.CacheApi;
import ru.paswd.mai.backend.api.CacheCommand;
import ru.paswd.mai.backend.services.CacheService;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CacheController implements CacheApi {

    private final CacheService cacheService;

    @Override
    public String index(CacheCommand command, String key, String value) {
        switch (command) {
            case GET:
                return cacheService.get(key);

            case PUT:
                cacheService.put(key, value);
                return "OK";

            case REMOVE:
                cacheService.remove(key);
                return "OK";
        }

        return "Unknown command";
    }
}

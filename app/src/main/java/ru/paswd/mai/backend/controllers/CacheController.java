package ru.paswd.mai.backend.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import ru.paswd.mai.backend.api.CacheApi;
import ru.paswd.mai.backend.api.CacheCommand;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CacheController implements CacheApi {

    @Override
    public String index(CacheCommand command, String key, String value) {
        return "Hello world";
    }
}

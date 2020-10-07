package ru.paswd.mai.backend.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Api(tags = "cache")
@RequestMapping("/api/cache")
public interface CacheApi {
    @ApiOperation("Cache command")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 500, message = "Internal server error")
    })
    @GetMapping("index")
    String index(
            @RequestParam(name = "command") CacheCommand command,
            @RequestParam(name = "key") String key,
            @RequestParam(name = "value", required = false) String value
    );
}

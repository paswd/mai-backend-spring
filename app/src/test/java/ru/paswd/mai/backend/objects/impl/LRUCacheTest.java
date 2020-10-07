package ru.paswd.mai.backend.objects.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.paswd.mai.backend.objects.Cache;

public class LRUCacheTest {
    @Test
    public void testLRUCache() {
        Cache cache = new LRUCache(100);
        cache.put("Jesse", "Pinkman");
        cache.put("Walter", "White");
        cache.put("Jesse", "James");
        Assertions.assertEquals("James", cache.get("Jesse"));
        cache.remove("Walter");
        Assertions.assertNull(cache.get("Walter"));
    }
}

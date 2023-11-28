package com.bob;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class S20210440123_StoreTemplateFac {
    private static final Map<String, S20210440123_StoreTemplate> templates = new HashMap<>();

    public static S20210440123_StoreTemplate getTemplate(String style) {
        if (!templates.containsKey(style)) {
            templates.put(style, new S20210440123_ConcreteStoreTemplate(style));
        }
        return templates.get(style);
    }
}

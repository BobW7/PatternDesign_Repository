package com.bob.compositeFlyweight;

import java.util.HashMap;
import java.util.Map;

// 享元工厂类（复合享元）
public class S20210440123_CompoundStoreTemplateFactory {
    private static final Map<String, S20210440123_CompoundStoreTemplate> templates = new HashMap<>();

    public static S20210440123_CompoundStoreTemplate getTemplate(String logo) {
        if (!templates.containsKey(logo)) {
            templates.put(logo, new S20210440123_ConcreteCompoundStoreTemplate(logo));
        }
        return templates.get(logo);
    }
}
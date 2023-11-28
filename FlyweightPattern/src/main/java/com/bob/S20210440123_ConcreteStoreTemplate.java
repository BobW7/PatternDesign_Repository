package com.bob;

public class S20210440123_ConcreteStoreTemplate implements S20210440123_StoreTemplate {
    private String style;//内部状态，风格样式

    public S20210440123_ConcreteStoreTemplate(String style) {
        this.style = style;
    }

    @Override
    public void render(String content) {
        System.out.println("Render store with style: " + style + ", content: " + content);
    }
}

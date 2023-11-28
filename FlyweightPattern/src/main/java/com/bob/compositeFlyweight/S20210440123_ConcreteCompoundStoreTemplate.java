package com.bob.compositeFlyweight;

// 具体复合享元类 - 共享的网店模板
class S20210440123_ConcreteCompoundStoreTemplate implements S20210440123_CompoundStoreTemplate {
    private String logo; // 内部状态：logo
    private String style; // 外部状态：风格样式

    S20210440123_ConcreteCompoundStoreTemplate(String logo) {
        this.logo = logo;
    }

    public void render(String style) {
        renderStyle(style);
        System.out.println("Rendering store with logo: " + logo + ", style: " + this.style);
    }

    @Override
    public void renderStyle(String style) {
        this.style = style;
    }
}
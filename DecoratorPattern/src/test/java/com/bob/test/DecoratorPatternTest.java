package com.bob.test;

import com.bob.S20210440123_HappyPrince;
import com.bob.S20210440123_Prince;
import com.bob.cache.CharacterDecorator;
import com.bob.cache.MarriageDecorator;
import com.bob.cache.Prince;
import com.bob.decorators.*;
import org.junit.Test;

public class DecoratorPatternTest {
    @Test
    public void Test() {
        S20210440123_Prince prince = new S20210440123_HappyPrince();
        prince = new S20210440123_CharacterDecorator(prince, "高尚");
        prince = new S20210440123_BackgroundDecorator(prince, "名门之后");
        prince = new S20210440123_MarriageDecorator(prince, "未婚");
        prince = new S20210440123_CrushDecorator(prince, "暂无");
        prince = new S20210440123_PositionDecorator(prince, "王子");
        String description = prince.getDescription();
        System.out.println(description);
    }

    @Test
    public void Test1(){
        Prince prince = new Prince();
        prince = new CharacterDecorator(prince, "高尚");
        prince = new MarriageDecorator(prince, "未婚");
        String description = prince.getDescription();
        System.out.println(description);
    }
}

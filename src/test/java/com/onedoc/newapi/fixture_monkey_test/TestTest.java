package com.onedoc.newapi.fixture_monkey_test;


import com.navercorp.fixturemonkey.FixtureMonkey;
import com.navercorp.fixturemonkey.api.introspector.FieldReflectionArbitraryIntrospector;
import org.junit.jupiter.api.Test;

public class TestTest {
    @Test
    public void test() {
        FixtureMonkey sut = FixtureMonkey.builder()
                .objectIntrospector(FieldReflectionArbitraryIntrospector.INSTANCE)
                .build();

        var sample = sut.giveMeBuilder(PointTest.class)
                .sample();

        System.out.println(sample);
    }
}

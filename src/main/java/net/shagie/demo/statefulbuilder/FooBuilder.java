package net.shagie.demo.statefulbuilder;

public interface FooBuilder {
    FooBuilder setFoo(String foo);
    FooBuilder setQux(String qux);
    Thing build();
}

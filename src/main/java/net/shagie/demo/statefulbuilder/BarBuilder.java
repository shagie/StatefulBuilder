package net.shagie.demo.statefulbuilder;

public interface BarBuilder {
    BarBuilder setBar(String bar);
    BarBuilder setQux(String qux);
    Thing build();

}

package net.shagie.demo.statefulbuilder;

import sun.plugin.dom.exception.InvalidStateException;

public class ThingBuilder implements FooBuilder, BarBuilder {
    private String foo;
    private String bar;
    private String qux;


    public ThingBuilder() {
        foo = "";
        bar = "";
        qux = "";
    }


    public BarBuilder setBar(String bar) {
        this.bar = bar;
        return this;
    }

    public FooBuilder setFoo(String foo) {
        this.foo = foo;
        return this;
    }

    public ThingBuilder setQux(String qux) {
        this.qux = qux;
        return this;
    }

    public Thing build() {
        Thing rv;
        if(foo.isEmpty() && bar.isEmpty()) {
            throw new InvalidStateException("Both foo and bar empty");
        } else if(!foo.isEmpty()) {
            rv = new FooThing(foo, qux);
        } else {
            rv = new BarThing(bar, qux);
        }

        return rv;
    }
}

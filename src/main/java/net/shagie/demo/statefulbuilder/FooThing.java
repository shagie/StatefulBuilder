package net.shagie.demo.statefulbuilder;

public class FooThing extends Thing {
    private String foo;
    private String qux;

    FooThing(String foo, String qux) {
        this.foo = foo;
        this.qux = qux;
    }

    public String toString() {
        return "foo: " + foo + " qux: " + qux;
    }
}

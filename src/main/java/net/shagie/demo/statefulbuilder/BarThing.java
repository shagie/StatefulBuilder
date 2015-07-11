package net.shagie.demo.statefulbuilder;

public class BarThing extends Thing {
    private String bar;
    private String qux;

    BarThing(String bar, String qux) {
        this.bar = bar;
        this.qux = qux;
    }

    public String toString() {
        return "bar: " + bar + " qux: " + qux;
    }

}

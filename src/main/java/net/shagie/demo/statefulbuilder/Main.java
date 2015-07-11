package net.shagie.demo.statefulbuilder;

public class Main {
    public static void main(String[] args) {
        ThingBuilder builder = new ThingBuilder();
        Thing thing = builder.setQux("q")
         .setBar("b")
         .build();

        System.out.println(thing.getClass().toString() + ":: " + thing.toString());
    }
}

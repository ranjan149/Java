package org.example.encapsulation;

public class Encapsulation {

    public Encapsulation() {
        helloWorldString = getHelloWorld();
    }

    public Encapsulation(String xyz){
        this.xyz = xyz;
    }

    public Encapsulation (String xyz, String abc){
        this.abc = abc;
        this.xyz = xyz;
    }

    public Encapsulation(String xyz, String abc, String test){
        this(xyz, abc);
        this.test = test;
    }

    private String xyz;

    private String abc;

    private String test;

    private String helloWorldString;

    public String getAbc() {
        return this.getHelloWorld();
    }

    public String getHelloWorld() {
        return "Hello " + "World";
    }

    public Encapsulation setAbc(String abc) {
        this.abc = abc;
        return this;
    }

}


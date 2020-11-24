package com.Bogdan79eazy;

public class Svg implements Element{

    private String name;

    Svg(String name){
        this.name=name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void print() {
        System.out.println(this.name);
    }
}

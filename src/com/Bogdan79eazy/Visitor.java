package com.Bogdan79eazy;

public interface Visitor {
    void visit(Txt t);

    void visit(Mp3 m);

    void visit(Svg v);

    void visit(Director d);
}

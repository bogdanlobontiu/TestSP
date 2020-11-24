package com.Bogdan79eazy;

public class Main {

    public static void main(String[] args) {
        Director d1=new Director("Director1");
        Director d2=new Director("Director2");
        Txt text1=new Txt("text1");
        text1.setAlignStrategy(new AlignRight());
        d1.addContent(d2);
        d2.addContent(text1);
        Mp3 mp3=new Mp3("G-Eazy");
        Svg svg=new Svg("svg 1");
        d2.addContent(mp3);
        d1.addContent(svg);
        Txt text2=new Txt("text2");
        text2.setAlignStrategy(new AlignCenter());
        d2.addContent(text2);
        d1.print();

        FileSizes fileSizes=new FileSizes();
        d1.accept(fileSizes);
        fileSizes.printSizes();
    }
}

package com.Bogdan79eazy;

public  class FileSizes implements Visitor{

    int totalSize=0,directoare=0,totaSizeSvg=0,totalSizeMp3=0,totalSizeTxt=0;

    public void visit(Txt txt) {
        totalSize+=5;
        totalSizeTxt+=5;
    }
    public void visit(Mp3 mp3) {
        totalSize+=3000;
        totalSizeMp3+=3000;
    }
    public void visit(Svg svg) {
        totalSize+=45;
        totaSizeSvg+=45;
    }

    public void visit(Director director){
        directoare++;
    }

    public void printSizes(){
        System.out.println("\n Marimea totala a fisierelor: "+totalSize+" Kb, in total sunt   "+directoare+" directoare. Marimea totala a fisierlor" +
                "de tip SVG: "+totaSizeSvg+ " Kb. marimea totala a txt: "+ totalSizeTxt+ " Kb. Marimea totala mp3: "+totalSizeMp3+"Kb");
    }

}
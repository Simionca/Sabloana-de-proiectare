package Test;

import java.io.IOException;

public class test {

    public static void main(String[] args) throws Exception {
    Director dir = new Director("Director");
    txt txt1 = new txt("Geralt of Rivia is the main");
    txt txt2 = new txt("Tris merigold is his wife");
    txt txt3 = new txt("Yeniffer of Vengerberg was his wife");
    mp3 muz1 = new mp3("Gucci Gang");
    svg svg = new svg("svg");
    dir.add(txt1);
    dir.add(txt2);
    dir.add(txt3);
    dir.add(muz1);
    dir.add(svg);
    txt1.setAlignStratagy(new AlignLeft());
    txt2.setAlignStratagy(new AlignRight());
    txt3.setAlignStratagy(new AlignCenter());
    dir.print();
    SpatiuStatistics status = new SpatiuStatistics();
    dir.accept(status);
    status.printStatistics();
    }

}
  //  _____Geralt of Rivia is the main.txt
    //    Tris merigold is his wife.txt_____
    //    ___Yeniffer of Vengerberg was his wife.txt___
   //     Gucci Gang.mp3
   //     svg.svg
   //     Director Statistics:
   //     *** Spatiu txt: 15 Kb
   //     *** Spatiu svg: 45 Kb
  //      *** Spatiu mp3: 3 Mb

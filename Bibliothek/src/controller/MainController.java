package controller;

import java.util.ArrayList;

import model.Buch;
import model.Hoerspiel;
import model.Leihwahre;
import model.Spiel;
import view.Output;


public class MainController {

    public MainController(){
        //Demodata

        ArrayList<Leihwahre> leihwahren = new ArrayList<Leihwahre>();

        Buch b = new Buch("Die Schöne und das Biest", "2345", "Gebrüder Grimm");
        leihwahren.add(b);
        Hoerspiel h = new Hoerspiel("Die Teeprinzessin", "1234", 123.83);
        leihwahren.add(h);
        Spiel s = new Spiel("Schneckenrennen", "s234", true);
        leihwahren.add(s);

        
        Output o = new Output();
        
        
        
        o.printData(b.ausleihen());
        o.printData(b.zurueckgeben());
        o.printData(b.zurueckgeben());
        


    }
    
}

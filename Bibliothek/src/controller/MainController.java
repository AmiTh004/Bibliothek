package controller;

import java.util.ArrayList;

import model.Buch;
import model.Hoerspiel;
import model.Leihwahre;
import model.Spiel;
import view.Output;


public class MainController {

    ArrayList<Leihwahre> _leihwahren = new ArrayList<Leihwahre>();

    public MainController(){
        //Demodata

        

        Buch b = new Buch("Die Schöne und das Biest", "2345", "Gebrüder Grimm");
        _leihwahren.add(b);
        Hoerspiel h = new Hoerspiel("Die Teeprinzessin", "1234", 123.83);
        _leihwahren.add(h);
        Spiel s = new Spiel("Schneckenrennen", "s234", true);
        _leihwahren.add(s);


        //Ausgabe
        Output o = new Output();
        
        o.printData(h.ausleihen());
        o.printData(s.zurueckgeben());
        o.printData(b.zurueckgeben());
        


    }
    
}

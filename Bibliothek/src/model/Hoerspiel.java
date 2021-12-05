package model;

public class Hoerspiel extends Leihwahre {

    double _laenge;

    public Hoerspiel(String titel, String nummer, double laenge) {
        super(titel, nummer);
        setLaenge(laenge);
        //TODO Auto-generated constructor stub
    }

    

    
    boolean vorhanden = true;
    public String ausleihen() {
        if(vorhanden) {
            vorhanden = false;
            return getTitel()+ " "+ "wird ausgeliehen";
        } else {
            return "Hoerspiel momentan nicht vorhanden!";
        }
        
    }

    /**
     * 
     * SETTER UND GETTER
     * 
     */
    public void setLaenge(double laenge) {
        this._laenge = laenge;
    }
    public double getLaenge() {
        return _laenge;
    }
    
}

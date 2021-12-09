package model;

public class Spiel extends Leihwahre {

    boolean _vollstaendigkeit;

    public Spiel(String titel, String nummer, boolean vollstaendigkeit) {
        super(titel, nummer);
        setVollständigkeit(vollstaendigkeit);
    }

    


    //vollständugkeit prüfen und aktualisieren
    public void auszaehlen(boolean komplett){
        if (komplett) {
            setVollständigkeit(true);
        } else {
            setVollständigkeit(false);
        }
    }
    
    // Wenn das Spiel vollständig ist, kann es ausgeliehen werden.
    public String ausleihen() {
        if(_vorhanden) {
            setVorhanden(false);;
            if (_vollstaendigkeit = true) {
                return getTitel()+ " "+ "kann ausgeliehen werden";
            } else {
                return "erst Vollständigkeit prüfen!";
            }
        } else {
            return "Spiel momentan nicht vorhanden!";
        }
        
    }

    //SETTER UND GETTER
    
    public void setVollständigkeit(boolean vollstaendigkeit) {
        this._vollstaendigkeit = vollstaendigkeit;
    }
}

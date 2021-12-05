package model;


public class Buch extends Leihwahre {

    String _autor;

    public Buch(String titel, String nummer, String autor) {
        super(titel, nummer);
        setAutor(autor);
        //TODO Auto-generated constructor stub
    }

    public String ausleihen() {
        if(_vorhanden) {
            setVorhanden(false);
            return getTitel()+ " "+ "wird ausgeliehen";
        } else {
            return "Buch momentan nicht vorhanden!";
        }
        
    }

    /**
     * 
     * 
     * SETTER UND GETTER
     */
    public void setAutor(String autor) {
        this._autor = autor;
    }
    public String getAutor() {
        return _autor;
    }
    public void setVorhanden(boolean vorhanden) {
        this._vorhanden = vorhanden;
    }


    
}

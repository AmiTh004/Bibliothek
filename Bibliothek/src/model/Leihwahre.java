package model;

public abstract class Leihwahre {

    String _titel;
    String _nummer;
    // Status - verliehen oder nicht
    boolean _vorhanden;

    public Leihwahre(String titel, String nummer){
        setNummer(nummer);
        setTitel(titel);
        setVorhanden(true);
    }

    // Abstrakte Methode -> Polymorphie
    public abstract String ausleihen();

    //Überprüfen ob der Titel vorhanden ist und vorhanden auf true schalten -> sonst Fehlermeldung
    public String zurueckgeben(){
        if(_vorhanden== false){
            setVorhanden(true);
            return getTitel() + " "+ "ist zurückgegeben";
        }else{
            return getTitel()+ " "+ "muss erst ausgeliehen werden, um es zurückzugeben!";
        }
    }

    /**
     * 
     * 
     * SETTER UND GETTER
     */
    
     public void setNummer(String nummer) {
         this._nummer = nummer;
     }
     public String getNummer() {
         return _nummer;
     }
     public void setTitel(String titel) {
         this._titel = titel;
     }
     public String getTitel() {
         return _titel;
     }
     public void setVorhanden(boolean vorhanden) {
         this._vorhanden = vorhanden;
     }
}

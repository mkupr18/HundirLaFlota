/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectefinalprogramaciói;

/**
 *
 * @author maria
 */
public class Vaixell {
    //private Vaixell v;
    private int mida;
    private Casella caselles[];
    private boolean enfonsat;
    private int tocat; // Número de veces que se ha tocado el barco
    
    public Vaixell(int longitut){
        this.mida = longitut;
        this.caselles = new Casella[mida];
        this.enfonsat = false;
        tocat = 0;
    }

    public Casella[] getCaselles() {
        return caselles;
    }

    public boolean isEnfonsat() {
        return enfonsat;
    }

    public void setEnfonsat(boolean enfonsat) {
        this.enfonsat = enfonsat;
    }
    
    // Asigna las casellas del barco
    public void asignarCaselles(Casella[] caselles) {
        if (caselles.length != mida) {
            System.out.println("El nombre de caselles no coincideix amb"
                    + " la mida del vaixell");
        } else {
            for (int i = 0; i < caselles.length; i++) {
                this.caselles[i] = caselles[i];
            }
        }
    }
    
    // Comprueba si el barco està enfonsat
    public boolean comprovarEnfonsat() {
        for (Casella casella : caselles) {
            if (!casella.isDisparat()) {
                return false;
            }
        }
        this.enfonsat =  true;
        return true;
    }
    
    // Si se ha tocado todas las casillas del barco
    public boolean estaEnfonsat() {
        return mida == tocat;
    }
    
    public void tocarVaixell(){
        tocat++;
    }
    
    public int getMida() {
        return mida;
    }
    
    public int getTocat() {
        return tocat;
    }
    
    @Override
    public String toString() {
        String estat = "Actiu";
        if (enfonsat) {
            estat = "Enfonsat";
            
        }
        return "(" + mida + " caselles) - " + estat;
    }
    
//    public void afegirVaixell(Vaixell v){
//        this.v = v;
//    }
}
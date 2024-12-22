/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectefinalprogramaciói;

/**
 *
 * @author maria
 */
public class Casella {
    private Vaixell v;
    char casella;
    boolean estaEnfonsat;
    
    public Casella(char casella) {
        this.casella = casella;
        estaEnfonsat = false;
    }
    
    public void afegirVaixell(Vaixell v){
        this.v = v;
    }
    
    public boolean casellaEnfonsada(){
        return estaEnfonsat;
    }
    
    public void enfonsat(){
        estaEnfonsat = true;
    }
}
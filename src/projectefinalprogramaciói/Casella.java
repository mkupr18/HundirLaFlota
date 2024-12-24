/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectefinalprogramaciói;

//import java.io.FileReader;
//import java.io.IOException;

/**
 *
 * @author maria
 */
public class Casella {
    private int fila, columna;
    private boolean ocupat;
    private boolean disparat;
    private char estat;
    //private char casella;
    
    public Casella(int fila, int columna) {
        //this.casella = casella;
        this.fila = fila;
        this.columna = columna;
        this.disparat = false;
        this.ocupat = false;
        this.estat = '-';
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public boolean isOcupat() {
        return ocupat;
    }

    public void setOcupat(boolean ocupat) {
        this.ocupat = ocupat;
    }

    public boolean isDisparat() {
        return disparat;
    }

    public void setDisparat(boolean disparat) {
        this.disparat = disparat;
    }

    public char getEstat() {
        return estat;
    }

    public void setEstat(char estat) {
        this.estat = estat;
    }
    
    public void actualitzarEstat(char estat) {
        if (!disparat) {
            this.estat = estat;
            this.ocupat = true;
        }
    }
    
    public boolean casellaEnfonsada(){
        return disparat;
    }
    
    public boolean esDisparable() {
        return !disparat;
    }
    
    @Override
    public String toString() {
        return String.valueOf(estat);
    }
    
//    public char llegirContingutCasella(char[] casella) {
//        fila = casella[0] - 'A';
//        columna = casella[1] - '1';
//
//        try {
//            FileReader fr = new FileReader("10-10-5-4-3-3-2/" + 7 + ".txt");
//            int indexFila = 0;
//            int indexColumna = 0;
//            int valor;
//
//            while ((valor = fr.read()) != -1) {
//                if (indexFila == fila && indexColumna == columna) {
//                    return (char) valor;
//                }
//
//                if (valor == '\n' || valor == '\r') {
//                    indexFila++;
//                    indexColumna = 0;
//                } else {
//                    indexColumna++;
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Error al llegir l'arxiu: " + e.getMessage());
//        }
//        return '\0';
//    }
//    public void enfonsat(){
//        estaEnfonsat = true;
//    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectefinalprogramaciói;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author maria
 */
public class FitxerTaulerLectura {
    Random ra = new Random();
    Vaixell[] vaixells;
    private FileReader fr;
    private Tauler tauler;
    private int nombreVaixellsEnfonsats;
    private int random = generateNumber();
    
    public FitxerTaulerLectura() throws FileNotFoundException {
        fr = new FileReader("10-10-5-4-3-3-2/" + 7 + ".txt");
    }
    
    private Vaixell[] inicialitzarVaixells() {
        Vaixell vaixell[] = new Vaixell[5];
        vaixell[0] = new Vaixell(5);
        vaixell[1] = new Vaixell(4);
        vaixell[2] = new Vaixell(3);
        vaixell[3] = new Vaixell(3);
        vaixell[4] = new Vaixell(2);

        return vaixell;
    }
    
    public char llegirContingutCasella(char[] casella) {
        int fila = casella[0] - 'A';
        int columna = casella[1] - '1';
        
        try {
            int indexFila = 0;
            int indexColumna = 0;
            int valor;

            while ((valor = fr.read()) != -1) {
                if (indexFila == fila && indexColumna == columna) {
                    return (char) valor;
                }

                if (valor == '\n' || valor == '\r') {
                    indexFila++;
                    indexColumna = 0;
                } else {
                    indexColumna++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error al llegir l'arxiu: " + e.getMessage());
        }
        return '\0';
    }
    
    //Mètode que donat un vaixell pugui treure sa fila i sa columna on marcaré després al tauler una 'x'
    public void marcarVaixellEnfonsat(char vaixell, Tauler tauler) throws FileNotFoundException, IOException {
        nombreVaixellsEnfonsats++; //Incrementam el comptador de vaixells enfonsats
        
        try {
            FileReader fr = new FileReader("10-10-5-4-3-3-2/" + 7 + ".txt");
            int indexFila = 0;
            int indexColumna = 0;
            int valor;
            
            while ((valor = fr.read()) != -1) {
                if (valor == '\n') {
                    indexFila++;
                    indexColumna = 0;
                } else { 
                    char[] casella = new char[2];
                    casella[0] = (char)(indexFila + 'A');
                    casella[1] = (char)(indexColumna + '1');
                    if (llegirContingutCasella(casella) == vaixell) {
                        tauler.tauler[indexFila][indexColumna] = 'x';
                    }
                    indexColumna++;
                    }
                }
            } catch (IOException e) {
            System.out.println("Error al llegir l'arxiu: " + e.getMessage());
        }
    }
    
    public int generateNumber() {
        int num = ra.nextInt(99) + 1; //Elegeix un nombre aleatori entre el 0 i el 99
        return num;
    }
    
    public boolean totsVaixellsEnfonsate() {
        return nombreVaixellsEnfonsats == vaixells.length;
    }
}
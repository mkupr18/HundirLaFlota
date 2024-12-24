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
public class Tauler {

    private Casella[][] caselles; //Matriz de las casellas del tablero
    //private char[][] tauler;
    //private int nombreVaixellsEnfonsats;
    private Vaixell[] vaixells; // Barcos del tablero
    private int mida; // Opcional
    //Random ra = new Random();
    //int random = generateNumber();

    public Tauler(int mida, int[] distribucioVaixells) {
        this.mida = mida;
        this.caselles = new Casella[mida][mida];
        inicialitzarCaselles();
        inicialitzarVaixells(distribucioVaixells);
        //tauler = new char[10][10];
        //vaixells = new Vaixell();
        //vaixells = inicialitzarVaixells();
        //nombreVaixellsEnfonsats = 0;
        
        //rellenarMatriu(); //Inicialitza el tauler al crear-lo
    }

    private void inicialitzarCaselles() {
        for (int i = 0; i < mida; i++) {
            for (int j = 0; j < mida; j++) {
                caselles[i][j] = new Casella(i,j);
            }
        }
    }
    
    private void inicialitzarVaixells(int[] distribucioVaixells) {
        vaixells = new Vaixell[distribucioVaixells.length];
        for (int i = 0; i < distribucioVaixells.length; i++) {
            vaixells[i] = new Vaixell(distribucioVaixells.length);
        }
    }
    
    public void mostrarTauler() {
        System.out.println("  ");
        for (int i = 0; i <= mida; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
        
        for (int i = 0; i < mida; i++) {
            char etiquetaFila = (char) ('A' + i);
            System.out.println(" " + etiquetaFila + " ");
            for (int j = 0; j < mida; j++) {
                System.out.println(caselles[i][j].getEstat() + " ");
            }
            System.out.println("  " + etiquetaFila);
        }
        
        System.out.println("  ");
        for (int i = 0; i <= mida; i++) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    
    public boolean disparar(int fila, int columna) {
        Casella casella = caselles[fila][columna];
        
        if(!casella.esDisparable()) {
            return false; // Casella ja disparada
        }
        
        if (casella.isOcupat()) {
            casella.actualitzarEstat('t');
            return true;
        } else  {
            casella.actualitzarEstat('a');
            return false;
        }
    }
    
    public boolean totsVaixellsEnfonsats() {
        for (Vaixell vaixell : vaixells) {
            if (!vaixell.comprovarEnfonsat()) {
                return false;
            }
        }
        return true;
    }

    public void carregarCaselles(Casella[][] casellesExternes) {
        for (int i = 0; i < mida; i++) {
            for (int j = 0; j < mida; j++) {
                this.caselles[i][j] = casellesExternes[i][j];
            }
        }
    }
    
    public Casella[][] getCaselles() {
        return caselles;
    }

    public Vaixell[] getVaixells() {
        return vaixells;
    }
    
    
//    //Meter clase Vaixell
////    private Vaixell[] inicialitzarVaixells() {
////        Vaixell vaixell[] = new Vaixell[5];
////        vaixell[0] = new Vaixell(5);
////        vaixell[1] = new Vaixell(4);
////        vaixell[2] = new Vaixell(3);
////        vaixell[3] = new Vaixell(3);
////        vaixell[4] = new Vaixell(2);
////
////        return vaixell;
////    }
//    //Inicialitza el tauler amb un caràcter buit
//    public void rellenarMatriu() {
//        for (int i = 0; i < tauler.length; i++) {
//            for (int j = 0; j < tauler[i].length; j++) {
//                tauler[i][j] = '-';
//            }
//        }
//    }
//
//    public void mostrarTauler() {
//        System.out.println("Tauler rival: ");
//        System.out.println("  1 2 3 4 5 6 7 8 9 10");
//
//        //Cream dos for per imprimir la matriu
//        for (int i = 0; i < tauler.length; i++) {
//            System.out.print((char) ('A' + i) + " "); //Lletres per les files
//            for (int j = 0; j < tauler[i].length; j++) {
//                System.out.print(tauler[i][j] + " ");
//            }
//            System.out.println((char) ('A' + i)); //Lletres al final de les files
//        }
//
//        System.out.println("  1 2 3 4 5 6 7 8 9 10");
//        System.out.println();
//    }
//
//    public void marcarDispar(char[] casella) throws IOException {
//        int fila = casella[0] - 'A';
//        int columna = casella[1] - '1';
//        char contingutCasella = llegirContingutCasella(casella);
//        int indexVaixell = Character.getNumericValue(contingutCasella); //casting no va be
//
//        tauler[fila][columna] = 't';
//
//        vaixells[indexVaixell].tocarVaixell();
//
//        if (vaixells[indexVaixell].estaEnfonsat()) {
//            marcarVaixellEnfonsat(contingutCasella);
//        }
//    }
//
//    // Meter clase Vaixell
//    public boolean esVaixell(char[] casella) {
//        char contingutCasella = llegirContingutCasella(casella);
//
//        return (contingutCasella >= '0' && contingutCasella <= '9' || contingutCasella == 'v');
//    }
//
//    // Meter clase vaixell
//    public boolean esVaixellTocat(char[] casella) {
//        int fila = casella[0] - 'A';
//        int columna = casella[1] - '1';
//
//        if (tauler[fila][columna] == 't') {
//            return true;
//        }
//        return false;
//    }
//
//    //Mètode que donat un vaixell pugui treure sa fila i sa columna on marcaré després al tauler una 'x'
//    public void marcarVaixellEnfonsat(char vaixell) throws FileNotFoundException, IOException {
//        nombreVaixellsEnfonsats++; //Incrementam el comptador de vaixells enfonsats
//
//        try {
//            FileReader fr = new FileReader("10-10-5-4-3-3-2/" + 7 + ".txt");
//            int indexFila = 0;
//            int indexColumna = 0;
//            int valor;
//
//            while ((valor = fr.read()) != -1) {
//                if (valor == '\n') {
//                    indexFila++;
//                    indexColumna = 0;
//                } else {
//                    char[] casella = new char[2];
//                    casella[0] = (char) (indexFila + 'A'); //Casting
//                    casella[1] = (char) (indexColumna + '1');
//                    if (llegirContingutCasella(casella) == vaixell) {
//                        tauler[indexFila][indexColumna] = 'x';
//                    }
//                    indexColumna++;
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("Error al llegir l'arxiu: " + e.getMessage());
//        }
//    }
//
//    public void marcarAigua(char[] casella) {
//        int fila = casella[0] - 'A';
//        int columna = casella[1] - '1';
//
//        tauler[fila][columna] = 'a';
//    }
//
//    public void modificar(int fila, int columna, char valor) {
//        tauler[fila][columna] = valor;
//    }
//
//    public char tornarChar(int fila, int columna) {
//        return tauler[fila][columna];
//    }
//
//    public boolean totsVaixellsEnfonsat() {
//        return nombreVaixellsEnfonsats == vaixells.length;
//    }
//
//    public char llegirContingutCasella(char[] casella) {
//        int fila = casella[0] - 'A';
//        int columna = casella[1] - '1';
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
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectefinalprogramaciói;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author maria
 */
public class FitxerTaulerLectura {

    //atributos
    private FileReader fr;
    private BufferedReader br;
    private int car;

    //constructor
    public FitxerTaulerLectura(String path) throws FileNotFoundException {
        fr = new FileReader(path);
        br = new BufferedReader(fr);
    }

    public Casella[][] llegirTauler(int mida) throws IOException {
        Casella[][] caselles = new Casella[mida][mida];
        
        for (int i = 0; i < mida; i++) {
            String linia = br.readLine();
            if (linia == null) {
                System.out.println("El fitxer no te suficients linies "
                        + "pel tauler");
            }

            char[] caracters = linia.toCharArray();
            
            for (int j = 0; j < mida; j++) {
                if (j >= linia.length()) {
                    System.out.println("La linia no té suficients caràcters");
                }
                
                char simbol = caracters[j];
                caselles[i][j] = new Casella(i,j);
                caselles[i][j].setEstat(simbol);
                
                if (simbol != '-') {
                    caselles[i][j].setOcupat(true);
                }
            }
        }
        return caselles;
    }
//    public Paraula leerPAl() throws IOException{
//        Paraula aux = new Paraula();
//        car = br.read();
//        saltarBlancosYOtros();
//        while(car != -1 && car >= 33){ //-1 EOF y 33 char "validos"
//            aux.anadirChar((char)car);
//            car = br.read();
//        }
//        return aux;
//    }
//    
//    private void saltarBlancosYOtros() throws IOException{
//        while(car != -1 && car < 33){ //32 es blanco
//            car = br.read();
//        }
//    }

    public void cerrar() throws IOException {
        br.close();
        fr.close();
    }
}

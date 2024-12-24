/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectefinalprogramaciói;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mkupr
 */
public class FitxerTaulerEscriptura {
    //atributs
    private FileWriter fw;
    private BufferedWriter bw;
    
    //constructor
    public FitxerTaulerEscriptura(String nomFitxer) throws IOException {
        fw = new FileWriter(nomFitxer, true);
        bw = new BufferedWriter(fw);
    }
    
    //mètode que escriu un String
    public void escriureContacte(String p1, String p2, String p3, String p4)
            throws IOException {
        bw.write(p1 + "#" + p2 + "#" + p3 + "#" + p4 + " \n");
    }
    
    //mètode que escriu una paraula
    public void escriureParaula(Paraula p) throws IOException {
        bw.write(p.toString());
    }

    public void tancar() throws IOException {
        bw.close();
        fw.close();
    }
}

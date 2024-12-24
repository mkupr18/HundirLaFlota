/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectefinalprogramaciói;

import java.io.IOException;

/**
 *
 * @author maria
 */
public class Jugador {

    private LT lt;

    public Jugador() {
        lt = new LT();
    }

    public char[] disparar() {
        System.out.print("Introdueix la coordenada on vols disparar: ");
        char[] liniaLlegida = lt.llegirLinia();

        if (liniaLlegida.length > 2) {
            char[] novaLinia = new char[2];
            novaLinia[0] = liniaLlegida[0];
            novaLinia[1] = String.valueOf(new char[]{liniaLlegida[1], liniaLlegida[2]}).charAt(0);
            return novaLinia;
        }
        return liniaLlegida;
    }

    public void marcarDispar(char[] dispar, Tauler tauler) throws IOException {
        if (tauler.esVaixell(dispar) && !tauler.esVaixellTocat(dispar)) {
            System.out.println("Tocat!");
            tauler.marcarDispar(dispar);
        } else if (!tauler.esVaixell(dispar) && !tauler.esVaixellTocat(dispar)) {
            System.out.println("Aigua!");
            tauler.marcarAigua(dispar);
        } else {
            System.out.println("Error: ja has disparat aquí");
        }
    }

    public boolean totsVaixellsEnfonsats(Tauler tauler) {
        return tauler.totsVaixellsEnfonsat();
    }
}

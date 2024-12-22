/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectefinalprogramaciói;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author maria
 */
public class Main {
    
    // Probando probando

    /**
     * @param args the command line arguments
     */
     
    char[] nom;
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Main c = new Main();
        c.metodePrincipal();
    }
    
    private void metodePrincipal() throws FileNotFoundException, IOException {
        Jugador jugador = new Jugador();
        JugadorSolitari solitari = new JugadorSolitari();
        LT lt = new LT();
        Menu menu = new Menu();
        
        menu.menuPrincipal();

       /* switch(menu.jugarTotSol()){
        
            case 1:
                System.out.println("1");
                break;
            default:
                System.out.println("def");
            
        }*/
        //PROBLEMA!!!!!!, només vull que es posi al menu de jugar tot sol
        System.out.print("Introdueix el teu nom: ");
        //Llegeix el teu nom i el guarda com un array de tipus char
        nom = lt.llegirLinia();
        Tauler tauler = new Tauler();
        
        //Mostra per pantalla el tauler
        tauler.mostrarTauler();
        System.out.print("Torn de ");
        //for per imprimir el nom que escrigui l'usuari
        for (int i = 0; i < nom.length; i++){
            System.out.print(nom[i]);
        }
        System.out.println();
        
        while (!jugador.totsVaixellsEnfonsats(tauler)) {
            char[] dispar = solitari.disparar();
            jugador.marcarDispar(dispar, tauler);
            tauler.mostrarTauler();
        }
    }
}
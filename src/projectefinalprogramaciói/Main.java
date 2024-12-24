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
    LT lt = new LT();
    char[] nom;
        
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Main c = new Main();
        c.metodePrincipal();
    }
    
    public void menuPrincipal() {
        System.out.println("***********************************************************");
        System.out.println("MENU PRINCIPAL");
        System.out.println("***********************************************************");
        System.out.println("    1 Jugar");
        System.out.println("    2 Registre");
        System.out.println("    s Sortir");
        System.out.println("***********************************************************");
        System.out.print("Opció (1|2|s): ");
        
        char opcio1 = lt.llegirCaracter();
        
        switch (opcio1) {
            case '1':
                menuJugar();
                break;
            case '2':
                menuRegistre();
                break;
            case 's':
                sortir();
                break;
            default:
                System.out.println("Valor incorrecte");;
        }
    }
    
    public void menuJugar() {
        System.out.println("***********************************************************");
        System.out.println("JUGAR");
        System.out.println("***********************************************************");
        System.out.println("    1 Jugar tot sol");
        System.out.println("    2 Jugar contra un atre jugador");
        System.out.println("    3 Jugar contra l'ordinador");
        System.out.println("    s Tornar al menú principal");
        System.out.println("***********************************************************");
        System.out.print("Opció (1|2|3|s): ");
        
        char opcio2 = lt.llegirCaracter();
        
        switch (opcio2) {
            case '1':
                jugarTotSol();
                break;
            case '2':
                jugarContraUnAltre();
                break;
            case '3':
                jugarContraOrdinador();
                break;
            case 's':
                sortir();
                break;
            default:
                System.out.println("Valor incorrecte");;
        }
    }
    
    public void jugarTotSol() {
        int mida = 10;
        int[] distribucioVaixells = {5, 4, 3, 3, 2};
        
        System.out.println("***********************************************************");
        System.out.println("PARTIDA EN SOLITARI");
        System.out.println("***********************************************************");
        
        System.out.println("Introdueix el teu nom: ");
        nom = lt.llegirLinia();
        
        Jugador jugador = new Jugador(nom, mida, distribucioVaixells);
        
        
    }
    
    public void menuRegistre() {
        System.out.println("***********************************************************");
        System.out.println("REGISTRE");
        System.out.println("***********************************************************");
        System.out.println("    1 Mostrar detalls de les partides");
        System.out.println("    2 Mostrar estadistiques d'un jugador");
        System.out.println("    s Tornar al menu principal");
        System.out.println("***********************************************************");
        System.out.print("Opció (1|2|s): ");
        
        char opcio3 = lt.llegirCaracter();
        
        switch (opcio3) {
            case '1':
                mostrarDetallsPartides();
                break;
            case '2':
                estadistiquesJugador();
                break;
            case 's':
                sortir();
                break;
            default:
                System.out.println("Valor incorrecte");;
        }
    }
    
    private void sortir() {
        System.out.println("Fins aviat!");
    }
    
    private void jugarContraUnAltre() {
        System.out.println("***********************************************************");
        System.out.println("PARTIDA DE DOS JUGADORS");
        System.out.println("***********************************************************");
    }
    
    private void jugarContraOrdinador() {
        System.out.println("***********************************************************");
        System.out.println("PARTIDA CONTRA L'ORDINADOR");
        System.out.println("***********************************************************");
    }
    
    private void mostrarDetallsPartides() {
        System.out.println("***********************************************************");
        System.out.println("DETALLS DE LES PARTIDES");
        System.out.println("***********************************************************");
    }
    
    private void estadistiquesJugador() {
        System.out.println("***********************************************************");
        System.out.println("ESTADISTIQUES D'UN JUGADOR");
        System.out.println("***********************************************************");
    }
    
    
    
    private void metodePrincipal() throws FileNotFoundException, IOException {
        
        while(true) {
            menuPrincipal();
        }
        
//        Jugador jugador = new Jugador();
//        JugadorSolitari solitari = new JugadorSolitari();
//        LT lt = new LT();
//        Menu menu = new Menu();
//        
//        menu.menuPrincipal();
//
//       /* switch(menu.jugarTotSol()){
//        
//            case 1:
//                System.out.println("1");
//                break;
//            default:
//                System.out.println("def");
//            
//        }*/
//        //PROBLEMA!!!!!!, només vull que es posi al menu de jugar tot sol
//        System.out.print("Introdueix el teu nom: ");
//        //Llegeix el teu nom i el guarda com un array de tipus char
//        nom = lt.llegirLinia();
//        Tauler tauler = new Tauler();
//        
//        //Mostra per pantalla el tauler
//        tauler.mostrarTauler();
//        System.out.print("Torn de ");
//        //for per imprimir el nom que escrigui l'usuari
//        for (int i = 0; i < nom.length; i++){
//            System.out.print(nom[i]);
//        }
//        System.out.println();
//        
//        while (!jugador.totsVaixellsEnfonsats(tauler)) {
//            char[] dispar = solitari.disparar();
//            jugador.marcarDispar(dispar, tauler);
//            tauler.mostrarTauler();
//        }
    }
}
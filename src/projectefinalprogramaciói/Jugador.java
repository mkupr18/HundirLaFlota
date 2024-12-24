/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectefinalprogramaciói;


/**
 *
 * @author maria
 */
public class Jugador {
    private char[] nom;
    private Tauler taulerPropi;
    private Tauler taulerRival;

    public Jugador(char[] nom, int midaTauler, int[] distribucioVaixells) {
        this.nom = copiarArray(nom);
        this.taulerPropi = new Tauler(midaTauler, distribucioVaixells);
        this.taulerRival = new Tauler(midaTauler, distribucioVaixells);
    }
    
    // Disparo en el tablero rival
    public boolean disparar(int fila, int columna) {
        boolean impacte = taulerRival.dispararTauler(fila, columna);
        if (impacte) {
            System.out.println("El jugador ");
            imprimirNom();
            System.out.println(" ha tocat un vaixell!");
        } else {
            System.out.println("El jugador ");
            imprimirNom();
            System.out.println(" ha disparat aigua.");
        }
        return impacte;
    }
    
    public boolean totsVaixellsEnfonsats() {
        return taulerPropi.totsVaixellsEnfonsatsTauler();
    }
    
    public void mostrarEstat() {
        System.out.println("Tauler propi de ");
        imprimirNom();
        System.out.println(":");
        taulerPropi.mostrarTauler();
        
        System.out.println("Tauler rival de ");
        imprimirNom();
        System.out.println(":");
        taulerRival.mostrarTauler();
    }
    
    private void imprimirNom() {
        for (char c : nom) {
            System.out.println(c);
        }
    }
    
    private char[] copiarArray(char[] origen) {
        char[] copia = new char[origen.length];
        for (int i = 0; i < origen.length; i++) {
            copia[i] = origen[i];
        }
        return copia;
    }
    
    public char[] getNom() {
        return copiarArray(nom);
    }

    public Tauler getTaulerPropi() {
        return taulerPropi;
    }

    public Tauler getTaulerRival() {
        return taulerRival;
    }

//    public char[] dispararTauler() {
//        System.out.print("Introdueix la coordenada on vols dispararTauler: ");
//        char[] liniaLlegida = lt.llegirLinia();
//
//        if (liniaLlegida.length > 2) {
//            char[] novaLinia = new char[2];
//            novaLinia[0] = liniaLlegida[0];
//            novaLinia[1] = String.valueOf(new char[]{liniaLlegida[1], liniaLlegida[2]}).charAt(0);
//            return novaLinia;
//        }
//        return liniaLlegida;
//    }
//
//    public void marcarDispar(char[] dispar, Tauler tauler) throws IOException {
//        if (tauler.esVaixell(dispar) && !tauler.esVaixellTocat(dispar)) {
//            System.out.println("Tocat!");
//            tauler.marcarDispar(dispar);
//        } else if (!tauler.esVaixell(dispar) && !tauler.esVaixellTocat(dispar)) {
//            System.out.println("Aigua!");
//            tauler.marcarAigua(dispar);
//        } else {
//            System.out.println("Error: ja has disparat aquí");
//        }
//    }
//
//    public boolean totsVaixellsEnfonsatsTauler(Tauler tauler) {
//        return tauler.totsVaixellsEnfonsat();
//    }

    
}

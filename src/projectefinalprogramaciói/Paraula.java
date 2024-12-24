/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectefinalprogramaciói;

/**
 *
 * @author Maria Kupriyenko Chupaida
 */
public class Paraula{
    //atributs
    private static final int MAX = 20;
    private char[] lletres;
    private int n;
    
    //constructor
    public Paraula(){
        lletres = new char[MAX];
        n  = 0;
    }
    
    //setter
    public void setLletres(char[] lletres){
        this.lletres = lletres;
    }
    
    public  void anadirChar(char c){
        lletres[n]  = c;
        n++;
    }
    
    public boolean palabraVacia(){
        return n == 0;
    }
    
    @Override
    public String toString(){//String que escriu sout(Paraula)
        String s = "";
        for (int i = 0; i < lletres.length; i++) {
            s = s + lletres[i];
        }
        return s;
    }
}
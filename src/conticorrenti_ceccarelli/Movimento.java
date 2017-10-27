/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conticorrenti_ceccarelli;

/**
 *
 * @author Studenti
 */
public class Movimento {
    
    private int codice;
    private float importo;
    private String causale;
    
    public Movimento(float imp, String causa)
    {
        importo = imp;
        causale = causa;
    }
    
    public Movimento(int cod, float imp, String causa)
    {
        codice = cod;
        importo = imp;
        causale = causa;
    }
    
    public void printMov()
    {
        System.out.println("Codice movimento: " + codice + ", importo: " + importo + " EUR, causale: " + causale);
    }
    
}

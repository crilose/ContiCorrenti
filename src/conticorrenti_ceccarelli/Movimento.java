/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conticorrenti_ceccarelli;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Studenti
 */
public class Movimento {
    
    private int codice;
    private float importo;
    private String causale;
    GregorianCalendar data = new GregorianCalendar();
    
    public Movimento(float imp, String causa)
    {
        importo = imp;
        causale = causa;
    }
    
    public Movimento(int cod, float imp, String causa, GregorianCalendar data)
    {
        codice = cod;
        importo = imp;
        causale = causa;
        this.data = data;
    }
    
    public void printMov()
    {
        System.out.println("Codice movimento: " + codice + ", importo: " + importo + " EUR, causale: " + causale + ", in data: " + data.get(Calendar.DAY_OF_MONTH) + "/" + data.get(Calendar.MONTH) + "/" + data.get(Calendar.YEAR));
    }
    
}

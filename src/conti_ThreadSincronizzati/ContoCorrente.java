/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conti_ThreadSincronizzati;

import conticorrenti_ceccarelli.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Cristiano
 */
public class ContoCorrente {
    
    private String ncc;
    private float saldo;
    private ArrayList<Movimento> listaMov;
    private int nMov;
    
    
    public ContoCorrente(String num)
    {
        ncc = num;
        nMov = 0;
        saldo = 0;
        listaMov = new ArrayList<Movimento>();
    }
    
    public ContoCorrente(String num, float saldo)
    {
        ncc = num;
        nMov = 0;
        this.saldo = saldo;
        listaMov = new ArrayList<Movimento>();
    }
    
    public synchronized void Prelievo(float importo)
    {
        Scanner input = new Scanner(System.in);
        //Creo la data e chiedo la data del movimento
        GregorianCalendar oggi = new GregorianCalendar();
        int gg = (int)(Math.random()*31);
        int mm = (int)(Math.random()*12);
        int aa = 2017;
        oggi.set(aa, mm, gg);
       //Genero un codice random per il movimento
        int tempCod = (int)(Math.random()*100);
        if(saldo >= importo) //Se il saldo è sufficiente
        {
            Movimento mov = new Movimento(tempCod,importo,"Prelievo",oggi);  //Istanzio il movimento
            listaMov.add(mov); //Lo inserisco nella lista
            nMov++; //Incremento il numero di movimenti
            saldo = saldo - importo; //Scalo l'importo dal saldo
        }
        else
        {
            System.out.println("Saldo non sufficente, riprova."); //Comunico che il saldo non è sufficiente
        }
    }
    
    public synchronized void Versamento(float importo)
    {
        Scanner input = new Scanner(System.in);
        //Creo la data e chiedo la data del movimento
        GregorianCalendar oggi = new GregorianCalendar();
        int gg = (int)(Math.random()*31);
        int mm = (int)(Math.random()*12);
        int aa = 2017;
        oggi.set(aa, mm, gg);
       //Genero un codice random per il movimento
        int tempCod = (int)(Math.random()*100);
        Movimento mov = new Movimento(tempCod,importo,"Versamento",oggi); //Istanzio il movimento
        listaMov.add(mov); //Lo inserisco nella lista
        saldo = saldo + importo; //Incremento il saldo 
        nMov++; //Aggiorno il numero di movimenti
        System.out.println("Versamento effettuato.");
    }
    
    public synchronized float getSaldo()
    {
        return saldo;
    }
    
    public synchronized void stampaMovimenti()
    {
        /** Scorre i movimenti e stampa ciascuna descrizione */
        for(Movimento i : listaMov)
        {
            i.printMov();
        }
    }
    
}

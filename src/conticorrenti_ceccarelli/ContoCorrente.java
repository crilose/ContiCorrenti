/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conticorrenti_ceccarelli;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Studenti
 */
public class ContoCorrente {
    
    private String ncc;
    private float saldo;
    private ArrayList<Movimento> listaMov = new ArrayList<Movimento>();
    private int nMov;
    Scanner input = new Scanner(System.in);
    
    public ContoCorrente(String num)
    {
        ncc = num;
        nMov = 0;
        saldo = 0;
    }
    
    public ContoCorrente(String num, float saldo)
    {
        ncc = num;
        nMov = 0;
        this.saldo = saldo;
    }
    
    public void Prelievo(float importo)
    {
        //Creo la data e chiedo la data del movimento
        GregorianCalendar oggi = new GregorianCalendar();
        System.out.println("Giorno prelievo: ");
        int gg = input.nextInt();
        System.out.println("Mese prelievo: ");
        int mm = input.nextInt();
        System.out.println("Anno prelievo: ");
        int aa = input.nextInt();
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
    
    public void Versamento(float importo)
    {
        //Creo la data e chiedo la data del movimento
        GregorianCalendar oggi = new GregorianCalendar();
        System.out.println("Giorno versamento: ");
        int gg = input.nextInt();
        System.out.println("Mese versamento: ");
        int mm = input.nextInt();
        System.out.println("Anno versamento: ");
        int aa = input.nextInt();
        oggi.set(aa, mm, gg);
       //Genero un codice random per il movimento
        int tempCod = (int)(Math.random()*100);
        Movimento mov = new Movimento(tempCod,importo,"Versamento",oggi); //Istanzio il movimento
        listaMov.add(mov); //Lo inserisco nella lista
        saldo = saldo + importo; //Incremento il saldo 
        nMov++; //Aggiorno il numero di movimenti
        System.out.println("Versamento effettuato.");
    }
    
    public float getSaldo()
    {
        return saldo;
    }
    
    public void stampaMovimenti()
    {
        /** Scorre i movimenti e stampa ciascuna descrizione */
        for(Movimento i : listaMov)
        {
            i.printMov();
        }
    }
    
}

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
        GregorianCalendar oggi = new GregorianCalendar();
        System.out.println("Causale prelievo: ");
        String causale = input.nextLine();
        System.out.println("Giorno prelievo: ");
        int gg = input.nextInt();
        System.out.println("Mese prelievo: ");
        int mm = input.nextInt();
        System.out.println("Anno prelievo: ");
        int aa = input.nextInt();
        oggi.set(aa, mm, gg);
       
        int tempCod = (int)(Math.random()*100);
        if(saldo >= importo)
        {
            Movimento mov = new Movimento(tempCod,importo,causale,oggi);
            listaMov.add(mov);
            nMov++;
            saldo =- importo;
        }
        else
        {
            System.out.println("Saldo non sufficente, riprova.");
        }
    }
    
    public void Versamento(float importo)
    {
        GregorianCalendar oggi = new GregorianCalendar();
        System.out.println("Causale versamento: ");
        String causale = input.nextLine();
        System.out.println("Giorno versamento: ");
        int gg = input.nextInt();
        System.out.println("Mese versamento: ");
        int mm = input.nextInt();
        System.out.println("Anno versamento: ");
        int aa = input.nextInt();
        oggi.set(aa, mm, gg);
       
        int tempCod = (int)(Math.random()*100);
        Movimento mov = new Movimento(tempCod,importo,causale,oggi);
        listaMov.add(mov);
        nMov++;
        System.out.println("Versamento effettuato.");
    }
    
    public float getSaldo()
    {
        return saldo;
    }
    
    public void stampaMovimenti()
    {
        for(Movimento i : listaMov)
        {
            i.printMov();
        }
    }
    
}

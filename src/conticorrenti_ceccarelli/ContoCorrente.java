/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conticorrenti_ceccarelli;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Studenti
 */
public class ContoCorrente {
    
    private String ncc;
    private float saldo;
    private ArrayList<Movimento> listaMov;
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
        System.out.println("Causale prelievo: ");
        String causale = input.nextLine();
        int tempCod = (int)(Math.random()*100);
        if(saldo >= importo)
        {
            Movimento mov = new Movimento(tempCod,importo,causale);
            listaMov.add(mov);
            nMov++;
        }
        else
        {
            System.out.println("Saldo non sufficente, riprova.");
        }
    }
    
}

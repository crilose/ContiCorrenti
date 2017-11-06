/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conticorrenti_ceccarelli;

/**
 *
 * @author Cristiano
 */
public class Correntista extends Thread{
    
    String nome;
    String ndg;
    ContoCorrente conto;
    
    public Correntista(String name, String n)
    {
        nome = name;
        ndg = n;
    }
    
    public Correntista(String name, ContoCorrente conto)
    {
        nome = name;
        this.conto = conto;
    }
    
    public void run()
    {
        for(int i=0;i<20;i++)
        {
            System.out.println("Saldo: ");
            System.out.println(conto.getSaldo());
            int tempSoldi = (int)(Math.random()*500);
            int scelta = (int)(Math.random()*100);
            if(scelta > 50)
            {
                conto.Prelievo(tempSoldi);
                System.out.println("Prelevato " + tempSoldi + " euro");
            }
            else
            {
                conto.Versamento(tempSoldi);
                System.out.println("Versato " + tempSoldi + " euro");
            }
        }
    }
    
}

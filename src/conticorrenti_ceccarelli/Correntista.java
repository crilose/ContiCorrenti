/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conticorrenti_ceccarelli;

/**
 *
 * @author informatica
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
        //Test metodo run
        System.out.println("Saldo: ");
        System.out.println(conto.getSaldo());
        System.out.println("Prelevo 50 euro");
        conto.Prelievo(50);
        System.out.println("Saldo: ");
        System.out.println(conto.getSaldo());
        System.out.println("Verso 100 euro");
        conto.Versamento(100);
        System.out.println("Saldo: ");
        System.out.println(conto.getSaldo());
        System.out.println("Stampo i movimenti: ");
        conto.stampaMovimenti();
    }
    
}

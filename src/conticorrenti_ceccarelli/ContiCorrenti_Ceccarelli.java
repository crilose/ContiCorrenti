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
public class ContiCorrenti_Ceccarelli {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creo il conto corrente condiviso con 500 euro di partenza
        ContoCorrente ilconto = new ContoCorrente("1",500);
        //Creo un correntista
        Correntista test = new Correntista("Marco",ilconto);
        Correntista test2 = new Correntista("Filippo",ilconto);
        test.start(); //avvio il correntista
        test2.start();
    }
    
}

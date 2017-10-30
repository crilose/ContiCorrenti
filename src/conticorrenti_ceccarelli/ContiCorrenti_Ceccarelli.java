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
        
        ContoCorrente ilconto = new ContoCorrente("1",500);
        Correntista test = new Correntista("Marco",ilconto);
        test.start(); //ok
    }
    
}

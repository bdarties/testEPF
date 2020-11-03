/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testinterfacegraphisque;

/**
 *
 * @author benoit
 */
public class TestInterfaceGraphisque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Partie p = new Partie ();
        premierEcran ecran1 = new premierEcran(p);
        ecran1.setVisible(true);
    }
    
}

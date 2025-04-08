/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package redsocial;

import IGU.Login;

/**
 *
 * @author Marco
 */
public class RedSocial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion.Con();
        Login pant = new Login();
        pant.setVisible(true);
        pant.setLocationRelativeTo(null);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegocenas;

import java.util.Random;

public class JuegoCenas {

    Dado dado1 = new Dado();
    Dado dado2 = new Dado();
    Random r = new Random();
    
    public static void main(String[] args) {
        new FrmCenas().setVisible(true);
        
    }
    
}

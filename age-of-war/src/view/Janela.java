/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Observador;
import javax.swing.JFrame;

/**
 *
 * @author rafae
 */
public class Janela extends JFrame implements Observador{
    
    public static void main(String[] args) {
      JFrame janela = new JFrame("Age of War");
        janela.setSize(300,200);
        janela.setVisible(true);
    }

    @Override
    public void addObservadores(Observador obs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerObservadores(Observador obs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}

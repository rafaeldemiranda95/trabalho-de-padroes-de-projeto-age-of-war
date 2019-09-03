/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafae
 */
public class Controle {

    private List<Observador> observadores = new ArrayList<>();
    
    public void addObservadores(Observador obs) {
        
        observadores.add(obs);
        
    }
    
    public void removerObservadores(Observador obs) {
        
        observadores.remove(obs);
        
    }

    public void menuSelecaoNome() {

            


    }
}

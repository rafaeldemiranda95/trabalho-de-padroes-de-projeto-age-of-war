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
public class MacroComand implements Command {

    private List<Command> comms = new ArrayList<>();

    public void add(Command comm) {
        comms.add(comm);
    }

    @Override
    public void execute() {
        for (Command comm : comms) {
            comm.execute();
        }
    }

    @Override
    public void undo() {
        for (int i = comms.size() - 1; i >= 0; i--) {
            comms.get(i).undo();
        }
    }

    @Override
    public void redo() {
        for (Command comm : comms) {
            comm.redo();
        }
    }

    @Override
    public String toString() {
        String ret = "Macro : ";
        for (Command comm : comms) {
            ret += "\n " + comm;
        }
        return ret;
    }

}

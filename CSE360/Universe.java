/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSE360;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author pdreiter
 */
public class Universe extends JFrame {
    
    /**
     * @param args the command line arguments
     */
    public Universe(){
        super("Team 7 Project 1 testing");
        JPanel team7 = new Team7();
        initializeGUI(team7);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame x = new Universe();
        
    }
    private void initializeGUI(JPanel jp) {
         
        this.setSize(400,400);
        this.add(jp);
        this.setVisible(true);
    }
}

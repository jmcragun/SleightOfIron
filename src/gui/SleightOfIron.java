package gui;

import javax.swing.SwingUtilities;

/**
 * This is the class that will launch the Sleight of Iron Game
 */
public class SleightOfIron {
     public static void main(String[] args) {
         SwingUtilities.invokeLater( () -> new Game());
     }
}

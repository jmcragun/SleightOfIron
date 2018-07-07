package gui;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterCreationPanel extends JPanel implements ActionListener {

    private Game root;
    private JTextField namefield;
    private FileWriter characterbuilder;

    public CharacterCreationPanel(Game root) {
        this.root = root;

        this.add(new JLabel("Character Creation!"));
        namefield = new JTextField(20);
        //TODO: character builder methods, character object or game runtime
        namefield.addKeyListener(new KeyListener() {

            //Note: The only key event that matters is an enter key press. The other methods have been intentionally left blank
            @Override
            public void keyTyped(KeyEvent e) {

            }

            /**
             * Handles name input and initializes character file
             * @param e
             */
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    // Confirm character name
                    int dialogResult = JOptionPane.showConfirmDialog(root, "So your name is " + namefield.getText() + "?", "Confirm Name", JOptionPane.YES_NO_OPTION);
                    if (dialogResult == JOptionPane.YES_OPTION) {
                        String name = namefield.getText();
                        System.out.println("Character named " + name);
                        // Try to initialize character file
                        try {
                            //TODO: Make dynamic naming alg.
                            characterbuilder = new FileWriter("./Game_Data/Characters/" + name + ".txt");
                            characterbuilder.write("Name: " + name);
                            System.out.println("Name written successfully");
                        } catch (IOException io) {
                            System.out.println("There was a problem initializing chr file");
                        }
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        this.add(namefield);
        try {
            characterbuilder.close();
        } catch (IOException e) {
            System.out.println("Character builder did not close");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

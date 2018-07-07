package gui;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 * This is the GUI components for Sleight of Iron. The fields of the components used in each panel can be found declared above their private assembler method.
 */
public class Game extends JFrame implements ActionListener {

    /**
     * Formatting constants
     */
    private final static int WIDTH = 1350;
    private final static int HEIGHT = 950;

    private final static String MAIN_MENU = "Main Menu";
    private final static String CHAR_CREATION = "Character Creation";

    private JPanel root;

    private CardLayout main_layout;


    /**
     * Constructor for the game panel
     */
    public Game() {
        // Set the title that appears at the top of the window
        setTitle("Sleight of Iron");

        // Cause the application to end when the windows is closed
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Give the window its initial dimensions
        setSize(WIDTH, HEIGHT);

        // The root panel contains everything
        main_layout = new CardLayout();
        root = new JPanel(main_layout);
        setContentPane(root);

        // Create the main menu, add it, and have it show on startup
        MainMenuPanel main_menu = new MainMenuPanel(this);
        root.add(main_menu, MAIN_MENU);
        root.add(new CharacterCreationPanel(this), CHAR_CREATION);
        main_layout.show(root, MAIN_MENU);


        //Make the game visible
        setVisible(true);
    }

    public void switchToCharacterCreation() {
        main_layout.show(root, CHAR_CREATION);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}


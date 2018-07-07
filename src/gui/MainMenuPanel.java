package gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenuPanel extends JPanel implements ActionListener {

    // These are buttons that belong to the main menu panel
    private JButton newGame, loadGame, options, exit;
    private JLabel title;
    private Game root;

    /**
     * Basic constructor for the main menu panel
     *
     * @param root JFrame on which the panel will be inserted
     */
    public MainMenuPanel(Game root) {
        //Make basic initializations
        this.root = root;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));


        //Format buttons and title
        title = new JLabel("Sleight of Iron");
        title.setFont(new Font("Serif", Font.PLAIN, 35));
        newGame = new JButton("New Game");

        loadGame = new JButton("Load Game");

        options = new JButton("Options");

        exit = new JButton("Quit");


        // Add event listeners to each button
        newGame.addActionListener(this);
        loadGame.addActionListener(this);
        options.addActionListener(this);
        exit.addActionListener(this);

        // Add buttons and spacing to panel
        this.add(Box.createRigidArea(new Dimension(5, 115)));
        this.add(title);
        title.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createRigidArea(new Dimension(5, 40)));
        this.add(newGame);
        newGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createRigidArea(new Dimension(5, 20)));
        this.add(loadGame);
        loadGame.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createRigidArea(new Dimension(5, 20)));
        this.add(options);
        options.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(Box.createRigidArea(new Dimension(5, 20)));
        this.add(exit);
        exit.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Add functionality to the "exit" button
        if (e.getSource() == exit) {
            root.dispatchEvent(new WindowEvent(root, WindowEvent.WINDOW_CLOSING));
        //Add functionality to the "new game" button
        } else if (e.getSource() == newGame) {
            int dialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to make a new character?", "Confirm New Character", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                root.switchToCharacterCreation();
                System.out.println("User has created a new character");
            }
        }
    }


}

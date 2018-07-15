package scripts;

import java.util.Scanner;

/**
 * @author Joshua Cragun
 * This is a digital in game representation of a character in the game. It is the object that
 * will be referred to in an active play through.
 * While the game is running, there should only be one character initialized at a time.
 * <p>
 * The character is built on startup by reading a character file. While the game is running stats about the character are updated,
 * and then the game is saved the data from the character object is written to the source character file.
 */

public class Character {
    /**
     * Makes a character from a given character file
     * @param charFile - scanner that is reading from the specified character file.
     */
    public Character(Scanner charFile) {

    }

    /**
     * When a character is first created by the user a character object is made with the stats to the users demands.
     *
     * @param name - first piece of info given by user
     */
    public Character(String name) {

    }
}

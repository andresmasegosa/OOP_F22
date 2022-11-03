package session7.B_TDD;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 *  Badminton Player:
 *
 *  - Write a class to represent a badminton player.
 *
 *  - A player has a name and a number of won and lost matches.
 *
 *  Exercise (using TDD):
 *  - Add a method "void wonMatch()" to the player class to signal s/he has won a match (and measure test coverage).
 */
public class TestPlayer {

    @Test
    public void createPlayer(){
        Player player = new Player("Andres");
        assertNotNull(player);
    }

    @Test
    public void createPlayerName(){
        Player player = new Player("Andres");
        assertEquals("Andres", player.getName());
    }

    @Test
    public void createPlayerWonLost(){
        Player player = new Player("Andres");
        assertEquals(0,player.getNumberOfWins());
    }

    @Test
    public void createWonMatch(){
        Player player = new Player("Andres");
        player.wonMatch();
        assertEquals(1,player.getNumberOfWins());
    }

        /***** UNCOMMENT BELOW TO PROVIDE FEEDBACK ****/
    /*
    @Test
    public void feedback() {
        //Did you have time to finish the exercise?
        boolean I_did_finish = true;

        //Did you understand the concepts used in the exercise?
        boolean I_did_understand = true;

        //Any comments
        String comment = "No comments";

        feedback.Feedback.submit("session7_B", I_did_finish, I_did_understand, comment);
        }
     */
}

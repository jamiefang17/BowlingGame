// tests

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BowlingGameTest {
    // @Test
    public void allGuttersGameScoreShouldBeZero() {
        Game game = new Game();
        for (int index = 0; index < 20; index++) {
            game.roll(0);
        }
        assertEquals(0, game.score());
    }



    /**
     * 
     */
    // @Test
    public void allOnesGameShouldScoreTwenty() {
        Game game = new Game();
        for (int index = 0; index < 20; index++) {
            game.roll(1);
        }
        assertEquals(20, game.score());
    }

    @Test
    public void spareShouldGetNextRollBonus() {
        Game game = new Game();
        game.roll(5);
        game.roll(5);
        game.roll(3);
        rollMany(game, 17, 0);
        assertEquals(16, game.score());
    }

    // other code ...
    private void rollMany(Game game, int i, int j) {
    }
}

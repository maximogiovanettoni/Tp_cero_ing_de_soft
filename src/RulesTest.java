import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RulesTest {
    Piedra piedra = new Piedra();
    Tijera tijera = new Tijera();
    Papel papel = new Papel();
    Player player1 = new Player();
    Player player2 = new Player();
    @Test
    public void rockBeatsScissors() {
        assertEquals(piedra, piedra.vs(tijera));
    }

    @Test
    public void rockLosesToPaper() {
        assertEquals(papel, piedra.vs(papel));
    }

    @Test
    public void rockDrawWithRock() {assertEquals(piedra, piedra.vs(piedra));}

    @Test
    public void paperBeatsRock() {
        assertEquals(papel, papel.vs(piedra));
    }

    @Test
    public void paperLosesToScissors() {
        assertEquals(tijera, papel.vs(tijera));
    }

    @Test
    public void paperDrawWithPaper() {assertEquals(papel, papel.vs(papel));}

    @Test
    public void scissorsBeatsPaper() {
        assertEquals(tijera, tijera.vs(papel));
    }

    @Test
    public void scissorsLosesToRock() {
        assertEquals(piedra, tijera.vs(piedra));
    }

    @Test
    public void scissorsDrawWithScissors() {assertEquals(tijera, tijera.vs(tijera));}

    @Test
    public void playersCanPlayWithoutKnowingTheShape() {
        player1.addMove(piedra);
        player2.addMove(tijera);
        assertEquals(player1.getMove(), player1.getMove().vs(player2.getMove()));
    }
}
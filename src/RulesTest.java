import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RulesTest {
    Piedra piedra = new Piedra();
    Tijera tijera = new Tijera();
    Papel papel = new Papel();
    @Test
    public void rockBeatsScissors() {
        assertEquals(piedra, piedra.rockvs(tijera));
    }

    @Test
    public void rockLosesToPaper() {
        assertEquals(papel, piedra.rockvs(papel));
    }

    @Test
    public void paperBeatsRock() {
        assertEquals(papel, papel.papervs(piedra));
    }
    @Test
    public void paperLosesToScissors() {
        assertEquals(tijera, papel.papervs(tijera));
    }

    @Test
    public void scissorsBeatsPaper() {
        assertEquals(tijera, tijera.siccorsvs(papel));
    }

    @Test
    public void scissorsLosesToRock() {
        assertEquals(piedra, tijera.siccorsvs(piedra));
    }
}
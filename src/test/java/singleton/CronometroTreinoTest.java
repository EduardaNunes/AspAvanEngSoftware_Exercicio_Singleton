package singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CronometroTreinoTest {

    @Test
    public void deveRetornarTempoRound() {
        CronometroTreino.getInstance().setTempoRound(120);
        assertEquals(120, CronometroTreino.getInstance().getTempoRound());
    }

    @Test
    public void deveRetornarTempoDescanso() {
        CronometroTreino.getInstance().setTempoDescanso(60);
        assertEquals(60, CronometroTreino.getInstance().getTempoDescanso());
    }

    @Test
    public void deveRetornarTempoIgualParaTodos() {
        CronometroTreino cronometroA = CronometroTreino.getInstance();
        CronometroTreino cronometroB = CronometroTreino.getInstance();
        cronometroA.setTempoRound(120);
        assertEquals(120, cronometroB.getTempoRound());
    }

}

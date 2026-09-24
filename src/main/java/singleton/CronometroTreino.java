package singleton;

public class CronometroTreino {

    private CronometroTreino() {};
    private static CronometroTreino instance = new CronometroTreino();

    public static CronometroTreino getInstance(){
        return instance;
    }

    private int tempoRound;
    private int tempoDescanso;

    public int getTempoRound() {
        return tempoRound;
    }

    public void setTempoRound(int tempoRound) {
        this.tempoRound = tempoRound;
    }

    public int getTempoDescanso() {
        return tempoDescanso;
    }

    public void setTempoDescanso(int tempoDescanso) {
        this.tempoDescanso = tempoDescanso;
    }
}

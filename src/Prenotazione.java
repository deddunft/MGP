public abstract class Prenotazione {
    private Sala sala;
    private int posti;

    public Prenotazione(Sala sala, int posti) {
        this.sala = sala;
        this.posti = posti;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    @Override
    public String toString() {
        return "Prenotazione{" +
                "sala=" + sala +
                ", posti=" + posti +
                '}';
    }
}

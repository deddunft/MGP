public class MiniGestionePrenotazioni {
    private int n;
    private int m;
    public sSala salai;
    public sSala salae;


    public MiniGestionePrenotazioni(int n, int m){
        this.n = n;
        salai = new sSala(this.n,Sala.INTERNO);
        this.m = m;
        salae= new sSala(this.m,Sala.ESTERNO);
    }

    public boolean Prenota(Prenotazione prenotazione){
        if (salae.getPosti()< prenotazione.getPosti()||salai.getPosti()<prenotazione.getPosti()){

            return false;
        }
        else
        if (prenotazione.getSala()==salae.getSala()){
            int pippo= salae.getPosti();
            salae.setPosti(pippo-prenotazione.getPosti());
        }
        else if (prenotazione.getSala()==salai.getSala()){
            int pippo= salai.getPosti();
            salai.setPosti(pippo-prenotazione.getPosti());
        }

            return true;
    }


    public sSala getSalai() {
        return salai;
    }

    public void setSalai(sSala salai) {
        this.salai = salai;
    }

    public sSala getSalae() {
        return salae;
    }

    public void setSalae(sSala salae) {
        this.salae = salae;
    }


    @Override
    public String toString() {
        return "MiniGestionePrenotazioni{" +
                ", salai=" + salai +
                ", salae=" + salae +
                '}';
    }
}

public class mein {

    public static void main(String[] args) {
        MiniGestionePrenotazioni mgp1 = new MiniGestionePrenotazioni(20,20);
        PrenotazioneSingola p1;
        System.out.println(mgp1.salae.getPosti());

        prenotazioneG pg1 = new prenotazioneG(Sala.ESTERNO,10);
        System.out.println(mgp1.Prenota(p1=new PrenotazioneSingola(Sala.ESTERNO)));
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1.Prenota(pg1));
        System.out.println(mgp1.salae.getPosti());
        System.out.println(mgp1.Prenota(pg1));
        System.out.println(mgp1.salae.getPosti());


    }
}

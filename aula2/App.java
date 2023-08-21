
public class App {
    public static void main (String[] args) {
    
        Time fla = new Time("Flamengo"); 
        Time flu = new Time("Fluminense", 2); // podemos criar de N maneiras diferentes!
        Time avai = new Time("Avaí");

        Partida flaflu = new Partida(fla, flu);

        flaflu.incGolsB();
        flaflu.incGolsB();
        flaflu.incGolsB();
        flaflu.incGolsA();

        //imprimePlacar(flaflu);

        Partida fluavai = new Partida(flu, avai);

        fluavai.incGolsA();
        fluavai.incGolsB();
        fluavai.incGolsB();
        fluavai.incGolsA();

       //imprimePlacar(fluavai);

       Campeonato c = new Campeonato();
       c.adicionaPartida(flaflu);
       c.adicionaPartida(fluavai);

       for (Partida p : c.getPartidas())
       {
        p.getTimeB().incTitulosMundiais();
        imprimePlacar(p);
       }
    }

    static void imprimePlacar (Partida p) {

        if (p.getPlacarA() == p.getPlacarB()) {
            System.out.println("\033[93mEMPATE\033[0m");
        }
        else if (p.getPlacarA() > p.getPlacarB()){
            System.out.println("\033[93mTime vencedor: \033[0m" + p.getTimeA().getNome());
        }
        else {
            System.out.println("\033[93mTime vencedor: \033[0m" + p.getTimeB().getNome());
        }
        
        System.out.println(p.getTimeA().getNome() + "  " + p.getPlacarA() + "\033[92m X \033[0m" + p.getPlacarB() + "  " + p.getTimeB().getNome());

        System.out.println("\nNum titulos mundiais A: " + p.getTimeA().getTitulosMundiais());
        System.out.println("Num titulos mundiais B: " + p.getTimeB().getTitulosMundiais() + "\n");
    }
}

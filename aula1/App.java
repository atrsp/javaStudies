
public class App {
    public static void main (String[] args) {
    
    /*
        Time fla = new Time();
        fla.setNome("Flamengo");
        System.out.println(fla.getNome());

        Time flu = new Time();
        flu.setNome("Fluminense");
        System.out.println(flu.getNome());

        Time avai = new Time();
        avai.setNome("Avaí");
        System.out.println(avai.getNome());

        Partida flaflu = new Partida();
        flaflu.setTimeA(fla);
        flaflu.setTimeB(flu);

        flaflu.incrementaGolsB();
        flaflu.incrementaGolsB();
        flaflu.incrementaGolsB();
        flaflu.incrementaGolsA();

        System.out.print("fla: " + flaflu.getGolsA());
        System.out.println(", flu: " + flaflu.getGolsB());

        Partida fluavai = new Partida();
        fluavai.setTimeA(flu);
        fluavai.setTimeB(avai);

        fluavai.incrementaGolsA();
        fluavai.incrementaGolsB();
        fluavai.incrementaGolsB();
        fluavai.incrementaGolsA();

        System.out.print("flu: " + fluavai.getGolsA());
        System.out.println(", avai: " + fluavai.getGolsB());

        Partida flaflu = new Partida();
        flaflu.setTimeA(fla);
        flaflu.setTimeB(flu);

        flaflu.incrementaGolsB();
        flaflu.incrementaGolsB();
        flaflu.incrementaGolsB();
        flaflu.incrementaGolsA();

        System.out.print("fla: " + flaflu.getGolsA());
        System.out.println(", flu: " + flaflu.getGolsB());

        Partida fluavai = new Partida();
        fluavai.setTimeA(flu);
        fluavai.setTimeB(avai);

        fluavai.incrementaGolsA();
        fluavai.incrementaGolsB();
        fluavai.incrementaGolsB();
        fluavai.incrementaGolsA();

        System.out.print("flu: " + fluavai.getGolsA());
        System.out.println(", avai: " + fluavai.getGolsB());
    */

        Time fla = new Time("Flamengo"); 
        //System.out.println(fla.getNome());

        Time flu = new Time("Fluminense", 65); // podemos criar de N maneiras diferentes!
        //System.out.println(flu.getNome());

        Time avai = new Time("Avaí");
        //System.out.println(avai.getNome());
        //System.out.println();

        Partida flaflu = new Partida(fla, flu);

        /*
        flaflu.incrementaGolsB();
        flaflu.incrementaGolsB();
        flaflu.incrementaGolsB();
        flaflu.incrementaGolsA();

        if (flaflu.getGolsA() == flaflu.getGolsB()) {
            System.out.println("\033[93mEMPATE\033[0m");
        }
        else if (flaflu.getGolsA() > flaflu.getGolsB()){
            System.out.println("\033[93mTime vencedor: \033[0m" + flaflu.getTimeA().getNome());
        }
        else {
            System.out.println("\033[93mTime vencedor: \033[0m" + flaflu.getTimeB().getNome());
        }

        System.out.println(flaflu.getTimeA().getNome() + "  " + flaflu.getGolsA() + "\033[92m X \033[0m" + flaflu.getGolsB() + "  " + flaflu.getTimeB().getNome() + "\n");

        */

        flaflu.incGolsB();
        flaflu.incGolsB();
        flaflu.incGolsB();
        flaflu.incGolsA();

        imprimePlacar(flaflu);

        Partida fluavai = new Partida(flu, avai);

        fluavai.incGolsA();
        fluavai.incGolsB();
        fluavai.incGolsB();
        fluavai.incGolsA();

       imprimePlacar(fluavai);

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
    }
}

import java.util.LinkedList;

public class Campeonato {
    private LinkedList<Partida> partidas = new LinkedList<Partida>();

    public void adicionaPartida (Partida p) {
        partidas.addLast(p);
    }

    public LinkedList<Partida> getPartidas() {
        return new LinkedList<Partida>(partidas);
    }
}

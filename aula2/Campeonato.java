import java.util.LinkedList;

public class Campeonato {
    private LinkedList<Partida> partidas = new LinkedList<Partida>();

    public void adicionaPartida (Partida p) {
        partidas.add(p);
    }

    public Partida getPartida (int i) {
        return partidas.get(i);
    }

    public LinkedList<Partida> getPartidas() {
        //criamos uma shallow copy, que aponta para as mesmas partidas
        //ou seja, se alterarmos as partidas de um campeonato, alteraremos a sua copia tambem
        //a copia aponta para os mesmos pontos do campeonato original
        return new LinkedList<Partida>(partidas);
    }
}

public class Partida {
    
    private Time timeA, timeB;
    private int GolsA,GolsB;
    private int[] placar = new int[2];

    public Partida (Time timeA, Time timeB) {
        this.timeA = timeA;
        this.timeB = timeB;
    }

    public Time getTimeA() {
        return timeA;
    }

    /*
    public void setTimeA (Time time) {
        this.timeA = time;
    }
    */
    
    public Time getTimeB() {
        return timeB;
    }

    /*
    public void setTimeB (Time time) {
        this.timeB = time;
    }
    */

    public void incrementaGolsA () {
        this.GolsA++;
    }

    public void incrementaGolsB () {
        this.GolsB++;
    }

    public int getGolsA () {
        return this.GolsA;
    }

    public int getGolsB () {
        return this.GolsB;
    }

    public int getPlacarA () {
        return placar[0];
    }

    public int getPlacarB () {
        return placar[1];
    }

    public void incGolsA () {
        placar[0]++;
    }

    public void incGolsB () {
        placar[1]++;
    }
}


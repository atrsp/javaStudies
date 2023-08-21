import java.util.LinkedList;

public class Time {

    private String nome;
    private int nTitulosMundiais;
    private LinkedList<Jogador> elenco = new LinkedList<Jogador>();

    public Time (String nome) {
        this.nome = nome;
    }

    // podemos descrever mais de uma maneira de criar um time dependendo da qtd de parametros passados
    public Time (String nome, int nTitulosMundiais){
        this.nome = nome;
        this. nTitulosMundiais = nTitulosMundiais;
    }

    public String getNome() {
        return this.nome;
    }

    public void incTitulosMundiais () {
        this.nTitulosMundiais++;
    }

    public int getTitulosMundiais () {
        return this.nTitulosMundiais;
    }
    /*
    public void setNome (String nome) {
        this.nome = nome;
    }
    */
}

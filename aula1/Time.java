
public class Time {

    private String nome;
    int nTitulosMundiais;

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

    /*
    public void setNome (String nome) {
        this.nome = nome;
    }
    */
}

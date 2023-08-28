public class Funcionario {
    private String nome;
    private int salario = 0;

    public Funcionario (String nome, int salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    
    public float getSalario() {
        return salario;
    }

}

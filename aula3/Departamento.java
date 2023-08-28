
import java.util.HashSet;

public class Departamento {
    private String nome;
    private HashSet<Funcionario> funcionarios = new HashSet<>();
    // or     private HashSet<Funcionario> funcionarios = new HashSet<Funcionario>();

    public String getNome() {
        return nome;
    }

    public Departamento (String nome) {
        this.nome = nome;
    } 

    public void addFuncionario (Funcionario f) {
        this.funcionarios.add(f);
    }

    public void removeFuncionario (Funcionario f) {
        this.funcionarios.remove(f);
    }

    public HashSet<Funcionario> getFuncionarios () {
        // precisamos retornar uma copia para não vazar a estrutura interna (evitar alterações do usuario na base)
        return new HashSet<Funcionario>(funcionarios);
    }

    public int getMediaSalarial() {

        if (funcionarios.isEmpty()) return 0;

        int soma = 0;
        int size = 0;

        for (Funcionario f : funcionarios) {
            soma += f.getSalario();
        }

        return soma/size;
    }
}

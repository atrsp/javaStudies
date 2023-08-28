import java.util.HashSet;

public class Empresa {
    private String nome;
    private HashSet<Departamento> departamentos = new HashSet<Departamento>();

    public Empresa (String nome) {
        this.nome = nome;
    } 

    public String getNome() {
        return nome;
    }

    public void addDepartamento (Departamento d) {
        this.departamentos.add(d);
    }

    public void removeDepartamento (Departamento d) {
        this.departamentos.remove(d);
    }

    public HashSet<Departamento> getDepartamentos () {
        return new HashSet<Departamento>(departamentos);
    }

    public float getMediaSalarialEmp() {
        
        //aqui, nao consideramos que ha funcionarios que participam de mais de um depto

        float soma = 0.0f;
        int n = 0;

        for (Departamento d : this.departamentos)
        {
            for (Funcionario f : d.getFuncionarios()){
                soma += f.getSalario();
                n++;
            }
        }

        if (n == 0) return 0;

        return soma/n;
    }

    public HashSet<Funcionario> getFuncionarios ()
    {
        HashSet<Funcionario> funcionarios = new HashSet<>();
        for (Departamento d: departamentos) 
            funcionarios.addAll(d.getFuncionarios());

        return funcionarios;
    }

    public float getMediaSalarialAltern() {
        

        // implementação alternativa para evitar contabilizar 2x funcionarios em 2 deptos diff: 
            //colocar todos os funcionarios em um conjunto (nao add se tiver repeticoes) e calcular a media por la

        HashSet<Funcionario> funcionarios = getFuncionarios();
    
        if (funcionarios.isEmpty()) return 0;

        float soma = 0;

        for (Funcionario f : funcionarios)
            soma += f.getSalario();
        
        return soma/funcionarios.size();
    }

}

//https://www.w3schools.com/java/java_hashset.asp

public class App {

    public static void main (String[] args) {
                
        Empresa zara = new Empresa("Zara");

        Departamento rh = new Departamento("RH");
        rh.addFuncionario(new Funcionario("Sofia", 1600));
        rh.addFuncionario(new Funcionario("Arthur", 2000));
        rh.addFuncionario(new Funcionario("Joao", 5000));
        
        Departamento tech = new Departamento("Tech");
        tech.addFuncionario(new Funcionario("Luiz", 15000));
        tech.addFuncionario(new Funcionario("Vitor", 18000));
        tech.addFuncionario(new Funcionario("Ana Tereza", 20000));

        zara.addDepartamento(rh);
        zara.addDepartamento(tech);

        zara.addDepartamento(new Departamento("Juridico"));
        zara.addDepartamento(new Departamento("Design"));
        zara.addDepartamento(new Departamento("Financeiro"));
        zara.addDepartamento(new Departamento("Marketing"));

        for (Departamento d : zara.getDepartamentos()) {
            System.out.println(d.getNome());
                
            int media = 0;         // para declarar variaveis na main, precisamos inicializar as variaveis com 0

            for (Funcionario f : d.getFuncionarios()) {
                System.out.println(f.getNome() + "  " + f.getSalario());
                media += f.getSalario();
            }
            int sze = d.getFuncionarios().size();
            if (sze > 0) media = media/sze;

            System.out.println("\n media = " + media + "\n");
        }
        

    }

}

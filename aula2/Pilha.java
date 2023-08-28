public class Pilha {
    
    private String [] items = new String[100];
    private int tamanho;
    
    public void empilha (String s) {
        items[tamanho]= s;
        tamanho++;
    }
}

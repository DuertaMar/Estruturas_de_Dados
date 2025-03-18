public class FilaSimples {
    private int tamanho;
    private Integer [] filaSimples;

    public FilaSimples (int tamanho){
        setTamanho(tamanho);
        this.filaSimples= new Integer[getTamanho()];
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public Integer[] getFilaSimples() {
        return filaSimples;
    }

    public void setFilaSimples(Integer[] filaSimples) {
        this.filaSimples = filaSimples;
    }
}

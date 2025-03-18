public class No {
    private Integer conteudo;
    private Integer peso;
    private No proximo;
    private No anterior;

    public No(Integer conteudo, Integer peso){
        setConteudo(conteudo);
        setPeso(peso);
        setProximo(null);
        setAnterior(null);
    }


    //Get e set
    public Integer getConteudo() {
        return conteudo;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}

package Nos;

public class NoInteger {
    private Integer conteudo;
    private Integer peso;
    private NoInteger proximo;
    private NoInteger anterior;

    public NoInteger(){
        setConteudo(null);
        setPeso(null);
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

    public NoInteger getProximo() {
        return proximo;
    }

    public void setProximo(NoInteger proximo) {
        this.proximo = proximo;
    }

    public NoInteger getAnterior() {
        return anterior;
    }

    public void setAnterior(NoInteger anterior) {
        this.anterior = anterior;
    }
}

import Nos.NoInteger;

public class BaseNoDinamica {
    private NoInteger noInteger;
    //private NoString noString;
    //private NoFloat noFloat;


    //precisa setar os nos aqui e criar varios métodos considerando o tipo

    public void visualizarNoInteger (){
        NoInteger aux= noInteger;
        if (vaziaNoInteger(aux)) {
            while (aux!=null){
                System.out.println("Conteudo: "+noInteger.getConteudo()+", Peso: "+noInteger.getPeso());
                aux = aux.getProximo();
            }
        } else{
            System.out.println("Está vazio.");
        }
    }
    public boolean vaziaNoInteger (NoInteger noInteger) {
        if (noInteger !=null) {
            return true;
        }
        return false;

    }
    public NoInteger criarNoInteger (Integer conteudo, Integer peso) {
        NoInteger novoNo = new NoInteger();
        novoNo.setConteudo(conteudo);
        novoNo.setPeso(peso);
        return novoNo;
    }



}

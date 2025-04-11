import Dinamicas.PhilaDinamicaInteger;

public class MainPilhaDinamicaJ {
    public static void main(String[] args) {
        PhilaDinamicaInteger pilha = new PhilaDinamicaInteger();
        pilha.adicionarPilha(4, 0);
        pilha.adicionarPilha(5, 0);
        pilha.adicionarPilha(8, 0);
        pilha.adicionarPilha(9, 0);
        pilha.adicionarPilha(5, 0);
        pilha.adicionarPilha(11, 0);
        pilha.adicionarPilha(6, 0);
        pilha.adicionarPilha(5, 0);
        pilha.adicionarPilha(19, 0);
        pilha.adicionarPilha(56, 0);
        pilha.adicionarPilha(5, 0);
        pilha.mostrarPhila();

        //pilha.removerElemento(5);

        //pilha.removerTodasOcorrencias(5);

        //List<Integer> elementosLista = Arrays.asList(4, 5, 9);
        //pilha.removerSequencia(elementosLista);

        pilha.mostrarPhila();
    }
}

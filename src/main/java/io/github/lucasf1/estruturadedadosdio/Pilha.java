package io.github.lucasf1.estruturadedadosdio;

public class Pilha<T> {

    private No<T> refEntradaPilha;

    public Pilha() {
        this.refEntradaPilha = null;
    }

    public No<T> top(){
        return refEntradaPilha;
    }

    public void push(T obj){
        No<T> refAuxiliar = refEntradaPilha;
        refEntradaPilha = new No<>(obj);
        refEntradaPilha.setProximoNo(refAuxiliar);
    }

    public No<T> pop() {
        if (! isEmpty()) {
            No<T> noPoped = refEntradaPilha;
            refEntradaPilha = refEntradaPilha.getProximoNo();
            return noPoped;
        }
        return null;
    }

    public boolean isEmpty() {
        return refEntradaPilha == null? true: false;
    }

    @Override
    public String toString() {

        String stringRetorno = "---------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "---------------\n";

        No<T> noAuxiliar = refEntradaPilha;
        while(true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No {dado = "+noAuxiliar.getConteudo()+" }]\n";
                noAuxiliar = noAuxiliar.getProximoNo();
            } else {
                break;
            }
        }
        stringRetorno += "=================\n";

        return stringRetorno;
    }
}


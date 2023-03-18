package io.github.lucasf1.estruturadedadosdio;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void remove(int index) {
        if (index > this.tamanhoLista) {
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista.");
        }

        No<T> noAux = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getProximoNo();
            this.cabeca.setProximoNo(this.cauda);
        } else if (index == 1) {
            this.cauda.setProximoNo(this.cauda.getProximoNo().getProximoNo());
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAux = noAux.getProximoNo();
            }
            noAux.setProximoNo(noAux.getProximoNo().getProximoNo());
        }
        this.tamanhoLista--;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setProximoNo(cauda);
        } else {
            novoNo.setProximoNo(this.cauda);
            this.cabeca.setProximoNo(novoNo);
            this.cauda = novoNo;
        }

        this.tamanhoLista++;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAux = cauda;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{refEntrada=" + noAux.getConteudo() + "}]---> ";
            noAux = noAux.getProximoNo();
        }
        strRetorno += this.size() != 0 ? "(Retorna ao início)" : "[]";

        return strRetorno;
    }

    private No<T> getNo(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista está vazia.");
        }

        if (index == 0) {
            return this.cauda;
        }

        No<T> noAux = this.cauda;
        for (int i = 0; (i < index) && (noAux != null); i++) {
            noAux = noAux.getProximoNo();
        }
        return noAux;
    }
}

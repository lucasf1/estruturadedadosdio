package io.github.lucasf1.estruturadedadosdio;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanhoLista = 0;
    }

    public int size() {
        return tamanhoLista;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public void add(T conteudo) {
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoPosterior(null);
        novoNo.setNoAnterior(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoPosterior(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T conteudo) {
        NoDuplo<T> novoAux = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(conteudo);
        novoNo.setNoPosterior(novoAux);

        if (novoNo.getNoPosterior() != null) {
            novoNo.setNoAnterior(novoAux.getNoAnterior());
            novoNo.getNoPosterior().setNoAnterior(novoNo);
        } else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        } else {
            novoNo.getNoAnterior().setNoPosterior(novoNo);
        }
        tamanhoLista++;
    }

    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getNoPosterior();
            if (primeiroNo != null) {
                primeiroNo.setNoAnterior(null);
            }
        } else {
            NoDuplo<T> noAux = getNo(index);
            noAux.getNoAnterior().setNoPosterior(noAux.getNoPosterior());
            if (noAux != null) {
                noAux.getNoPosterior().setNoAnterior(noAux.getNoAnterior());
            } else {
                ultimoNo = noAux;
            }
        }
        tamanhoLista--;
    }

    @Override
    public String toString() {

        String strRetorno = "";
        NoDuplo<T> noAux = primeiroNo;
        for (int i = 0; i < size(); i ++) {
            strRetorno += "[No{Conteudo="+noAux.getConteudo()+"}] --->";
            noAux = noAux.getNoPosterior();
        }
        strRetorno += "null";
        return strRetorno;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> noAux = primeiroNo;
        for(int i = 0; (i < index) && (noAux != null); i++) {
            noAux = noAux.getNoPosterior();
        }
        return noAux;
    }
}

package io.github.lucasf1.estruturadedadosdio;

public class ListaEncadeada<T> {

    private No<T> refEntrada;

    public ListaEncadeada() {
        refEntrada = null;
    }

    public int size() {
        int tamanhoLista = 0;
        No<T> refAux = refEntrada;
        while (true) {
            if (refAux != null) {
                tamanhoLista++;
                if (refAux.getProximoNo() != null) {
                    refAux = refAux.getProximoNo();
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        return tamanhoLista;
    }

    public boolean isEmpty() {
        return refEntrada == null ? true : false;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            refEntrada = novoNo;
            return;
        }

        No<T> noAux = refEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAux = noAux.getProximoNo();
        }

        noAux.setProximoNo(novoNo);
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public T remove(int index) {
        No<T> noAlvo = getNo(index);
        if (index == 0) {
            refEntrada = noAlvo.getProximoNo();
            return noAlvo.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noAlvo.getProximoNo());
        return noAlvo.getConteudo();
    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAux = refEntrada;

        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{refEntrada=" + noAux.getConteudo() + "}]---> ";
            noAux = noAux.getProximoNo();
        }
        strRetorno += "null";

        return strRetorno;
    }

    private No<T> getNo(int index) {

        validaIndice(index);
        No<T> noAux = refEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index; i++) {
            noRetorno = noAux;
            noAux = noAux.getProximoNo();
        }
        return noRetorno;
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            int ultimoIndex = size() - 1;
            throw new IndexOutOfBoundsException(
                    "Não existe conteúdo no indice " + index + " desta lista. " +
                            "Esta lista só até o indice " + ultimoIndex + ".");
        }
    }
}


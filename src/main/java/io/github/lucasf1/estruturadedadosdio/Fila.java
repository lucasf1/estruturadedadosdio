package io.github.lucasf1.estruturadedadosdio;

public class Fila<T> {

    private No<T> refEntradaFila;

    public Fila() {
        this.refEntradaFila = null;
    }

    public boolean isEmpty() {
        return refEntradaFila == null? true: false;
    }

    public void enqueue(T obj) {
        No<T> novoNo = new No<>(obj);
        novoNo.setProximoNo(refEntradaFila);
        refEntradaFila = novoNo;
    }

    public T first() {
        if (! isEmpty()) {
            No<T> primeiroNo = refEntradaFila;
            while (true) {
                if (primeiroNo.getProximoNo() != null ){
                    primeiroNo = primeiroNo.getProximoNo();
                }else {
                    break;
                }
            }
            return (T) primeiroNo.getConteudo();
        }
        return null;
    }

    public T dequeue() {
        if (! isEmpty()) {
            No<T> primeiroNo = refEntradaFila;
            No<T> noAuxiliar = refEntradaFila;

            while (true) {
                if (primeiroNo.getProximoNo() != null ){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getProximoNo();
                }else {
                    noAuxiliar.setProximoNo(null);
                    break;
                }
            }
            return primeiroNo.getConteudo();
        }
        return null;
    }

    @Override
    public String toString() {
        String retorno = "";
        No<T> noAuxiliar = refEntradaFila;
        if (! isEmpty() ){
            while(true){
                retorno += "[No{objeto="+noAuxiliar.getConteudo()+"}]--->";
                if (noAuxiliar.getProximoNo() != null) {
                    noAuxiliar = noAuxiliar.getProximoNo();
                } else {
                    retorno += "null";
                    break;
                }
            }
        } else {
            retorno = "null";
        }

        return retorno;
    }
}

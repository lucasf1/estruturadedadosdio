package io.github.lucasf1.estruturadedadosdio;

public class Main {
    private static void testarPilha() {
        Pilha<Integer> minhaPilha = new Pilha<>();

        minhaPilha.push(1);
        minhaPilha.push(2);
        minhaPilha.push(3);
        minhaPilha.push(4);
        minhaPilha.push(5);
        minhaPilha.push(6);

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);

        minhaPilha.push(99);
        System.out.println(minhaPilha);
    }

    private static void testarFila() {
        Fila<String> minhaFila = new Fila<>();
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println(minhaFila);

        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");
        System.out.println(minhaFila);
        System.out.println(minhaFila.first());
        System.out.println(minhaFila);
    }

    private static void testarListaEncadeada() {
        ListaEncadeada<String> minhaListaEncadiada = new ListaEncadeada<>();

        minhaListaEncadiada.add("teste 1");
        minhaListaEncadiada.add("teste 2");
        minhaListaEncadiada.add("teste 3");
        minhaListaEncadiada.add("teste 4");

        System.out.println(minhaListaEncadiada.get(0));
        System.out.println(minhaListaEncadiada.get(1));
        System.out.println(minhaListaEncadiada.get(2));
        System.out.println(minhaListaEncadiada.get(3));

        System.out.println(minhaListaEncadiada);

        System.out.println(minhaListaEncadiada.remove(3));
        System.out.println(minhaListaEncadiada);
    }

    private static void testaListaDuplamenteEncadeada() {
        ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
        minhaLista.add("c1");
        minhaLista.add("c2");
        minhaLista.add("c3");
        minhaLista.add("c4");
        minhaLista.add("c5");
        minhaLista.add("c6");
        minhaLista.add("c7");
        System.out.println(minhaLista);

        minhaLista.remove(3);
        minhaLista.add(3, "99");
        System.out.println(minhaLista);
        System.out.println(minhaLista.get(3));
    }

    public static void main(String[] args) {
        // testarPilha();
        // testarFila();
        // testarListaEncadeada();
        testaListaDuplamenteEncadeada();
    }
}

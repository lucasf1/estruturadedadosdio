package io.github.lucasf1.estruturadedadosdio;

import io.github.lucasf1.estruturadedadosdio.model.Obj;

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

    private static void testarListaDuplamenteEncadeada() {
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

    private static void testarListaCircular() {
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();

        minhaListaCircular.add("c0");
        System.out.println(minhaListaCircular);

        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c1");
        System.out.println(minhaListaCircular);

        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        System.out.println(minhaListaCircular);

//        System.out.println(minhaListaCircular.get(0));
//        System.out.println(minhaListaCircular.get(1));
//        System.out.println(minhaListaCircular.get(2));
//        System.out.println(minhaListaCircular.get(3));
//        System.out.println(minhaListaCircular.get(4));

        for (int i = 0; i < 20; i++) {
            System.out.println(minhaListaCircular.get(i));
        }
    }

    private static void testarArvoreBinaria() {

        ArvoreBinaria<Obj> minhaArvore = new ArvoreBinaria<Obj>();
        minhaArvore.inserir(new Obj(13));
        minhaArvore.inserir(new Obj(10));
        minhaArvore.inserir(new Obj(25));
        minhaArvore.inserir(new Obj(2));
        minhaArvore.inserir(new Obj(12));
        minhaArvore.inserir(new Obj(20));
        minhaArvore.inserir(new Obj(31));
        minhaArvore.inserir(new Obj(29));
        minhaArvore.inserir(new Obj(32));

        minhaArvore.exibirInOrdem();
        minhaArvore.exibirPreOrdem();
        minhaArvore.exibirPosOrdem();


    }

    public static void main(String[] args) {
        // testarPilha();
        // testarFila();
        // testarListaEncadeada();
        // testarListaDuplamenteEncadeada();
        // testarListaCircular();
        testarArvoreBinaria();
    }


}

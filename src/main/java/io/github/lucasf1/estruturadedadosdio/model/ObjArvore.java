package io.github.lucasf1.estruturadedadosdio.model;

public abstract class ObjArvore<T> implements Comparable<T> {

        public abstract boolean equals(Object o);
        public abstract int hashCode();
        public abstract int compareTo(T outro);
        public abstract String toString();
}

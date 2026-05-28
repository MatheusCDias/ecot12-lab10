package br.edu.unifei.ecot12.lab10.clonagem;

public interface Prototipo<T extends Prototipo<T>> {
    public T clone();
}

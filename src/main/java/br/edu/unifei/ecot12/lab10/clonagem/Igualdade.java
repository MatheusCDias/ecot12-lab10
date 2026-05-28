package br.edu.unifei.ecot12.lab10.clonagem;

public interface Igualdade <T extends Igualdade<T>>{
    public boolean isEqual(T obj);
}

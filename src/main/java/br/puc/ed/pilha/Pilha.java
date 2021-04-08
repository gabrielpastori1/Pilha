package br.puc.ed.pilha;

public interface Pilha {

    void push(String e);

    String pop();

    String top();

    Integer size();

    Boolean isEmpty();
}

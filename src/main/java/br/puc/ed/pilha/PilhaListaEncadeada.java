package br.puc.ed.pilha;

public class PilhaListaEncadeada implements Pilha {
    public Node inicio = null;
    private int count = 0;

    public PilhaListaEncadeada() {
        // TODO
    }

    @Override
    public void push(Character e) {
        inicio = new Node(e, inicio);
        count++;
    }

    @Override
    public Character pop() {
        if(count == 0) return null;
        Node n = inicio; //Cache Node
        inicio = inicio.getAnterior();
        count--;
        return n.getCharacter();
    }
    
    @Override
    public Character top() {
        if(count == 0) return null;
        return inicio.getCharacter();
    }

    @Override
    public Integer size() {
        return count;
    }

    @Override
    public Boolean isEmpty() {
        return (count == 0);
    }
}

package br.puc.ed.pilha;

public class PilhaArray implements Pilha {

    private Character[] array;
    private int count = 0;
    private int capacidade;

    public PilhaArray(int c) {
        array = new Character[c];
        capacidade = c;
    }

    @Override
    public void push(Character e) {
        if(count == capacidade) return;
        array[count] = e;
        count++;
    }
    
    @Override
    public Character pop() {
        if(isEmpty()) return null;
        Character c = array[count-1]; //Cache Charter
        array[count-1] = null; //Remove from array
        count--; // Remove
        return c;
    }
    
    @Override
    public Character top() {
        if(isEmpty()) return null;
        return array[count - 1];
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

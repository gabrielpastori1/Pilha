package br.puc.ed.pilha;

public class Node {
    private Node a; //Anterior
    private Character c; //Character
    
    public Node(Character character, Node anterior) {
        a = anterior;
        c = character;
    }

    public Node getAnterior() {
        return a;
    }

    public void setAnterior(Node anterior) {
        a = anterior;
    }

    public Character getCharacter() {
        return c;
    }

    public void setCharacter(Character character){
        c = character;
    }
}

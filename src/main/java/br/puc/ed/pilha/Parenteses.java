package br.puc.ed.pilha;

public class Parenteses {

    public boolean process(String string){
        PilhaListaEncadeada pilha = new PilhaListaEncadeada();
        for(int i=0;i<string.length();i++){
            Character c = string.charAt(i);
            if(c == '{' || c == '(' || c == '[') pilha.push(c);
            if(c == '}' || c == ')' || c == ']'){
                if(pilha.size() == 0) return false;
                switch(c){
                    case '}':
                        if(pilha.pop() == '{') break;
                        return false;
                    case ')':
                        if(pilha.pop() == '(') break;
                        return false;
                    case ']':
                        if(pilha.pop() == '[') break;
                        return false;
                    default:
                        System.out.println("Algo deu errado\tCharter: " + c);
                }
            }
        }
        return pilha.isEmpty();
    }
}
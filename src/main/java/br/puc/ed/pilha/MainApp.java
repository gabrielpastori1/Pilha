package br.puc.ed.pilha;

public class MainApp {

    public static void main(String[] args) {
        for (int i = 0; i < 100; ++i) {
            System.out.println(); //Apenas para limpar meu console
        }

        StringUtils s = new StringUtils();
        System.out.println(s.reverse("string") + "\tExpected: gnirts");
        System.out.println(s.reverse("Gabriel") + "\tExpected: leirbaG");


        // Pilha pilha = new PilhaArray(10);
        // Pilha pilha = new PilhaListaEncadeada();

        // pilha.push('G');
        // pilha.push('J');
        // pilha.push('P');
        // pilha.push('Q');
        // System.out.println(String.valueOf(pilha.pop()) + "\tExpected: Q");
        // System.out.println(String.valueOf(pilha.pop()) + "\tExpected: P");
        // System.out.println(String.valueOf(pilha.top()) + "\tExpected: J");
        // System.out.println(String.valueOf(pilha.pop()) + "\tExpected: J");
        // pilha.push('O');
        // System.out.println(String.valueOf(pilha.pop()) + "\tExpected: O");
        // System.out.println(String.valueOf(pilha.pop()) + "\tExpected: G");
        // System.out.println(String.valueOf(pilha.pop()) + "\tExpected: null");

    }
}

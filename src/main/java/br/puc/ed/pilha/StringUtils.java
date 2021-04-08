package br.puc.ed.pilha;

public class StringUtils {
    private String s;

    public String reverse(String string) {
        String result = "";
        PilhaArray array = toCharterArray(string);
        while(!array.isEmpty()) {
            result = result + String.valueOf(array.pop());
        }
        return result;
    }
    
    public PilhaArray toCharterArray(String string) {
        PilhaArray c = new PilhaArray(string.length());
        for(int i=0; i < string.length();i++){
            c.push(string.charAt(i));
        } 
        return c;
    }
}
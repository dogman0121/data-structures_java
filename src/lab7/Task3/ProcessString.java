package lab7.Task3;

import lab7.Task2.StringInterface;

class ProcessString implements StringInterface {
    public int countSymbols(String s, char c) {
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                n++;
            }
        }
        return n;
    }

    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public String getNotEvenString(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
                sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}

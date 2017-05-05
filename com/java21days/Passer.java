package com.java21days;

class Passer {

    void toUpperCase(String[] text) {
        for (int i = 0; i < text.length; i++) {
            text[i] = text[i].toUpperCase();///×ª´óÐ´
        }
    }

    public static void main(String[] arguments) {
        Passer Passer = new Passer();
        Passer.toUpperCase(arguments);
        for (int i = 0; i < arguments.length; i++) {
            System.out.print(arguments[i] + " ");
        }
        System.out.println();
    }
}
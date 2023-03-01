package com.pankz.solidprinciples.singleresponsiblity;

//Let’s consider a class that contains code that changes the text in some way.
// The only job of this class should be manipulating text.

public class TextManipulator {
    TextManipulator textManipulator;

    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

    public String findWordAndDelete(String word) {
        if (text.contains(word)) {
            text = text.replace(word, "");
        }
        return text;
    }

    public void printText() {

        System.out.println(textManipulator.getText());
    }
}

//Here we have two responsiblity manipulating and printing the text
//For this purpose, we should create another class, which will only handle printing text:

package com.pankz.solidprinciples.openclosed;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Can not perform operation");
        }
        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }
}
//When a new requirement comes in for e.g of division and multiplication,we have to change the calculate method
//of calculator class therfore violating open closed rules i.e closed for modification as we have to modify here

//The code in the calculate method will change with every incoming new operation support request.
// So, we need to extract this code and put it in an abstraction layer.
//One solution is to delegate each operation into their respective class:
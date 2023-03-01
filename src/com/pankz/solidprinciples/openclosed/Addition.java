package com.pankz.solidprinciples.openclosed;

public class Addition implements CalculatorOperation{
    private double left;
    private double right;
    private double result=0.0;

    public Addition(double left, double right, double result) {
        this.left = left;
        this.right = right;
        this.result = result;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}

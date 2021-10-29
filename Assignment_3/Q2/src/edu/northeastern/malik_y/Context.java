package edu.northeastern.malik_y;

public class Context {
    MathOperation mathOp;
    public Context(MathOperation mathOp){
        this.mathOp = mathOp;
    }

    public int execute(int num1, int num2){
        return this.mathOp.performOperation(num1, num2);
    }
}

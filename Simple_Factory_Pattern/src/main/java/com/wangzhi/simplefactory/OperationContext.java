package com.wangzhi.simplefactory;

public class OperationContext {

    private Operation operation;

    public OperationContext(String operate) {
        switch (operate) {
            case "+":
                operation = new AddOperation();
                break;
            case "-":
                operation = new SubOperation();
                break;
            case "*":
                operation = new MulOperation();
                break;
            case "/":
                operation = new DivOperation();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operate);
        }
    }

    public double getResult(String numberA, String numberB) {
        operation.setNumberA(Double.parseDouble(numberA));
        operation.setNumberB(Double.parseDouble(numberB));
        return operation.getResult();
    }
}

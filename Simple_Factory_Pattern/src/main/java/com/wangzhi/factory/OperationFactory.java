package com.wangzhi.factory;

import java.util.Scanner;

public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation result;
        switch (operate) {
            case "+":
                result = new AddOperation();
                break;
            case "-":
                result = new SubOperation();
                break;
            case "*":
                result = new MulOperation();
                break;
            case "/":
                result = new DivOperation();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operate);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        String numberA = scanner.nextLine();
        System.out.println("请输入运算符号，目前仅支持 +、-、*、/：");
        String operate = scanner.nextLine();
        System.out.println("请输入第二个数字：");
        String numberB = scanner.nextLine();
        Operation operation = OperationFactory.createOperation(operate);
        operation.setNumberA(Double.parseDouble(numberA));
        operation.setNumberB(Double.parseDouble(numberB));
        System.out.println("计算出的结果为：" + operation.getResult());
    }
}

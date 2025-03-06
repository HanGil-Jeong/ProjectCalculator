package CalculatorLv1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        String operation;

        while (true) {
            System.out.print("숫자를 입력해주세요: ");
            number1 = scanner.nextInt();
            System.out.println(number1);

            System.out.println("-----------");
            System.out.println("+, -, x, %");
            System.out.println("-----------");
            System.out.print("사칙연산 선택: ");
            operation = scanner.next();

            while (true) {
                System.out.print("숫자를 입력해주세요: ");
                number2 = scanner.nextInt();
                System.out.println(number1 + operation + number2);

                if (operation.equals("+")) {
                    int result = number1 + number2;
                    System.out.println(number1 + operation + number2 + "=" + result);
                    break;
                } else if (operation.equals("-")) {
                    int result = number1 - number2;
                    System.out.println(number1 + operation + number2 + "=" + result);
                    break;
                } else if (operation.equals("x") || operation.equals("*")) {
                    int result = number1 * number2;
                    System.out.println(number1 + operation + number2 + "=" + result);
                    break;
                } else if (operation.equals("%") || operation.equals("/")) {
                    if (number2 != 0) {
                        int result = number1 / number2;
                        System.out.println(number1 + operation + number2 + "=" + result);
                        break;
                    } else {
                        System.out.println("0으로 나눌 수 없습니다.");
                    }
                } else {
                    System.out.println("잘못 누르셨습니다.");
                }
            }

            System.out.print("더 계산하시겠습니까? (exit입력 시 종료)");
            String answer = scanner.next();
            if (answer.equals("exit")) {
                break;
            }
        }
    }
}

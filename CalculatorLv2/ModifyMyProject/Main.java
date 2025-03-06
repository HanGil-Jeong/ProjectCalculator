package CalculatorLv2.ModifyMyProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Calculator 인스턴스 생성
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        String exit = "";

        while (!exit.equals("exit")) {
            System.out.print("첫 번째 숫자를 입럭해주세요: ");
            int num1 = scanner.nextInt();

            System.out.print("사칙연산 기호를 입력해주세요: ");
            char operation = scanner.next().charAt(0);

            System.out.print("두 번째 숫자를 입력해주세요: ");
            int num2 = scanner.nextInt();

            Integer result = calculator.calculate(num1, num2, operation);


            if(result != null){
                System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
                calculator.setResultList(result);
            }

            System.out.println("ResultList = " + calculator.getResults());

            System.out.print("더 계산하시겠습니까?(exit 입력 시 종료)");
            exit = scanner.next();

        }


    }
}


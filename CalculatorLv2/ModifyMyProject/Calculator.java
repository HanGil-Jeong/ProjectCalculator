package CalculatorLv2.ModifyMyProject;

import java.util.ArrayList;

public class Calculator {

    // 결과 저장 - 캡슐화 컬렉션 타입
    private ArrayList<Integer> resultList = new ArrayList<>();

    public Integer calculate(int num1, int num2, char operation) {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                try {
                    return num1 / num2;
                } catch (ArithmeticException e) {
                    System.out.println("0으로 나눌 수 없습니다");
                }
        }
        return null;
    }

    // 게터
    public ArrayList<Integer> getResults() {
        return this.resultList;
    }

    // 세터
    public void setResultList(Integer result) {
        this.resultList.add(result);
    }

    public void removeList() {
        resultList.remove(0);
    }


}

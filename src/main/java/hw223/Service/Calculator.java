package hw223.Service;

import hw223.Entity.CalculatorEntity;

public class Calculator {
    public static CalculatorEntity result(CalculatorEntity calculatorEntity) {

        double numb1, numb2;
        double res = -1;
        String err = "Ошибок нет";
        String operator = calculatorEntity.getOperator();

        numb1 = Integer.parseInt(calculatorEntity.getNumber1());
        numb2 = Integer.parseInt(calculatorEntity.getNumber2());

        switch (operator) {
            case "plus":
                res = numb1 + numb2;
                break;
            case "minus":
                res = numb1 - numb2;
                break;
            case "multiplication":
                res = numb1 * numb2;
                break;
            case "division": {
                if (numb2 == 0) err = "На ноль не делим";
                else {
                    res = numb1 / numb2;
                }
            }
            break;
            default:
                err = "Что-то пошло не так";
        }
        calculatorEntity.setRes(res);
        calculatorEntity.setErr(err);
        return calculatorEntity;
    }
}
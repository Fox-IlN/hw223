package hw223.Service;

public class Calculator {

    private String value;
    private double number1;
    private double number2;
    private String operator;
    private double res;
    private String err;

    public void result(String number1, String number2, String operator){

        double numb1, numb2;
        double res = -1;
        String err = "Ошибок нет";

        numb1 = Integer.parseInt(number1);
        numb2 = Integer.parseInt(number2);

        switch (operator){
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
            default: err = "Что-то пошло не так";
        }
        this.number1 = numb1;
        this.number2 = numb2;
        this.operator = operator;
        this.res = res;
        this.err = err;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

}

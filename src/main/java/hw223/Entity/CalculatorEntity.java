package hw223.Entity;

public class CalculatorEntity {

    private String number1;
    private String number2;
    private String operator;
    private double res;
    private String err;

    CalculatorEntity (){};

    public CalculatorEntity(String number1, String number2, String operator){
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public String getNumber1() {
        return number1 = number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getNumber2() {
        return number2 = number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getOperator() {
        return operator = operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }
}

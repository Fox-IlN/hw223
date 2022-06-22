package hw223.Service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

@RequestMapping("/calc")
public Calculator getRes(String number1, String number2, String operator){

    Calculator calculator = new Calculator();
    calculator.result(number1,number2,operator);

    return calculator;
    };
}
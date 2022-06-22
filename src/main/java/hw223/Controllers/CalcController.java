package hw223.Controllers;

import hw223.Entity.CalculatorEntity;
import hw223.Service.Calculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
@GetMapping("/calc")
public CalculatorEntity getRes(String number1, String number2, String operator){
    return Calculator.result(new CalculatorEntity(number1, number2, operator));
    };
}
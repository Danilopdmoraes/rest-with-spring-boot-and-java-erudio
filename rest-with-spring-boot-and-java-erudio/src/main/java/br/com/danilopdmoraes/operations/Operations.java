package br.com.danilopdmoraes.operations;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
public class Operations {


    public Double sum(Double numberOne, Double numberTwo) {
        return numberOne + numberTwo;
    }

    public Double subtraction (Double numberOne, Double numberTwo) {
        return numberOne - numberTwo;
    }

    public Double multiplication (Double numberOne, Double numberTwo) {
        return numberOne * numberTwo;
    }

    public Double division (Double numberOne, Double numberTwo) {
        return numberOne / numberTwo;
    }

    public Double mean (Double numberOne, Double numberTwo) {
        return (numberOne + numberTwo) /2 ;
    }

    public Double squareRoot (Double number) {
        return Math.sqrt(number);
    }


}

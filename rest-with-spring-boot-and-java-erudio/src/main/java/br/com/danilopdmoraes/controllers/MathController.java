package br.com.danilopdmoraes.controllers;

import br.com.danilopdmoraes.operations.Operations;
import br.com.danilopdmoraes.services.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    private Operations operations;

    @Autowired
    private MathService mathService;

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");
        return operations.sum(mathService.convertToDouble(numberOne), mathService.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/subtraction/
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");
        return operations.subtraction(mathService.convertToDouble(numberOne), mathService.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/multiplication/3/5
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");
        return operations.multiplication(mathService.convertToDouble(numberOne), mathService.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");
        return operations.division(mathService.convertToDouble(numberOne), mathService.convertToDouble(numberTwo));
    }


    // http://localhost:8080/math/mean/3/5
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo))
            throw new UnsupportedOperationException("Please set a numeric value!");
        return operations.mean(mathService.convertToDouble(numberOne), mathService.convertToDouble(numberTwo));
    }

    // http://localhost:8080/math/squareRoot/81
    @RequestMapping("squareroot/{number}")
    public Double squareRoot(
            @PathVariable("number") String number
    ) throws Exception {
        if (!mathService.isNumeric(number))
            throw new UnsupportedOperationException("Please set a numeric value!");
        return operations.squareRoot(mathService.convertToDouble(number));
    }


}

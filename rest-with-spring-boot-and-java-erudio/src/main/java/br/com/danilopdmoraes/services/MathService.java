package br.com.danilopdmoraes.services;

import org.springframework.stereotype.Service;

@Service
public class MathService {


    public boolean isNumeric(String strNumber) {

        if (strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", "."); // R$ 7,00 USD 7.00

        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }


    public Double convertToDouble(String strNumber) throws IllegalArgumentException {

        if (strNumber == null || strNumber.isEmpty())
            throw new UnsupportedOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", ".");

        return Double.parseDouble(number);
    }

}

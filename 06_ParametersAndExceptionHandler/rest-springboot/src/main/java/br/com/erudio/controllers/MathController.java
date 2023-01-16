package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.utils.MathOps;
import br.com.erudio.utils.NumberUtils;

@RestController
public class MathController {
    private MathOps mathOps = new MathOps();

    @RequestMapping(value = "/sum/{number1}/{number2}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "number1") String number1,
            @PathVariable(value = "number2") String number2) throws Exception {

        NumberUtils.validateNumber(number1);
        NumberUtils.validateNumber(number2);
        return mathOps.sum(NumberUtils.convertToDouble(number1), NumberUtils.convertToDouble(number2));
    }

    @RequestMapping(value = "/subtract/{number1}/{number2}", method = RequestMethod.GET)
    public Double subtract(@PathVariable(value = "number1") String number1,
            @PathVariable(value = "number2") String number2) throws Exception {

        NumberUtils.validateNumber(number1);
        NumberUtils.validateNumber(number2);
        return mathOps.subtract(NumberUtils.convertToDouble(number1), NumberUtils.convertToDouble(number2));
    }

    @RequestMapping(value = "/multiply/{number1}/{number2}", method = RequestMethod.GET)
    public Double multiply(@PathVariable(value = "number1") String number1,
            @PathVariable(value = "number2") String number2) throws Exception {

        NumberUtils.validateNumber(number1);
        NumberUtils.validateNumber(number2);
        return mathOps.multiply(NumberUtils.convertToDouble(number1), NumberUtils.convertToDouble(number2));
    }

    @RequestMapping(value = "/divide/{number1}/{number2}", method = RequestMethod.GET)
    public Double divide(@PathVariable(value = "number1") String number1,
            @PathVariable(value = "number2") String number2) throws Exception {

        NumberUtils.validateNumber(number1);
        NumberUtils.validateNumber(number2);
        return mathOps.divide(NumberUtils.convertToDouble(number1), NumberUtils.convertToDouble(number2));
    }

    @RequestMapping(value = "/average/{number1}/{number2}", method = RequestMethod.GET)
    public Double average(@PathVariable(value = "number1") String number1,
            @PathVariable(value = "number2") String number2) throws Exception {

        NumberUtils.validateNumber(number1);
        NumberUtils.validateNumber(number2);
        return mathOps.average(NumberUtils.convertToDouble(number1), NumberUtils.convertToDouble(number2));
    }

    @RequestMapping(value = "/squareRoot/{number}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable(value = "number") String number) throws Exception {

        NumberUtils.validateNumber(number);
        return mathOps.squareRoot(NumberUtils.convertToDouble(number));
    }

}

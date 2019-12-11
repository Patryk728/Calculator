package workshop.sb.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/sum/{n1}/{n2}")
    public double sum(@PathVariable double n1, @PathVariable double n2)
    {
        return n1+n2;
    }
    @GetMapping("/substract/{n1}/{n2}")
    public String substract(@PathVariable double n1, @PathVariable double n2)
    {
        return String.valueOf(n1-n2);
    }
    @GetMapping("/mul")
    public String multiply(@RequestParam double n1, @RequestParam double n2)
    {
        return String.valueOf(n1*n2);
    }
    @GetMapping("/div")
    public String divide(@RequestParam double n1, @RequestParam double n2)
    {
        return String.valueOf(n1/n2);
    }



}

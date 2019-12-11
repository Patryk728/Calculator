package workshop.sb.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
    }
}


// TODO 3 utwórz pakiet controller
// TODO 4 utwórz klasę CalculatorController
// TODO 5 oznacz utworzoną klasę adnotacją @RestController
// TODO 6 utwórz 4 metody (po utworzeniu kolejnej metody, uzupełniaj dla niej test):
/*

    każda z metod
                    dla jednego działania arytmetycznego

                    obsługuje GET

                    przyjmuje 2 wartości double, zwracaja wynik double

    Metoda dla dodawania i odejmowania

                    dla pobrania wartości argumentów z requestu, użyj @PathVariable

                    przykładowa deklaracja w metodzie "/add/{n1}/{n2}", przykładowy request "/add/1/2"

    Metoda dla mnożenia i dzielenia

                    dla pobrania wartości argumentów z requestu, użyj @RequestParam
                    przykładowa deklaracja w metodzie "/add", przykładowy request "/add?n1=10&n2=20"
*/
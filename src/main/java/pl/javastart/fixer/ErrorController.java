package pl.javastart.fixer;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorController {

    @ExceptionHandler(CurrencyDataNotAvailableException.class)
    public String handlerException(){
        return "no-data";
    }
}

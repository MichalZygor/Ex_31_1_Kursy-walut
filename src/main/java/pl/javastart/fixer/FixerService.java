package pl.javastart.fixer;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class FixerService {

    public List<CurrencyValue> getCurrencyValues(){
        List<CurrencyValue> currencyValues = new ArrayList<>();
        currencyValues.add(new CurrencyValue("EUR", BigDecimal.valueOf(4.444)));
        currencyValues.add(new CurrencyValue("CZK", BigDecimal.valueOf(16.44)));

        return currencyValues;
    }
}

package pl.javastart.fixer;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FixerService {

    private static final String URL = "http://data.fixer.io/api/latest?access_key=f75e76119e77feaa1aa8ccee9324958c";

    public List<CurrencyValue> getCurrencyValues(){


        RestTemplate restTemplate = new RestTemplate();
        //String response = restTemplate.getForObject(URL, String.class);
        FixerResponseDto response = restTemplate.getForObject(URL, FixerResponseDto.class);

        BigDecimal plnValue = response.getRates().get("PLN");

        return response.getRates()
                .entrySet()
                .stream()
                .map(entry -> new CurrencyValue(entry.getKey(), plnValue.divide(entry.getValue(), 10, RoundingMode.HALF_UP)))
                .collect(Collectors.toList());


//        System.out.println();
//
//
//        List<CurrencyValue> currencyValues = new ArrayList<>();
//        currencyValues.add(new CurrencyValue("EUR", BigDecimal.valueOf(4.444)));
//        currencyValues.add(new CurrencyValue("CZK", BigDecimal.valueOf(16.44)));
//
//        return currencyValues;
    }
}

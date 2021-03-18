package pl.javastart.fixer;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class CurrencyValue {
    private String name;
    private BigDecimal value;
}

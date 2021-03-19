package pl.javastart.fixer;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

@Data
public class FixerResponseDto {

    private boolean success;
    private long timestamp;
    private LocalDate date;
    private Map<String, BigDecimal> rates;

}

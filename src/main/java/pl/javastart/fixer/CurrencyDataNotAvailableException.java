package pl.javastart.fixer;

public class CurrencyDataNotAvailableException extends RuntimeException{
    public CurrencyDataNotAvailableException() {
        super("Nie udało się pobrać kursów walut");
    }
}

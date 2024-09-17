public class CurrencyConverter {
    protected String fromCurrency;
    protected String toCurrency;

    public CurrencyConverter(String fromCurrency, String toCurrency) {
        this.fromCurrency = fromCurrency;
        this.toCurrency = toCurrency;
    }

    public void convert(double amount) {
        try {
            double rate = ExchangeRateService.getRate(fromCurrency, toCurrency);
            double convertedAmount = amount * rate;
            printConvertedValue(amount, fromCurrency, convertedAmount, toCurrency);
        } catch (Exception e) {
            System.out.println("Erro ao converter moeda: " + e.getMessage());
        }
    }

    private void printConvertedValue(double originalAmount, String fromCurrency, double convertedAmount, String toCurrency) {
        String message = String.format("Valor digitado: %.2f [%s] correspondente ao valor de %.2f [%s]", originalAmount, fromCurrency, convertedAmount, toCurrency);
        int length = message.length();
        String border = "*".repeat(length + 4);

        System.out.println(border);
        System.out.println("* " + message + " *");
        System.out.println(border);
    }
}

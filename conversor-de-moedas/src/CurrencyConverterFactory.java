public class CurrencyConverterFactory {
    public static CurrencyConverter getConverter(int option) {
        switch (option) {
            case 1:
                return new BRLtoUSDConverter();
            case 2:
                return new USDtoBRLConverter();
            case 3:
                return new EURtoBRLConverter();
            case 4:
                return new BRLtoEURConverter();
            case 5:
                return new GBPtoBRLConverter();
            case 6:
                return new BRLtoGBPConverter();
            default:
                throw new IllegalArgumentException("Opção inválida");
        }
    }
}

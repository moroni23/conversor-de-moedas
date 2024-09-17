import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class ExchangeRateService {
    private static final String API_KEY = "6aa22d9c8f7ce52bcfceec7b";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static double getRate(String fromCurrency, String toCurrency) throws Exception {
        String urlString = API_URL + fromCurrency;
        URL url = new URL(urlString);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();

        int responseCode = conn.getResponseCode();
        if (responseCode != 200) {
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        } else {
            InputStreamReader reader = new InputStreamReader(url.openStream());
            Gson gson = new Gson();
            ExchangeRateResponse response = gson.fromJson(reader, ExchangeRateResponse.class);
            reader.close();

            return response.conversion_rates.get(toCurrency);
        }
    }
}

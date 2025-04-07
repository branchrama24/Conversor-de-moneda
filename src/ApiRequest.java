import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiRequest {
    private static final String API_KEY = "46c3c1a6dfb65a839cfa8900"; // ← reemplazá con tu API key

    public double obtenerConversion(String from, String to, double cantidad) {
        try {
            String urlStr = String.format(
                    "https://v6.exchangerate-api.com/v6/%s/pair/%s/%s",
                    API_KEY, from, to
            );

            URL url = new URL(urlStr);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            Moneda moneda = new Gson().fromJson(reader, Moneda.class);

            return moneda.getConversion_rate() * cantidad; // multiplicás localmente
        } catch (Exception e) {
            System.out.println("❌ Error al obtener datos de la API: " + e.getMessage());
            return 0;
        }
    }
}

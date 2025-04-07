public class Conversor {
    ApiRequest api = new ApiRequest();

    public void convertir(int opcion, double monto) {
        String from = "";
        String to = "";

        switch (opcion) {
            case 1 -> { from = "USD"; to = "ARS"; }
            case 2 -> { from = "ARS"; to = "USD"; }
            case 3 -> { from = "USD"; to = "BRL"; }
            case 4 -> { from = "BRL"; to = "USD"; }
            case 5 -> { from = "EUR"; to = "USD"; }
            case 6 -> { from = "USD"; to = "EUR"; }
            default -> {
                System.out.println("Opción inválida.");
                return;
            }
        }

        double resultado = api.obtenerConversion(from, to, monto);
        System.out.printf("✔ %.2f %s equivalen a %.2f %s%n", monto, from, resultado, to);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conversor conversor = new Conversor();

        int opcion = 0;

        while (opcion != 9) {
            System.out.println("""
                    --------------------------------------
                    ¡Bienvenido/a al Conversor de Monedas!
                    Elige una opción:
                    1 - Dólar a Peso argentino
                    2 - Peso argentino a Dólar
                    3 - Dólar a Real brasileño
                    4 - Real brasileño a Dólar
                    5 - Euro a Dólar
                    6 - Dólar a Euro
                    9 - Salir
                    --------------------------------------
                    """);

            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            if (opcion == 9) break;

            System.out.print("Ingresa el monto a convertir: ");
            double monto = scanner.nextDouble();
            conversor.convertir(opcion, monto);
        }

        System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
        scanner.close();
    }
}

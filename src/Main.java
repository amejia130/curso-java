import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una opcion:");
        System.out.println("1. Conversor de Celsius a Fahrenheit");
        System.out.println("2. Conversor de Fahrenheit a Celsius");

        int opcion = scanner.nextInt();

        double resultado;

        if (opcion == 1) {
            System.out.print("Ingrese la temperatura en Celsius: ");
            double celsius = scanner.nextDouble();
            resultado = conversor.celsiusAFahrenheit(celsius);
            System.out.println(celsius + "°C equivalen a " + resultado + "°F");
        }else if (opcion == 2) {
            System.out.print("Ingrese la temperatura en Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            resultado = conversor.fahrenheitACelsius(fahrenheit);
            System.out.println(fahrenheit + "°F equivale a " + resultado + "°C");
        } else {
            System.out.println("Opción no válida");
        }
        scanner.close();
    }
}

class ConversorTemperatura {
    public double celsiusAFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }
    public double fahrenheitACelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
}
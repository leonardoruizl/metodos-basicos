import java.util.Scanner;

public class Basicos {
    private static final double INTERES_MENSUAL = 0.018;
    private static final double RECARGO_HORA_EXTRA = 1.5;

    private final Scanner scanner = new Scanner(System.in);

    public double calcularAreaTriangulo() {
        System.out.print("Ingresa la base: ");
        double base = scanner.nextDouble();

        System.out.println();

        System.out.print("Ingresa la altura: ");
        double altura = scanner.nextDouble();

        System.out.println();

        return base * altura / 2;
    }

    public double calcularAreaCirculo() {
        System.out.print("Ingresa el radio del circulo: ");
        double radio = scanner.nextDouble();

        System.out.println();

        if (radio <= 0) {
            System.out.println("El radio debe ser mayor a cero.");
        }

        return Math.PI * radio * radio;
    }

    public double calcularPromedioAlumno() {
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa la calificación de la materia " + i + ": ");
            suma += scanner.nextDouble();
        }

        System.out.println();

        return suma / 5;
    }

    public double convertirTemperaturaAFahrenheit() {
        System.out.print("Ingresa la temperatura en Celsius: ");
        double temperaturaC = scanner.nextDouble();

        System.out.println();

        return temperaturaC * 1.8 + 32;
    }

    public double calcularInteresPrestamo() {
        System.out.print("Ingresa el monto del préstamo: ");
        double monto = scanner.nextDouble();

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
        }

        return monto + (monto * INTERES_MENSUAL * 12);
    }

    public double calcularPagaNetaTrabajador() {
        double pagoBruto, impuestos;

        System.out.print("Ingresa las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.println();

        System.out.print("Ingresa la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        System.out.println();

        System.out.print("Ingresa la tasa de impuestos (en %): ");
        double tasaImpuestos = scanner.nextDouble() / 100;

        System.out.println();

        pagoBruto = horasTrabajadas * tarifaPorHora;

        impuestos = pagoBruto * tasaImpuestos;

        return pagoBruto - impuestos;
    }

    public double calcularSalarioTrabajadorHorasExtras() {
        System.out.print("Ingresa las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();

        System.out.println();

        System.out.print("Ingresa la tarifa por hora: ");
        double tarifaHoraria = scanner.nextDouble();

        System.out.println();

        if (horasTrabajadas < 0 || tarifaHoraria < 0) {
            System.out.println("Los valores no pueden ser negativos.");
        }

        if (horasTrabajadas <= 40) {
            return tarifaHoraria * horasTrabajadas;
        } else {
            double horasNormales = 40;

            double horasExtras = horasTrabajadas - 40;

            double pago = horasNormales * tarifaHoraria;

            double pagoExtra = horasExtras * tarifaHoraria * RECARGO_HORA_EXTRA;

            return pago + pagoExtra;
        }
    }

    public String calcularTiempo() {
        System.out.print("Ingresa los minutos: ");
        int minutosTotales = scanner.nextInt();

        System.out.println();

        if (minutosTotales < 0) {
            return "No se pueden ingresar minutos negativos.";
        }

        int dias = minutosTotales / 1440;
        int minutosRestantes = minutosTotales % 1440;
        int horas = minutosRestantes / 60;
        int minutos = minutosRestantes % 60;

        return "Días: " + dias + ", Horas: " + horas + ", Minutos: " + minutos;
    }

    public String convertirMetros() {
        System.out.print("Ingresa los metros: ");
        double metros = scanner.nextDouble();

        System.out.println();

        if (metros < 0) {
            return "Por favor, ingresa un valor positivo.";
        }

        double centimetros = metros * 100;
        double kilometros = metros / 1000;
        double pies = metros * 3.28084;
        double pulgadas = metros * 39.3701;

        return "Centímetros: " + centimetros + ", Kilómetros: " + kilometros + ", Pies: " + pies + " , Pulgadas: " + pulgadas;
    }

    public String calcularConsumoYVelocidad() {
        System.out.print("Ingresa los km recorridos: ");
        double kmRecorridos = scanner.nextDouble();

        System.out.println();

        System.out.print("Ingresa el precio del litro de gasolina: ");
        double precioGasolina = scanner.nextDouble();

        System.out.println();

        System.out.print("Ingresa el dinero gastado en gasolina: ");
        double dineroGastado = scanner.nextDouble();

        System.out.println();

        System.out.println("Ingresa el tiempo del viaje en horas: ");
        int horas = scanner.nextInt();

        System.out.println("Ingresa el tiempo del viaje en minutos: ");
        int minutos = scanner.nextInt();

        System.out.println();

        double litrosConsumidos = dineroGastado / precioGasolina;
        double litrosPorKm = litrosConsumidos / kmRecorridos;
        double eurosPorKm = dineroGastado / kmRecorridos;

        double litros100Km = litrosConsumidos / kmRecorridos * 100;
        double euros100Km = dineroGastado / kmRecorridos * 100;

        double horasDecimales = horas + (minutos / 60.0);
        double velocidadMediaKmh = kmRecorridos / horasDecimales;
        double velocidadMediaMs = (kmRecorridos * 1000) / (horasDecimales * 3600);

        return "Litros por km: " + litrosPorKm +
                ", Euros por km: " + eurosPorKm +
                ", Litros/100km: " + litros100Km +
                ", Euros/100km: " + euros100Km +
                ", Velocidad media km/h: " + velocidadMediaKmh +
                ", Velocidad media m/s: " + velocidadMediaMs;
    }
}

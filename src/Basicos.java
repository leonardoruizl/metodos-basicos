import java.util.Scanner;

public class Basicos {
    private static final double INTERES_MENSUAL = 0.018;
    private static final double RECARGO_HORA_EXTRA = 1.5;

    private final Scanner scanner = new Scanner(System.in);

    public void calcularAreaTriangulo() {
        System.out.print("Ingresa la base: ");
        double base = scanner.nextDouble();

        if (base <= 0) {
            System.out.println("La base debe ser mayor a 0.");
            return;
        }

        System.out.println();

        System.out.print("Ingresa la altura: ");
        double altura = scanner.nextDouble();

        if (altura <= 0) {
            System.out.println("La altura debe ser mayor a 0.");
            return;
        }

        System.out.println();

        double area = base * altura / 2;

        System.out.println("El area del triangulo es: " + area);
    }

    public void calcularAreaCirculo() {
        System.out.print("Ingresa el radio del circulo: ");
        double radio = scanner.nextDouble();

        System.out.println();

        if (radio <= 0) {
            System.out.println("El radio debe ser mayor a cero.");
            return;
        }

        double area = Math.PI * radio * radio;

        System.out.println("El area del circulo es: " + area);
    }

    public void calcularPromedioAlumno() {
        double suma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingresa la calificación de la materia " + i + ": ");
            suma += scanner.nextDouble();
        }

        System.out.println();

        double promedio = suma / 5;

        System.out.println("El promedio de las calificaciones es: " + promedio);
    }

    public void convertirTemperaturaAFahrenheit() {
        System.out.print("Ingresa la temperatura en Celsius: ");
        double temperaturaC = scanner.nextDouble();

        System.out.println();

        double temperaturaF = temperaturaC * 1.8 + 32;

        System.out.println("La temperatura en Fahrenheit es: " + temperaturaF);
    }

    public void calcularInteresPrestamo() {
        System.out.print("Ingresa el monto del préstamo: ");
        double monto = scanner.nextDouble();

        if (monto <= 0) {
            System.out.println("El monto debe ser mayor que cero.");
            return;
        }

        double montoFinal = monto + (monto * INTERES_MENSUAL * 12);

        System.out.println();

        System.out.println("El monto final a pagar en un año es de: " + montoFinal);
    }

    public void calcularPagaNetaTrabajador() {
        double pagoBruto, impuestos, pagoNeto;

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

        pagoNeto = pagoBruto - impuestos;

        System.out.println("La paga neta del trabajador es: " + pagoNeto);
    }

    public void calcularSalarioTrabajadorHorasExtras() {
        double salario;

        System.out.print("Ingresa las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();

        System.out.println();

        System.out.print("Ingresa la tarifa por hora: ");
        double tarifaHoraria = scanner.nextDouble();

        System.out.println();

        if (horasTrabajadas < 0 || tarifaHoraria < 0) {
            System.out.println("Los valores no pueden ser negativos.");
            return;
        }

        if (horasTrabajadas <= 40) {
            salario = tarifaHoraria * horasTrabajadas;

            System.out.println("El salario es de: " + salario);
        } else {
            double horasNormales = 40;

            double horasExtras = horasTrabajadas - 40;

            double pago = horasNormales * tarifaHoraria;

            double pagoExtra = horasExtras * tarifaHoraria * RECARGO_HORA_EXTRA;

            salario = pago + pagoExtra;

            System.out.println("El salario es de: " + salario);
        }
    }

    public void calcularTiempo() {
        System.out.print("Ingresa los minutos: ");
        int minutosTotales = scanner.nextInt();

        System.out.println();

        if (minutosTotales < 0) {
            System.out.println("No se pueden ingresar minutos negativos.");
            return;
        }

        int dias = minutosTotales / 1440;
        int minutosRestantes = minutosTotales % 1440;
        int horas = minutosRestantes / 60;
        int minutos = minutosRestantes % 60;

        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
    }

    public void convertirMetros() {
        System.out.print("Ingresa los metros: ");
        double metros = scanner.nextDouble();

        System.out.println();

        if (metros < 0) {
            System.out.println("Por favor, ingresa un valor positivo.");
            return;
        }

        double centimetros = metros * 100;
        double kilometros = metros / 1000;
        double pies = metros * 3.28084;
        double pulgadas = metros * 39.3701;

        System.out.println("Centimetros: " + centimetros);
        System.out.println("Kilómetros: " + kilometros);
        System.out.println("Pies: " + pies);
        System.out.println("Pulgadas: " + pulgadas);
    }

    public void calcularConsumoYVelocidad() {
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
        System.out.println("Litros por km: " + litrosPorKm);

        double eurosPorKm = dineroGastado / kmRecorridos;
        System.out.println("Euros por km: " + eurosPorKm);

        System.out.println();

        double litros100Km = litrosConsumidos / kmRecorridos * 100;
        System.out.println("Litros por 100km: " + litros100Km);

        double euros100Km = dineroGastado / kmRecorridos * 100;
        System.out.println("Euros por 100km: " + euros100Km);

        System.out.println();

        double horasDecimales = horas + (minutos / 60.0);

        double velocidadMediaKmh = kmRecorridos / horasDecimales;
        System.out.println("Velocidad media en km/h: " + velocidadMediaKmh);

        double velocidadMediaMs = (kmRecorridos * 1000) / (horasDecimales * 3600);
        System.out.println("Velocidad media en m/s: " + velocidadMediaMs);
    }
}

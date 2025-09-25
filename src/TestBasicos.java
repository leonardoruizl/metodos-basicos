import java.util.Scanner;

public class TestBasicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Basicos basc = new Basicos();

        int opcion;

        do {
            System.out.println("\n==========================");
            System.out.println("      MÉTODOS BÁSICOS     ");
            System.out.println("==========================");
            System.out.println("1) Calcular el área de un triángulo.");
            System.out.println("2) Calcular el área de un círculo.");
            System.out.println("3) Calcular el promedio de un alumno que cursó 5 materias.");
            System.out.println("4) Leer una determinada temperatura en grados centígrados y convertirla a Fahrenheit.");
            System.out.println("5) Calcular el monto final de un préstamo por un año.");
            System.out.println("6) Calcular la paga neta de un trabajador.");
            System.out.println("7) Calcular el salario del trabajador con horas extras.");
            System.out.println("8) Dado un tiempo en minutos, calcular días, horas y minutos.");
            System.out.println("9) Convertir metros a cm, km, ft, in.");
            System.out.println("10) Calcular km recorridos.");
            System.out.println("11) Salir");

            System.out.println();

            System.out.print("Ingresa la opcion: ");
            opcion = scanner.nextInt();

            System.out.println();

            switch (opcion) {
                case 1:
                    double areaTriangulo = basc.calcularAreaTriangulo();
                    System.out.println("El área del triángulo es: " + areaTriangulo);
                    break;
                case 2:
                    double areaCirculo = basc.calcularAreaCirculo();
                    System.out.println("El área del triángulo es: " + areaCirculo);
                    break;
                case 3:
                    double promedio = basc.calcularPromedioAlumno();
                    System.out.println("El promedio del alumno es de: " + promedio);
                    break;
                case 4:
                    double temperatura = basc.convertirTemperaturaAFahrenheit();
                    System.out.println("La temperatura a Fahrenheit es de: " + temperatura);
                    break;
                case 5:
                    double interes = basc.calcularInteresPrestamo();
                    System.out.println("El interés anual del préstamo es de: " + interes);
                    break;
                case 6:
                    double paga = basc.calcularPagaNetaTrabajador();
                    System.out.println("La paga neta del trabajador es de: " + paga);
                    break;
                case 7 :
                    double salario = basc.calcularSalarioTrabajadorHorasExtras();
                    System.out.println("El salario del trabajador es de: " + salario);
                    break;
                case 8 :
                    String tiempo = basc.calcularTiempo();
                    System.out.println(tiempo);
                    break;
                case 9 :
                    String conversion = basc.convertirMetros();
                    System.out.println(conversion);
                    break;
                case 10 :
                    String consumo = basc.calcularConsumoYVelocidad();
                    System.out.println(consumo);
                    break;
                case 11 :
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 11);

        scanner.close();
    }
}

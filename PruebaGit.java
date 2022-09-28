import metodos.diasNacimiento;
import metodos.diasMesesAnyosNacimiento;
import java.time.LocalDate;
import java.util.Scanner;

public class PruebaGit {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Dime tu Nombre y Fecha de Nacimiento:");
        System.out.println("- Nombre: ");

        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        System.out.println("- Anyo: ");
        int anyo = scanner.nextInt();

        while (anyo < 1900 || anyo > 2023) {
            System.out.println("Anyo no valido, introduzcalo de nuevo: ");
            System.out.println("- Anyo: ");
            anyo = scanner.nextInt();
        }
        System.out.println("- Mes (1-12): ");
        int mes = scanner.nextInt();
        while (mes < 1 || mes > 12) {
            System.out.println("Mes incorrecto, introduzcalo de nuevo: ");
            System.out.println("- Mes (1-12): ");
            mes = scanner.nextInt();
        }
        System.out.println("- Dia: ");
        int dia = scanner.nextInt();
        while (dia < 1 || dia > 31) {
            System.out.println("Dia incorrecto, introduzcalo de nuevo: ");
            System.out.println("- Dia: ");
            dia = scanner.nextInt();
        }
        System.out.println("Hola " + nombre + ", naciste el " + dia + "/" + mes + "/" + anyo + ".");
        scanner.close();
        try {
            LocalDate fecha= LocalDate.of(anyo, mes, dia);
            diasNacimiento numDias = new diasNacimiento();
            numDias.calcular(fecha);
            diasMesesAnyosNacimiento numDiasMesesAnyos = new diasMesesAnyosNacimiento();
            numDiasMesesAnyos.calcular(fecha);
        }
        catch (Exception e) {
            System.out.println("Error al convertir la fecha: "+e.getMessage());
        }
    }
}

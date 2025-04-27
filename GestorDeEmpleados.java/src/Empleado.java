public class Empleado {
    private static int contadorEmpleados = 0;
    private int legajo;
    private String nombre;
    private String apellido;
    private String puesto;
    private double salario;
    private String fechaIngreso;

    public Empleado(String nombre, String apellido, String puesto, double salario, String fechaIngreso) {
        this.legajo = ++contadorEmpleados;
        this.nombre = nombre;
        this.apellido = apellido;
        this.puesto = puesto;
        this.salario = salario;
        this.fechaIngreso = fechaIngreso;
    }

    public void aumentarSalarioPorcentaje(double porcentaje, String motivo) {
        if (porcentaje > 0) {
            salario += salario * (porcentaje / 100);
            System.out.println("Aumento del " + porcentaje + "% aplicado a " + nombre + " " + apellido + ". Motivo: " + motivo);
        } else {
            System.out.println("El porcentaje debe ser mayor a 0.");
        }
    }

    public void aumentarSalarioMonto(double monto, String motivo) {
        if (monto > 0) {
            salario += monto;
            System.out.println("Aumento de $" + monto + " aplicado a " + nombre + " " + apellido + ". Motivo: " + motivo);
        } else {
            System.out.println("El monto debe ser mayor a 0.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: $" + salario);
        System.out.println("Fecha de Ingreso: " + fechaIngreso);
    }

    public static int obtenerCantidadEmpleados() {
        return contadorEmpleados;
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", "Pérez", "Analista de Sistemas", 50000, "01/03/2022");
        Empleado empleado2 = new Empleado("María", "García", "Gerente de Ventas", 55000, "15/07/2021");

        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();

        empleado1.aumentarSalarioPorcentaje(10, "Buen desempeño");
        empleado1.mostrarInformacion();

        empleado2.aumentarSalarioMonto(5000, "Ajuste salarial");
        empleado2.mostrarInformacion();

        System.out.println("Cantidad total de empleados: " + Empleado.obtenerCantidadEmpleados());
    }
}
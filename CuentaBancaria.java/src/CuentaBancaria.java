public class CuentaBancaria {
    private String numeroCuenta;
    private String nombreTiular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String numeroCuenta, String nombreTitular, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else if (cantidad > saldo) {
            System.out.println("Error: Saldo insuficiente.");
        } else {
            System.out.println("La cantidad a retirar debe ser positiva.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria miCuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);
        miCuenta.depositar(500);
        miCuenta.retirar(200);
        System.out.println("Saldo actual: " + miCuenta.consultarSaldo());
        miCuenta.retirar(2000);
    }
}
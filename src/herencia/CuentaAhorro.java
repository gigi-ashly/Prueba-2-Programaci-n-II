
package herencia;

import java.util.Calendar;

public class CuentaAhorro extends CuentaBancaria {

    private Calendar ultimaModif;

    public CuentaAhorro(int numero, String cliente, String moneda) {
        super(numero, cliente, moneda, TipoCuenta.DEAHORRO);
        ultimaModif = Calendar.getInstance();
    }

    public boolean status() {
        Calendar fechaActual = Calendar.getInstance();
        fechaActual.add(Calendar.MONTH, -6);

        return !ultimaModif.before(fechaActual);
    }

    @Override
    public void depositar(double monto) {
        if (!status()) {
            throw new IllegalStateException("Cuenta de ahorro inactiva");
        }

        super.depositar(monto);
        ultimaModif = Calendar.getInstance();
    }

    @Override
    public boolean retirar(double monto) {
        if (!status()) {
            throw new IllegalStateException("Cuenta de ahorro inactiva");
        }

        boolean resultado = super.retirar(monto);

        if (resultado) {
            ultimaModif = Calendar.getInstance();
        }

        return resultado;
    }

    @Override
    public void quienSoy() {
        System.out.println("CuentaAhorro");
    }

    @Override
    public String toString() {
        return super.toString() + " | Activa: " + status();
    }
}

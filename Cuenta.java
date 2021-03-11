package Ejercicio5_11;

public class Cuenta {
    private Cliente cliente;
    private String CodigoCuenta;
    private int saldo;

    public Cliente getCliente() { return cliente; }

    public void setCliente(Cliente cliente) { this.cliente = cliente; }

    public String getCodigoCuenta() { return CodigoCuenta; }

    public void setCodigoCuenta(String CodigoCuenta) { this.CodigoCuenta = CodigoCuenta; }

    public int getSaldo() { return saldo; }

    public void setSaldo(int saldo) { this.saldo = saldo; }


    @Override
    public String toString() {
        return "Cuenta{" +
                "cliente=" + cliente +
                ", codigo cuenta=" + CodigoCuenta +
                ", saldo=" + saldo +
                '}';
    }
}

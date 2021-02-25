package aula;

public class Conta {
	private String numero;
	private double saldo;
	
	public void creditar (double valor) {
		saldo = saldo + valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}

package aula;

public class Conta {
	private String numero;
	private double saldo;
	
	public Conta() {
		numero = "";
		saldo = 0.0;
	}
	
	public Conta (String numeroInicial, double saldoInicial) {
		numero = numeroInicial;
		saldo = saldoInicial;
	}
	
	public void creditar (double valor) {
		saldo = saldo + valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}

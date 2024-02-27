package br.com.fiap;

public class Calculadora {
	
	private double resultado;


	public Calculadora() {
	}
	
	public Calculadora(double resultado) {
		this.resultado = resultado;
	}
	
	
	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	
	
	public double somar(double valor1, double valor2) {
		return valor1 + valor2;
	}
	
	public double subtrair(double valor1, double valor2) {
		return valor1 - valor2;
	}
	
}

package br.com.fiap;

public class Elevador {

	private int id;
	private double cargaMaxima = 200;
	private double cargaAtual;
	private boolean sinalAlerta;
	
	public Elevador() {

	}
	public Elevador(int id, double cargaMaxima, double cargaAtual, boolean sinalAlerta) {
		this.id = id;
		this.cargaMaxima = cargaMaxima;
		this.cargaAtual = cargaAtual;
		this.sinalAlerta = sinalAlerta;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	public double getCargaAtual() {
		return cargaAtual;
	}
	public void setCargaAtual(double cargaAtual) {
		this.cargaAtual = cargaAtual;
	}
	public boolean isSinalAlerta() {
		return sinalAlerta;
	}
	public void setSinalAlerta(boolean sinalAlerta) {
		this.sinalAlerta = sinalAlerta;
	}
	
	public double entrarNoElevador(double peso) {
		Calculadora calc = new Calculadora();
		return calc.somar(cargaAtual, peso);

	}
	
	public double sairDoElevador(double peso) {
		Calculadora calc = new Calculadora();
		double sub = calc.subtrair(cargaAtual, peso);
		cargaAtual = cargaAtual - sub;
		return cargaAtual;
	}
	
	public boolean avaliarPeso(double peso) {
		cargaAtual = peso;
		if (cargaAtual > cargaMaxima) {
			return false;
		} else {
			return true;
		} 
	}
}

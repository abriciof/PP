package br.edu.icomp.ufam.lab_heranca;
public class Circulo extends FormaGeometrica{
	public double raio;
	
	public Circulo() { this(0, 0, 0.0); }

	public Circulo(int posX, int posY, double raio) {
		super(posX, posY);
		this.raio = raio;
	}
	
	public double getArea() {
		return (Math.PI * Math.pow(raio, 2));
	}
	
	public double getPerimetro() {
		return (2*Math.PI*raio);
		
	}
	
	public String toString() {
		return String.format("Círculo na " + getPosString() + 
							" com raio de " + raio + 
							"cm (área=" + getArea() +
							"cm2, perímetro=" + getPerimetro() + "cm)");
	}

}

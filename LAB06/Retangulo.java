package br.edu.icomp.ufam.lab_heranca;
public class Retangulo extends FormaGeometrica {
	public double largura, altura;

	public Retangulo() { this(0, 0, 0.0, 0.0); }
	
	public Retangulo(int posX, int posY, double largura, double altura) {
		super(posX,posY);
		this.largura = largura;
		this.altura = altura;
	}
	public double getArea() {
		return (largura*altura);
	}
	
	public double getPerimetro() {
		return (2*(largura+altura));
	}
	
	public String toString() {
        return ("Retângulo na " + getPosString() +
                " com largura de " + largura +
                "cm e altura de " + altura +
                "cm (área=" + getArea() +
                "cm2, perímetro=" + getPerimetro() + "cm)");
    }

}

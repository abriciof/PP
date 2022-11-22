package br.edu.icomp.ufam.lab_heranca;

import java.util.ArrayList;

public class FormasMain {
	public static void main(String[] args) {
		ArrayList<FormaGeometrica> formas = new ArrayList<>();
		int n;
		
		Circulo c1 = new Circulo(32, 87, 6);
		formas.add(c1);
		Retangulo r1 = new Retangulo(12, 65, 2, 7);
		Quadrado q1 = new Quadrado (45, 39, 6);
		
		formas.add(r1);
		formas.add(q1);
		
		for (FormaGeometrica forma : formas) {
            System.out.println(forma);
        }
	}
}

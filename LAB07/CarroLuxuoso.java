package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.Random;

public class CarroLuxuoso extends Carro implements Localizavel{
    public CarroLuxuoso(String placa) {
        super(placa);
    }

    public Posicao getPosicao() {
        Random r = new Random();
        double val[] = {-3.160000, -2.960000, -60.120000, -59.820000, 15.0, 100.0};

        double latitude = val[0] + (val[1] - val[0]) * r.nextDouble();
        double longitude = val[2] + (val[3] - val[2]) * r.nextDouble();
        double altitude = val[4] + (val[5] - val[4]) * r.nextDouble();

        return new Posicao(latitude, longitude, altitude);
    }

    public double getErroLocalizacao() {
        return 15.0;
    }
}

package br.edu.ufam.icomp.lab_encapsulamento;

import java.util.*;

public class Celular implements Localizavel{
    private int codPais, codArea, numero;

    public Celular(int codPais, int codArea, int numero) {
        setCodPais(codPais);
        setCodArea(codArea);
        setNumero(numero);
    }

    public final void setCodPais(int codPais) {
        if (codPais >= 1 && codPais <= 1999) {
            this.codPais = codPais;
        } else {
            this.codPais = -1;
        }
    }

    public int getCodPais() {
        return codPais;
    }

    public final void setCodArea(int codArea) {
        if (codArea >= 10 && codArea <= 99) {
            this.codArea = codArea;
        } else {
            this.codArea = -1;
        }
    }

    public int getCodArea() {
        return codArea;
    }

    public final void setNumero(int numero) {
        if (numero >= 10000000 && numero <= 999999999){
            this.numero = numero;
        } else {
            this.numero = -1;
        }
    }

    public int getNumero() {
        return numero;
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
        return 50.0;
    }
}

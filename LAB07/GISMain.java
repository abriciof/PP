package br.edu.ufam.icomp.lab_encapsulamento;

public class GISMain {
    public static void main(String[] args) {
        Localizavel[] vetorLocalizaveis = new Localizavel[10];

        Celular cel = new Celular(55, 92, 993686225);
        vetorLocalizaveis[0] = cel;

        CarroLuxuoso cl = new CarroLuxuoso("FBC10032001");
        vetorLocalizaveis[1] = cl;

        for(int i=0; i<2; i++) System.out.println(vetorLocalizaveis[i].getPosicao());

    }
}

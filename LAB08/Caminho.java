package br.edu.ufam.icomp.lab_excecoes;

import java.util.Arrays;

public class Caminho {
    private int tamanho;
    private Coordenada[] caminho;

    public Caminho(int maxTam) {
        this.tamanho = maxTam;
        this.caminho = new Coordenada[maxTam];
    }

    public int tamanho() {
        int tam = 0;
        for (Coordenada coordenada : caminho) {
            if (coordenada != null) { tam++; }
        }
        return tam;
    }

    public void addCoordenada(Coordenada coordenada) throws TamanhoMaximoExcedidoException, DistanciaEntrePontosExcedidaException {
        if (tamanho() == tamanho) {
            throw new TamanhoMaximoExcedidoException();
        } else if (tamanho() == 0) {
            caminho[tamanho()] = coordenada;
        } else {
            if (caminho[tamanho() - 1].distancia(coordenada) > 15) {
                throw new DistanciaEntrePontosExcedidaException();
            } else {
                caminho[tamanho()] = coordenada;
            }
        }
    }

    public void reset() {
        Arrays.fill(caminho, null);
    }

    public String toString(){
        StringBuilder pontos = new StringBuilder(String.format("Dados do caminho:\n  - Quantidade de pontos: %d\n", tamanho()));
        pontos.append("  - Pontos:\n");
        if (tamanho() != 0) {
            for (int i=0; i<tamanho(); i++) {
                pontos.append(String.format("    -> %s\n", caminho[i].toString()));
            }
        }
        return pontos.toString();
    }
}

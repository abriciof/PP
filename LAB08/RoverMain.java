package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
    public static void main(String[] args) {
        try {
            Caminho pontos = new Caminho(4);
            Coordenada p1 = new Coordenada(23, 55, 8);
            Coordenada p2 = new Coordenada(27, 65, 2);

            pontos.addCoordenada(p1);
            pontos.addCoordenada(p2);

            System.out.print(pontos.toString());
        } catch (TamanhoMaximoExcedidoException | DistanciaEntrePontosExcedidaException | CoordenadaNegativaException | CoordenadaForaDosLimitesException | DigitoInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}

public class Sala implements Comparable<Sala>{
    int bloco, sala, capacidade;
    boolean acessivel;

    Sala(){this(0,0,0,true);}

    Sala(int bloco, int sala, int capacidade, boolean acessivel){
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }

    String getDescricao(){
        if (this.acessivel==true) return (String.format("Bloco %d, Sala %d (%d lugares, acessível)", this.bloco, this.sala, this.capacidade));
        return (String.format("Bloco %d, Sala %d (%d lugares, não acessível)", this.bloco, this.sala, this.capacidade));
    }

    String getCapacidade(){
        return String.format("Sala: %d, Capacidade: %d", this.sala, this.capacidade);
    }

    public int getCapacidadeInt(){
        return this.capacidade;
    }

    @Override
    public int compareTo(Sala outraSala){
        if (this.capacidade < outraSala.getCapacidadeInt()){
            return -1;
        }else if(this.capacidade > outraSala.getCapacidadeInt()){
            return 1;
        }
        return 0;
    }
}

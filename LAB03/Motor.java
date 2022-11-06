class Motor{
    int tipo, potencia;
    double capacidade;

    Motor(){
        this(0,0.0,0);
    }
    Motor(int tipo, double capacidade, int potencia){
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.potencia = potencia;
    }
    String getTipoString(){
        String vetor[] = {"Gasolina","Alcool","Flex","Diesel","Eletrico","Outros"};
        if(this.tipo>=1 && this.tipo<=5) return vetor[this.tipo-1];
        else return vetor[5];
    }
    String getDescricao(){
        // String cap = String.format("%2.f", this.capacidade);
        return "Motor: tipo="+getTipoString()+", capacidade="+this.capacidade+"L, potencia="+this.potencia+"CV.";
    }
}
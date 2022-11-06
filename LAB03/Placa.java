class Placa {
    String placa;
    int tipo;
    Placa(){
        this(null,0);
    }
    Placa(String placa, int tipo){
        this.placa = placa;
        this.tipo = tipo;
    }
    String getTipoString(){
        String vetor[] = {"Normal","Servico","Oficial","Auto Escola","Prototipo","Colecionador", "Outros"};
        if(this.tipo>=1 && this.tipo<=6) return vetor[this.tipo-1];
        else return vetor[6];
    }
    boolean temEstacionamentoLivre(){
        if (this.tipo==2 || this.tipo==3) return true;
        else return false;
    }
    String getDescricao(){
        return "Placa: placa="+this.placa+", tipo="+getTipoString()+", estacionamentoLivre="+temEstacionamentoLivre()+".";
    }

    
}
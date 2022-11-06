 class Proprietario{
    String nome;
    int cnh, anoNascimento;

    Proprietario(){
        this(null, 0, 0);
    }

    Proprietario(String nome, int cnh, int anoNascimento){
        this.nome = nome;
        this.cnh = cnh;
        this.anoNascimento = anoNascimento;
    }
    
    int getIdade(int anoReferencia){
        return anoReferencia-this.anoNascimento;
    }
    
    String getDescricao(){
        return "Proprietario: nome="+this.nome+", cnh="+this.cnh+", anoNascimento="+this.anoNascimento+".";
    }
 }
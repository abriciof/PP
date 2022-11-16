public class TreinadorJedi{
    String titulacao, nome;

    TreinadorJedi(){ this("",""); }

    TreinadorJedi(String titulacao, String nome){
        this.titulacao = titulacao;
        this.nome = nome;
    }

    String getDescricao(){
        return (this.titulacao+" "+this.nome);}

}
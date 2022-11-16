import java.util.ArrayList;
import java.util.Objects; 

public class SessaoJedi{
    String nome;
    TreinadorJedi treinador;
    ArrayList<IniciadoJedi> iniciados = new ArrayList<>();

    SessaoJedi(){ this("", null); }

    SessaoJedi(String nome, TreinadorJedi treinador){
        this.nome = nome;
        this.treinador = treinador;
    }

    public void addIniciado(IniciadoJedi iniciado){
        this.iniciados.add(iniciado);
    }

    IniciadoJedi getIniciado(String nome){
        for (IniciadoJedi iniciado : this.iniciados) 
            if (Objects.equals(iniciado.nome, nome)) 
                return iniciado;
            
        return null;
    }

    public double getMediaAnoNascimento(){
        double soma=0.0;
        for (IniciadoJedi iniciado : this.iniciados) soma+=iniciado.anoNascimento;

        return (double)soma/this.iniciados.size();
    }

    String getDescricao(){
        StringBuilder jediDescricoes = new StringBuilder(); int i=0;
        for(IniciadoJedi iniciado : this.iniciados){
            i++; jediDescricoes.append(String.format("- Iniciado %d: %s\n",i,iniciado.getDescricao()));
        }
        return String.format("--> SESSÃO %s (Treinador: %s)\n%s", this.nome, this.treinador.getDescricao(), jediDescricoes);
    }
}
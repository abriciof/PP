public class IniciadoJedi {
    int anoNascimento;
    String nome, especie;

    IniciadoJedi() { this("", "", 0); }

    IniciadoJedi(String nome, String especie, int anoNascimento) {
        this.nome = nome;
        this.especie = especie;
        this.anoNascimento = anoNascimento;
    }

    public String getDescricao() {
        return (this.nome + " (especie=" + this.especie + ", nascimento=" + getAnoNascimento() + ")");
    }

    public String getAnoNascimento() {
        if (this.anoNascimento < 0) { return this.anoNascimento*(-1) + " ABY"; }
        else { return this.anoNascimento + " DBY"; }
    }
}
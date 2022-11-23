import java.util.ArrayList;


public class Ensalamento {
    ArrayList<Sala> salas;
    ArrayList<Turma> turmas;
    ArrayList<TurmaEmSala> ensalamento;

    Ensalamento() {
        this.salas = new ArrayList<>();
        this.turmas = new ArrayList<>();
        this.ensalamento = new ArrayList<>();
    }

    public void addSala(Sala sala) {
        salas.add(sala);
    }

    public void addTurma(Turma turma) {
        turmas.add(turma);
    }

    public Sala getSala(Turma turma) {
        for (TurmaEmSala turmaEmSala : ensalamento) {
            if (turmaEmSala.turma == turma) {
                return turmaEmSala.sala;
            }
        }
        return null;
    }

    public boolean salaDisponivel(Sala sala, int horario) {
        for (TurmaEmSala turmaEmSala : ensalamento) {
            if (turmaEmSala.sala == sala) {
                for (int i=0; i<turmaEmSala.turma.horarios.size(); i++) {
                    if (turmaEmSala.turma.horarios.get(i) == horario) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
        for (Integer horario : horarios) {
            if (!salaDisponivel(sala, horario)) { return false; }
        }
        return true;
    }

    public boolean alocar(Turma turma, Sala sala) {
        TurmaEmSala turmaEmSala = new TurmaEmSala(turma, sala);
        if (((turma.acessivel == sala.acessivel) || (sala.acessivel)) && (turma.numAlunos <= sala.capacidade) && (salaDisponivel(sala, turma.horarios))){
            ensalamento.add(turmaEmSala);
            return true;
        }
        return false;
    }

    public void alocarTodas() {
        for (Turma turma : turmas) {
            for (Sala sala : salas) {
                if (alocar(turma, sala)) { break; }
            }
        }
    }

    public int getTotalTurmasAlocadas() {
        int qtdeTurmas = 0;
        for (TurmaEmSala turmaEmSala : ensalamento) {
            if (turmaEmSala != null) { qtdeTurmas++; }
        }
        return qtdeTurmas;
    }

    public int getTotalEspacoLivre() {
        int total = 0;
        for (TurmaEmSala turmaEmSala : ensalamento) {
            if (turmaEmSala != null) {
                total += turmaEmSala.sala.capacidade - turmaEmSala.turma.numAlunos;
            }
        }
        return total;
    }

    public String relatorioResumoEnsalamento() {
        return String.format("Total de Salas: %d\nTotal de Turmas: %d\nTurmas Alocadas: %d\nEspaços Livres: %d\n",
                             salas.size(), turmas.size(), getTotalTurmasAlocadas(), getTotalEspacoLivre());
    }

    public String relatorioTurmasPorSala() {
        StringBuilder str = new StringBuilder(relatorioResumoEnsalamento());
        for (Sala sala : salas) {
            str.append(String.format("\n--- %s ---\n\n", sala.getDescricao()));
            for (TurmaEmSala turmaEmSala : ensalamento) {
                if (turmaEmSala.sala == sala) {
                    str.append(String.format("%s\n", turmaEmSala.turma.getDescricao()));
                }
            }
        }
        return str.toString();
    }

    public String relatorioSalasPorTurma() {
        StringBuilder str = new StringBuilder(relatorioResumoEnsalamento());
        for (Turma turma : turmas) {
            str.append(String.format("\n%s", turma.getDescricao()));

            if (getSala(turma) != null) {
                str.append(String.format("\nSala: %s\n", getSala(turma).getDescricao()));
            } else {
                str.append("\nSala: SEM SALA\n\n");
            }
        }
        return str.toString();
    }
}
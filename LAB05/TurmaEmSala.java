public class TurmaEmSala {
    Sala sala;
    Turma turma;

    TurmaEmSala() { this(null, null); }

    TurmaEmSala(Turma turma, Sala sala) {
        this.sala = sala;
        this.turma = turma;
    }
}

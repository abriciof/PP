import java.util.ArrayList;
import java.util.Collections;


public class EnsalamentoMain {
    public static void main(String[] args) {
        Sala sala1 = new Sala(6, 102, 100, true);
        Sala sala2 = new Sala(6, 101, 50, true);
        Sala sala3 = new Sala(6, 203, 50, false);
        Sala sala4 = new Sala(6, 204, 100, false);

        Turma turma0 = new Turma("Técnicas de Programação", "Horácio Fernandes", 50, false);
        turma0.addHorario(11);
        turma0.addHorario(25);
        turma0.addHorario(32);

        Turma turma1 = new Turma("Laboratório de Programação C", "Edson Nascimento", 25, true);
        turma1.addHorario(1);
        turma1.addHorario(15);
        turma1.addHorario(29);

        Turma turma2 = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, false);
        turma2.addHorario(1);
        turma2.addHorario(15);
        turma2.addHorario(29);


        Turma turma3 = new Turma("Redes de Computadores", "Edjair Souza", 70, true);
        turma3.addHorario(1);
        turma3.addHorario(15);
        turma3.addHorario(29);

        Ensalamento salas = new Ensalamento();
        salas.addSala(sala1);
        salas.addSala(sala2);
        salas.addSala(sala3);
        salas.addSala(sala4);

        salas.addTurma(turma0);
        salas.addTurma(turma1);
        salas.addTurma(turma2);
        salas.addTurma(turma3);
        salas.alocarTodas();

        System.out.println(salas.relatorioResumoEnsalamento());
        System.out.println(salas.relatorioTurmasPorSala());
        System.out.println(salas.relatorioSalasPorTurma());

        // ArrayList<Sala> salaOrd = salas.getSalas();

        // for(Sala s: salaOrd){
        //     System.out.println(s.getCapacidade());
        // }

        // System.out.println();

        // Collections.sort(salaOrd);

        // for(Sala s: salaOrd){
        //     System.out.println(s.getCapacidade());
        // }
    }
}

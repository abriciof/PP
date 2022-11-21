public class EnsalamentoMain{
    public static void main(String[] args){
        // Sala s = new Sala(6,101,50,true);
        // System.out.println(s.getDescricao());

        Turma t = new Turma("wu","a",30,true);
        t.addHorario(2);
        t.addHorario(8);
        t.addHorario(15);
        t.addHorario(29);
        t.addHorario(30);
        t.addHorario(14);
        t.addHorario(7);
        t.addHorario(28);

        System.out.println(t.getHorariosString());
        System.out.println(t.getDescricao());


    }

}
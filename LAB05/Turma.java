import java.util.ArrayList;
import java.util.Iterator;

public class Turma{
    String nome, professor;
    int numAlunos;
    boolean acessivel;
    ArrayList<Integer> horarios = new ArrayList<>();

    Turma(){this("","",0,true);}

    Turma(String nome, String professor, int numAlunos, boolean acessivel){
        this.nome = nome;
        this.professor = professor;
        this.numAlunos = numAlunos;
        this.acessivel = acessivel;
    }

    void addHorario(int horario){
        this.horarios.add(horario);
    }

    String getHorariosString(){
        StringBuilder horariosDescricoes = new StringBuilder();
        int horas[] = {8, 10, 12, 14, 16, 18, 20};
        String dias[] = {"segunda", "terça", "quarta", "quinta", "sexta"};
        Iterator i = this.horarios.iterator();
        int l, c, num;
        while(i.hasNext()){
            num = (int) i.next();
            c = num/7;
            l = num -(c*7) - 1;
            if(num%7==0) {l=6; c--;}
            
            horariosDescricoes.append(String.format("%s %dhs",dias[c], horas[l]));
            // System.out.printf("%s %dhs",dias[c], horas[l]);
            if((i.hasNext())) horariosDescricoes.append(", ");
            // if((i.hasNext())) System.out.printf(", ");
        }

        return String.format("%s",horariosDescricoes);
    }
    String getDescricao(){
        if(this.acessivel == true) return String.format("Turma: %s\nProfessor: %s\nNúmero de Alunos: %d\nHorário: %s\nAcessível: sim", this.nome,this.professor,this.numAlunos,getHorariosString());
        return String.format("Turma: %s\nProfessor: %s\nNúmero de Alunos: %d\nHorário: %s\nAcessível: não", this.nome,this.professor,this.numAlunos,getHorariosString());
    }

}
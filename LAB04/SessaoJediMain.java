public class SessaoJediMain {
    public static void main(String[] args) {
        IniciadoJedi jd = new IniciadoJedi("Katooni","Tholothian",-23);

        System.out.println(jd.getDescricao());

        TreinadorJedi tj = new TreinadorJedi("Grão-Mestre","Fae Coven");

        System.out.println(tj.getDescricao());

        SessaoJedi sjd = new SessaoJedi("Instruções de Uso da Força",tj);
        sjd.addIniciado(jd);
        sjd.addIniciado(new IniciadoJedi("Byph", "Ithorian", -21));
        sjd.addIniciado(new IniciadoJedi("Gungi", "Wookiee", -23));
        sjd.addIniciado(new IniciadoJedi("Petro", "Human", -22));

        System.out.println(sjd.getDescricao());
    }
}
import xadrez.*;

public class App {
    public static void main(String[] args) throws Exception {
        Peca peao = new Peao();
        Peca cavalo = new Cavalo();
        Peca bispo = new Bispo();

        peao.mover();
        cavalo.mover();
        bispo.mover();

        System.out.println(peao instanceof Peca);
        System.out.println(cavalo instanceof Peca);
        System.out.println(bispo instanceof Peca);


    }
}

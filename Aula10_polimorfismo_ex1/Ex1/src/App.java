public class App {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal rato = new Rato();

        cachorro.comunicar();
        gato.comunicar();
        rato.comunicar();

        cachorro.movimentar();
        System.out.println(cachorro.getClass());

        System.out.println(cachorro instanceof Animal);
    }
}

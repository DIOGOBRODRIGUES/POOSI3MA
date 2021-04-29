public class App {
    public static void main(String[] args) throws Exception {
      Carro carro = new Carro(40000.00, null, 3000);
      System.out.println(carro.getPeso());
      System.out.println(carro.getVelocidadeTerrestre());
      System.out.println(carro.getMarca());
    }
}

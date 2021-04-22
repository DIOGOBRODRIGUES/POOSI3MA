import br.uninassau.sistema_bancario.dados.*;
import br.uninassau.sistema_bancario.negocios.beans.Conta;
public class App {
    public static void main(String[] args) throws Exception {
       RepositorioContas lista1 = new RepositorioContas(3);
       Conta c1 = new Conta (1234, 100.50); 
       Conta c2 = new Conta (2356, 200.13);
       Conta c3 = new Conta (5646, 1000.50);

       lista1.cadastrar(c1);
       lista1.cadastrar(c2);
       lista1.cadastrar(c3);

       System.out.println(lista1.toString());

       System.out.println(lista1.procurar("1234"));

       lista1.remover("1234");
       System.out.println(lista1.toString());
     
    }
}

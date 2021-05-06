import br.uninassau.sistema_bancario.dados.*;
import br.uninassau.sistema_bancario.negocios.beans.Conta;
import br.uninassau.sistema_bancario.negocios.beans.ContaEspecial;
import br.uninassau.sistema_bancario.negocios.beans.Poupanca;
public class App {
    public static void main(String[] args) throws Exception {
      /* RepositorioContas lista1 = new RepositorioContas(3);
       Conta c1 = new Conta ("1234", 100.50); 
       Conta c2 = new Conta ("2356", 200.13);
       Conta c3 = new Conta ("5646", 1000.50);

       lista1.cadastrar(c1);
       lista1.cadastrar(c2);
       lista1.cadastrar(c3);

       System.out.println(lista1.toString());

       System.out.println(lista1.procurar("1234"));

       lista1.remover("1234");
       System.out.println(lista1.toString());*/

       /*Poupanca p = new Poupanca("2123-5");
       p.creditar(1000.00);
       p.debitar(22.99);
       p.renderJuros(0.02);
       
       System.out.println(p.getSaldo());*/

/*
       ContaEspecial contae = new ContaEspecial("126456-6");
       contae.creditar(500.00);
       contae.debitar(550.00);
       contae.aumentarLimite(100);
       System.out.println(contae.getSaldo());*/
/*
       Conta conta = new Poupanca("23456-7");
       conta.creditar(100.00);
       conta.debitar(30.50);
       System.out.println(conta.getSaldo());*/

       Conta contae = new ContaEspecial("12345-56");
       contae.creditar(500.00);
       contae.debitar(550.0);
       //((ContaEspecial)contae).aumentarLimite(100.00);
        //contae.debitar(75.00);
        System.out.println(contae.getSaldo());




    }
}

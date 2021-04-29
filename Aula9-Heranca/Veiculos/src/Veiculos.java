import java.util.Date;

public class Veiculos{
    private double preco;
    private Date fabricacao;
    private double peso;

    public Veiculos(double preco, Date fabricacao, double peso){
        this.preco = preco;
        this.fabricacao = fabricacao;
        this.peso = peso;
    }

    public double getPreco(){
        return preco;
    }

    public Date getFabricacao(){
        return fabricacao;
    }

    public double getPeso(){
        return peso;
    }
}
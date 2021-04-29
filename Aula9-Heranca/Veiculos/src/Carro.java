import java.util.Date;

public class Carro extends VeiculoTerrestre{
    private String marca;
    private String proprietario;

    public Carro(double preco, Date fabricacao, double peso) {
        super(preco, fabricacao, peso);
        this.marca = null;
        this.proprietario = null;
    }

    public String getMarca() {
        return marca;
    }

    public String getProprietario() {
        return proprietario;
    }

    
}

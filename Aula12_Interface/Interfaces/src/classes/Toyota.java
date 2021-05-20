package classes;

import interfaces.Motor;
import interfaces.Veiculo;

public class Toyota implements Motor, Veiculo{
    
    @Override
    public int getRPM(){
        return 8000;
    }

    @Override
    public double getPotencia(){
        return 139.0;
    }

    @Override 
    public String getTipo(){
        return "Veiculo Urbano";
    }

    @Override
    public double getPeso(){
        return 1650.0;
    }
}

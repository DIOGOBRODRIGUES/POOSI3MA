package aulaPratica3NA;

public class Principal {

	public static void main(String[] args) {
		Porta porta1 = new Porta();
		Porta porta2 = new Porta(true, "Verde", 1, 2, 0.25);
		Porta porta3 = new Porta(true, "Amarela", 1.5, 2, 0.5);
		
		Casa casa = new Casa();
		
		porta1.pinta("Azul");
		porta1.abre();
		porta1.setDimensaoX(1.78);
		porta2.fecha();
		
		casa.setPorta1(porta1);
		casa.setPorta2(porta2);
		casa.setPorta3(porta3);
		
		casa.pinta("rosa");
		
		System.out.println("numero de portas abertas "+
		casa.quantasPortasAbertas());
		
		System.out.println(casa.toString());
		/*if(porta2.estaAberta())
			System.out.println("Porta 2 aberta");
		else
			System.out.println("Porta 2 fechada");*/
		
		/*System.out.println(porta1.toString());
		System.out.println(porta2.toString());*/
	}

}

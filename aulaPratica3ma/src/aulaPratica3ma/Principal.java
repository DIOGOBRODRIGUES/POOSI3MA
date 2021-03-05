package aulaPratica3ma;

public class Principal {

	public static void main(String[] args) {
	 Porta porta1 = new Porta();
	 Porta porta2 = new Porta(true, "Amarela",1, 2, 0.5 );
	 Porta porta3 = new Porta(false, "verde", 1, 3, 0.75);
	 Casa casa = new Casa();
	 
	 porta1.pinta("azul");
	 porta2.pinta("rosa");
	 porta1.setDimensaoX(1);
	 
	 /*if(porta1.estaAberta()) {
		 System.out.println("Porta 1 está aberta");
	 }else {
		 System.out.println("Porta 1 Fechada");
	 }*/
	 casa.setPorta1(porta1);
	 casa.setPorta2(porta2);
	 casa.setPorta3(porta3);
	 
	 casa.pinta("Verde");
	 System.out.println(casa.quantasPortasAbertas());
	 
	 
	 //System.out.println(porta1.toString());
	 //System.out.println(porta2.toString());
	 
	 System.out.println(casa.toString());
	}

}

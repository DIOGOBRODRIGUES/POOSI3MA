package aulaPratica3NA;

public class Casa {
	private String cor;
	private Porta porta1;
	private Porta porta2;
	private Porta porta3;
	
	public Casa () {
		cor = "branca";
		porta1 = null;
		porta2 = null;
		porta3 = null;
	}

	public Casa(String cor, Porta porta1, Porta porta2, Porta porta3) {
		super();
		this.cor = cor;
		this.porta1 = porta1;
		this.porta2 = porta2;
		this.porta3 = porta3;
	}
	
	public void pinta(String s) {
		cor = s;
	}
	
	public int quantasPortasAbertas() {
		int i  = 0;
		if(porta1.estaAberta()) 
			i++;
		if(porta2.estaAberta())
			i++;
		if(porta3.estaAberta())
			i++;
		return i;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Porta getPorta1() {
		return porta1;
	}

	public void setPorta1(Porta porta1) {
		this.porta1 = porta1;
	}

	public Porta getPorta2() {
		return porta2;
	}

	public void setPorta2(Porta porta2) {
		this.porta2 = porta2;
	}

	public Porta getPorta3() {
		return porta3;
	}

	public void setPorta3(Porta porta3) {
		this.porta3 = porta3;
	}

	@Override
	public String toString() {
		return "Casa [cor=" + cor + ", porta1=" + porta1 + ", "
				+ "porta2=" + porta2 + ", porta3=" + porta3 + "]";
	}
	
	
	
}

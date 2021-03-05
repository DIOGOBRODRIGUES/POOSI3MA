package aulaPratica3ma;

public class Porta {
	private boolean aberta;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	public Porta() {
		aberta = true;
		cor = "branca";
		dimensaoX = 0;
		dimensaoY = 0;
		dimensaoZ = 0;
	}

	public Porta(boolean abertaUser, String corUser, double dimensaoXUser, 
			double dimensaoYUser, double dimensaoZUser) {
		aberta = abertaUser;
		cor = corUser;
		dimensaoX = dimensaoXUser;
		dimensaoY = dimensaoYUser;
		dimensaoZ = dimensaoZUser;
	}
	
	public void aberta() {
		aberta = true;
	}
	
	public void fecha() {
		aberta = false;
	}
	
	public void pinta(String novaCor) {
		cor = novaCor;
	}
	
	public boolean estaAberta() {
		return aberta;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	@Override
	public String toString() {
		return "Porta [aberta=" + aberta + ", cor=" + cor + ", dimensaoX=" + dimensaoX + ", dimensaoY=" + dimensaoY
				+ ", dimensaoZ=" + dimensaoZ + "]";
	}
	
	
	
}

package prog1;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa () {
		nome = "";
		idade = 0;
	}
	
	public Pessoa(String nomeIn, int idadeIn) {
		nome = nomeIn;
		idade = idadeIn;
	}
	
	public void fazerAniversario() {
		idade = idade +1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	

}

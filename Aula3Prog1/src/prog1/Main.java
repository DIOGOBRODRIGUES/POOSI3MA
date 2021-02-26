package prog1;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Diogo Rodrigues", 90);
		pessoa1.fazerAniversario();
		System.out.println(pessoa1.toString());
	}
}

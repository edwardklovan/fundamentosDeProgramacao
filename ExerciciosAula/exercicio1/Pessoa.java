public class Pessoa {
	
	private String nome;
	private int idade;
	private String endereco;

	public Pessoa(String n, int i) {
		nome = n;
		idade = i;
	}
	
	public Pessoa(String n, int i, String e) {
		nome = n;
		idade = i;
		endereco = e;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String n) {
		nome = n;
	}

	public int getIdade(){
		return idade;
	}

	public void setIdade(int i) {
		idade = i;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String e) {
		endereco = e;
	}	
}
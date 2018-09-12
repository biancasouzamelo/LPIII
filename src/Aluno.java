
public class Aluno {
	private String matricula;
	private String nome;
	private string telefone;
	private string endereco;
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public string getTelefone() {
		return telefone;
	}
	public void setTelefone(string telefone) {
		this.telefone = telefone;
	}
	public string getEndereco() {
		return endereco;
	}
	public void setEndereco(string endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + "]";
	}
}

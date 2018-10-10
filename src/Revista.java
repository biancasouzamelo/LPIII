
public class Revista extends ItemAcervo {

	private String numero;
	private String ano;
	private String publicacao;
	private String nome;
	private String titulo;
	private String editor;
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getPublicacao() {
		return publicacao;
	}
	public void setPublicacao(String publicacao) {
		this.publicacao = publicacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	@Override
	public String toString() {
		return "Revista [numero=" + numero + ", ano=" + ano + ", publicacao=" + publicacao + ", nome=" + nome
				+ ", titulo=" + titulo + ", editor=" + editor + "]";
	}
	
	
	
	
}

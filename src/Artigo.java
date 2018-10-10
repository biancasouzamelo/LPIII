
public class Artigo extends ItemAcervo {
	
	private String titulo;
	private String ator;
	private String ano;
	private String periodo;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAtor() {
		return ator;
	}
	public void setAtor(String ator) {
		this.ator = ator;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	@Override
	public String toString() {
		return "Artigo [titulo=" + titulo + ", ator=" + ator + ", ano=" + ano + ", periodo=" + periodo + "]";
	}
	
	

}


public class DVD extends ItemAcervo {
	
	private String titulo;
	private String sinopse;
	private String elenco;
	private String diretor;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}
	public String getElenco() {
		return elenco;
	}
	public void setElenco(String elenco) {
		this.elenco = elenco;
	}
	public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	@Override
	public String toString() {
		return "DVD [titulo=" + titulo + ", sinopse=" + sinopse + ", elenco=" + elenco + ", diretor=" + diretor + "]";
	}
	
}

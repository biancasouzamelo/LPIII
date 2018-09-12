
public class Biblioteca {
	public void emprestarLivro(){
		Aluno a = new Aluno();
		Livro l = new Livro();
		Emprestimo e = new Emprestimo();
		
		
		a.setMatricula("12345");
		a.setNome("Bianca Melo");
		a.setTelefone("999-8888");
		
		l.setTitulo("Logica de programacao");
		l.setAutor("Nilo Menezes");
		
		e.setAluno(a);
		e.setLivro(l);
		e.setsetdataDevolucao();
		
	}
}

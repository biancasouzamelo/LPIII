import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	private	ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
	private ArrayList<ItemAcervo> itensAcervo = new ArrayList<ItemAcervo>();
	private ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	
		public void cadastrarAluno(){
			
			Aluno aluno = new Aluno();
			
			Scanner eMatricula = new Scanner(System.in);
			Scanner bNome= new Scanner(System.in);
			Scanner cTelefone = new Scanner(System.in);
			Scanner dEndereco= new Scanner(System.in);
			
			
			System.out.println("Informe a matricula do Aluno: ");
			aluno.setMatricula(eMatricula.next());
			
			System.out.println("Informe o nome do Aluno: ");
			aluno.setNome(bNome.nextLine());
			
			System.out.println("Informe o numero do Telefone: ");
			aluno.setTelefone(cTelefone.next());
			
			System.out.println("Informe o Seu Endereço: ");
			aluno.setEndereco(dEndereco.nextLine());
			
			alunos.add(aluno);   
		}
	public void cadastrarLivro(){
		Livro livro = new Livro();
		
		Scanner etitulo = new Scanner(System.in);
		Scanner bautor= new Scanner(System.in);
		Scanner cISBN = new Scanner(System.in);
		Scanner deditora= new Scanner(System.in);
		
		
		System.out.println("Digite o nome do titulo: ");
		livro.setTitulo(etitulo.nextLine());
		
		System.out.println("Informe o Nome do Autor do Livro: ");
		livro.setAutor(bautor.nextLine());
		
		System.out.println("Informe o numero do ISBN: ");
		livro.setISBN(cISBN.next());
		
		System.out.println("Informe o nome da Editora: ");
		livro.setEditora(deditora.nextLine());
		
		itensAcervo.add(livro);                           
			
	}
	
	public void cadastrarRevista(){
		Revista revista = new Revista();
		Scanner e = new Scanner(System.in);
		Scanner nome = new Scanner(System.in);
		Scanner titulo= new Scanner(System.in);
		Scanner editor= new Scanner(System.in);
		
		System.out.println("Informe o número da revista: ");
		revista.setNumero(e.next());
		
		System.out.println("Informe o ano da Revista: ");
		revista.setAno(e.next());
		
		System.out.println("Informe a publicação: ");
		revista.setPublicacao(e.next());
		
		System.out.println("Informe o nome da Revista: ");
		revista.setNome(nome.nextLine());
		
		System.out.println("Informe o titulo da Revista: ");
		revista.setTitulo(titulo.nextLine());
		
		System.out.println("Informe o editor da Revista: ");
		revista.setEditor(editor.nextLine());
		
		itensAcervo.add(revista);                           
			
	}
	
	public void cadastrarDVD(){
		DVD dvd = new DVD();
		Scanner titulo = new Scanner(System.in);
		Scanner sinopse = new Scanner(System.in) ;
		Scanner elenco = new Scanner(System.in);
		Scanner diretor = new Scanner(System.in);
		
		System.out.println("Informe o título do DVD: ");
		dvd.setTitulo(titulo.nextLine());
		
		System.out.println("Informe sinopse do DVD: ");
		dvd.setSinopse(sinopse.nextLine());
		
		System.out.println("Informe elenco do DVD: ");
		dvd.setElenco(elenco.nextLine());
		
		System.out.println("Informe diretor do DVD: ");
		dvd.setDiretor(diretor.nextLine());
		
		itensAcervo.add(dvd);                           
			
	}
	
	public void cadastrarCD(){
		CD cd = new CD();
		
		Scanner titulo = new Scanner(System.in);
		Scanner artista = new Scanner(System.in);;
		Scanner categoria = new Scanner(System.in);
		
		System.out.println("Informe o título do CD: ");
		cd.setTitulo(titulo.nextLine());
		
		System.out.println("Informe o nome do artista do CD: ");
		cd.setArtista(artista.nextLine());
		
		System.out.println("Informe a categoria do CD: ");
		cd.setCategoria(categoria.nextLine());
		
		itensAcervo.add(cd); 
	}
		
	public void cadastrarArtigo(){
		Artigo artigo = new Artigo();
		
		Scanner titulo = new Scanner(System.in);
		Scanner ator = new Scanner(System.in);;
		Scanner ano = new Scanner(System.in);
		Scanner periodo = new Scanner(System.in);
		
		System.out.println("Informe o título do Artigo: ");
		artigo.setTitulo(titulo.nextLine());
		
		System.out.println("Informe o ator do Artigo: ");
		artigo.setAtor(ator.nextLine());
		
		System.out.println("Informe o ano do Artigo: ");
		artigo.setAno(ano.nextLine());
		
		System.out.println("Informe o periodo do Artigo: ");
		artigo.setPeriodo(periodo.nextLine());
		
		itensAcervo.add(artigo); 
	}

	
	public void listarAlunos(){ 
		System.out.println("Lista de Alunos");
		for(int i=0; i<alunos.size(); i++){	                       
			System.out.println((i+1)+ "," + alunos.get(i));
		}
	}
	
	public void listarAcervo(){ 
		System.out.println("Lista do Acervo");
		for(int i=0; i<itensAcervo.size(); i++){	                       
			System.out.println((i+1)+ "," + itensAcervo.get(i));
		}
	}
	public void emprestarAcervo(){	
		listarAlunos();
		listarAcervo();
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		Emprestimo emp = new Emprestimo();
		System.out.println("Informe o id do Aluno: ");
		emp.setAluno(alunos.get(a.nextInt()-1));
		
		System.out.println("Informe o id do Acervo: ");
		emp.setAcervo(itensAcervo.get(a.nextInt()-1));
		
		System.out.println("Informe a data de emprestimos: ");
		emp.setDataEmprestimo(b.next());
		emp.setStatus(1);
		emprestimos.add(emp);
	}
	
	public void listarEmprestimo(){ 
		System.out.println("Lista de emprestimos");
		for(int i=0; i<emprestimos.size(); i++){	                       
			System.out.println((i+1)+ "," + emprestimos.get(i));
		}
	}
	
	public void devolverItem(){ 
		listarEmprestimo();
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		
		System.out.println("Digite a id do acervo que deseja devolver: ");
		Emprestimo emp = emprestimos.get(a.nextInt()-1);
		
		System.out.println("Informe a data de devolução: ");
		emp.setDataDevolucao(b.next());	
		emp.setStatus(Emprestimo.DEVOLVIDO);
		}
	}
	

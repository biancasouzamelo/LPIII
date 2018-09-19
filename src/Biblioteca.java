import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
	ArrayList<Aluno> vetAluno = new ArrayList();
	ArrayList<Livro> vetLivro = new ArrayList();
	ArrayList<Emprestimo> vetEmprestimo = new ArrayList();
	
	public void cadastrarAluno(){
		Aluno a = new Aluno();
		
		
		Scanner leMatricula = new Scanner(System.in);
		Scanner leNome = new Scanner(System.in);
		Scanner leTelefone = new Scanner(System.in);
		Scanner leEndereco = new Scanner(System.in);
		
		
		System.out.printf("Digite a matrícula: ");
		a.setMatricula(leMatricula.next());
		
		System.out.printf("Digite o nome: ");
		a.setNome(leNome.nextLine());
		
		System.out.printf("Digite o Telefone: ");
		a.setTelefone(leTelefone.next());
		
		System.out.printf("Digite seu Endereço");
		a.setEndereco(leEndereco.nextLine());
		
		vetAluno.add(a);
	}
	
	public void cadastrarLivro(){
		Scanner leTitulo = new Scanner(System.in);
		Scanner leAutor = new Scanner(System.in);
		Scanner leISBN = new Scanner(System.in);
		Scanner leEditora = new Scanner(System.in);
		
		Livro l = new Livro();
		
		System.out.printf("Digite o título do Livro: ");
		l.setTitulo(leTitulo.next());
		
		System.out.printf("Digite o autor do Livro: ");
		l.setAutor(leAutor.next());
		
		System.out.printf("Digite o ISBN do Livro: ");
		l.setISBN(leISBN.next());
		
		System.out.printf("Digite a editora do Livro: ");
		l.setEditora(leEditora.next());
		
		vetLivro.add(l);
	}
	
	public void listarAluno(){
		
		System.out.printf("Alunos cadastrados no sistema: ");
		for(int i = 0; i<vetAluno.size();i++){
			System.out.println((i+1)+","+vetAluno.get(i));
		}	
	}
	
	public void listLivros(){
		System.out.printf("Livros cadastrados no sistema: ");
		for(int i =0; i<vetLivro.size() ;i++){
			System.out.println((i+1)+","+vetLivro.get(i));
		}
	}
	
	public void listEmprestimo(){
		System.out.printf("Emprestimos cadastrados no sistema: ");
		for(int i =0; i<vetEmprestimo.size();i++){
			System.out.println((i+1)+","+vetEmprestimo.get(i));
		}
	}
	
	public void emprestarLivro(){
		Scanner leOpcao = new Scanner(System.in);
		Scanner leData = new Scanner(System.in);
		
		Emprestimo emp = new Emprestimo();
		int opcao;
		
		listarAluno();
		listLivros();
		
		System.out.println("\n\nDigite o indice do aluno que deseja emprestar o livro: ");
		opcao = leOpcao.nextInt();
		if(opcao >=0 && opcao <vetLivro.size()){
			emp.setAluno(vetAluno.get(opcao));
		}
		else{
			System.out.print("Valor de índice inválido! ");
		}
		
		
		System.out.println("\n\nDigite o indice do livro: ");
		opcao = leOpcao.nextInt();
		if(opcao >=0 && opcao <vetLivro.size()){
			emp.setLivro(vetLivro.get(opcao));
		}
		else{
			System.out.print("Valor de índice inválido! ");
		}
		
		
		System.out.println("\n\nDigite a data do empréstimo: ");
		emp.setDataEmprestimo(leData.nextLine());
		
		
		
		emp.setStatus(1);
		
		
		
		vetEmprestimo.add(emp);
		
		
		/*
		a.setMatricula("12345");
		a.setNome("Bianca Melo");
		a.setTelefone("999-8888");
		
		l.setTitulo("Logica de programacao");
		l.setAutor("Nilo Menezes");
		
		e.setAluno(a);
		e.setLivro(l);
		e.setDataEmprestimo("11/09/2018");
		e.setStatus(Emprestimo.EMPRESTADO);
		
		System.out.println(a);
		System.out.println(l);
		System.out.println(e);
		*/
	}
	
	public void devolverLivro(){
		Scanner leOpcao = new Scanner(System.in);
		Emprestimo emp = new Emprestimo();
		
		listEmprestimo();
		
		int opcao;
		
		System.out.print("Digite o índice do empréstimo que deseja devolver: ");
		opcao = leOpcao.nextInt();
		if(opcao >=0 && opcao <vetLivro.size()){
			System.out.print("Digite a data da devolução: ");
			vetEmprestimo.get(opcao);
			
		}
		else{
			System.out.print("Valor de índice inválido! ");
		}
	}
}

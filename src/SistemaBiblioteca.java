import java.util.Scanner;

public class SistemaBiblioteca {

	public static void main(String[] args) {
		
		int opção;
		Biblioteca biblioteca = new Biblioteca();
		Scanner e = new Scanner(System.in);
		do{
			System.out.println("\nSistema de Biblioteca:\n");
			System.out.println("1-Cadastrar aluno \n2-Listar Aluno \n3-Cadastrar Acervo  \n4-Listar Acervo \n5-Emprestar Acervo \n6-Listar Emprestimo \n7-Devolver Item \n8-Cadastrar Revista \n9-Cadastrar DVD \n10-Cadastrar CD \n11-Cadastrar Artigo");
			System.out.print("\nDigite sua Opção:");
			opção =e.nextInt();
			switch( opção )
			{
			    case 1:
			    	biblioteca.cadastrarAluno();  
			            break;
			    
			    case 2:
			    	biblioteca.listarAlunos();
			            break;
			    
			    case 3:
			    	biblioteca. cadastrarLivro();
			            break;
			    case 4:
			    	biblioteca.listarAcervo();
		            	break;
			    case 5:
			    	biblioteca.emprestarAcervo();
		            	break;
			    case 6:
			    	biblioteca.listarEmprestimo();
		            	break;
			    case 7:
			    	biblioteca.devolverItem();
		            	break;
			    case 8:
			    	biblioteca.cadastrarRevista();
		            	break;
			    case 9:
			    	biblioteca.cadastrarDVD();
		            	break;
			    case 10:
			    	biblioteca.cadastrarCD();
		            	break;
			    case 11:
			    	biblioteca.cadastrarArtigo();
		            	break;   
			    default:        
			}
		
		}while(opção<12);
	}

}



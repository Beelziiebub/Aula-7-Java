package Aula;
import javax.swing.JOptionPane;
public class Principal {
	
	public static void main(String[] args) {	
		String codigo, nome, email, disciplinas, curso;
		int cod;
		
		// entrada de dados para professor
		codigo = JOptionPane.showInputDialog("Digite o código do Professor");
		cod = Integer.parseInt(codigo);
		nome   = JOptionPane.showInputDialog("Digite o nome do Professor");
		email  = JOptionPane.showInputDialog("Digite o e_mail do Professor");
		disciplinas = JOptionPane.showInputDialog("Digite as disciplinas que o Professor leciona");
		
		// criar os objetos
		Professores prof1 = new Professores();
		// Entrada de dados so professor
		prof1 = EntradaDeDados();
		
		prof.Consultar();
		
		Professores prof2 = new Professores();
		prof2 = EntradaDeDados();
		prof2.Consultar(); 
		
	}
	public Professores EntradaDeDados() {
		String Dados;
		Professores prof = new Professores();
		
		dados = JOptionPane.showInputDialog("Digite o código do Professor: ");
		prof.codigo = Integer.parseInt(Dados);
		prof.nome = JOptionPane.showInputDialog("Digite o nome do professore: ");
		prof.email = JOptionPane.showInputDialog("Digite o E-mail do professor: ");
		prof.disciplinas = JOptionPane.showInputDialog("Digite a disciplina: ");
		
		return prof;
		
		// entrada de dados para aluno
					
		
		Alunos aluno1 = new Alunos();
		aluno1.Incluir_Aluno(cod, nome, email,curso);
		aluno1.Consultar();
	
	
	}
	
}

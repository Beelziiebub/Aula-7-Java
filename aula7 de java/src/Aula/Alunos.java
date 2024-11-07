package Aula;
public class Alunos extends Pessoas {
	protected String curso;
	
	protected void setCurso(String _curso) {
		this.curso = _curso;
	}
	
	protected String getCurso() {
		return this.curso;
	}
	
	public void Consultar() {
		System.out.println("=========== Dados do Aluno ===========");
		System.out.println("Código     : " + this.getCodigo());
		System.out.println("Nome       : " + this.getNome());
		System.out.println("E-mail     : " + this.getEmail());
		System.out.println("Curso      : " + this.getCurso());
	}
	
	public void Incluir_Aluno(int _cod, String _nome, String _email, String _curso) {
		this.setCodigo(_cod);
		this.setNome(_nome);
		this.setEmail(_email);
		this.setCurso(_curso);
	}	
}

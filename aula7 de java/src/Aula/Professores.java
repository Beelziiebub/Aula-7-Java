package Aula;
public class Professores extends Pessoas {
	public String disciplinas;
	
	public void setDisciplinas(String _disciplinas) {
		this.disciplinas = _disciplinas;
	}
	
	public String getDisciplinas() {
		return this.disciplinas;
	}
	
	public void Consultar() {
		System.out.println("========== Dados do Professor ==========");
		System.out.println("Código      : " + this.getCodigo());
		System.out.println("Nome        : " + this.getNome());
		System.out.println("E-mail      : " + this.getEmail());
		System.out.println("Disciplinas : " + this.getDisciplinas());
	}
	
	public void Incluir_Prof(int _cod, String _nome, String _email, String _disc) {
		this.setCodigo(_cod);
		this.setNome(_nome);
		this.setEmail(_email);
		this.setDisciplinas(_disc);
	}
}


package Aula;
public class Pessoas {
	protected int codigo;
	protected String nome;
	protected String email;
	
	protected void setCodigo(int _cod)		{	this.codigo = _cod;		}
	protected void setNome(String _nome)	{	this.nome   = _nome;	}
	protected void setEmail(String _email)	{	this.email  = _email;	}
	
	protected int    getCodigo()	{		return this.codigo;		}
	protected String getNome()		{		return this.nome;		}
	protected String getEmail()		{		return this.email;		}
}

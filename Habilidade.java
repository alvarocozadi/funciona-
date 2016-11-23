package pokedex;
public class Habilidade 
{
	private String nome;
	private String tipo;
	private int danoBase;
	
	public Habilidade (String nome, String tipo, int danoBase) 
	{
		this.nome = nome;
		this.tipo = tipo;
		this.danoBase = danoBase;
	}
	
	
	//Métodos públicos pertinentes
	public String getNome () 
	{
		return this.nome;
	}
	
	public String getTipo ()
	{
		return this.tipo;
	}
	
	public int getDanoBase ()
	{
		return this.danoBase;
	}
	
	//Métodos privados pertinentes
	private void setNome (String nome) 
	{
		this.nome = nome;
	}
	
	private void setTipo (String tipo)
	{
		this.tipo = tipo;
	}


	private void setDanoBase (int danoBase)
	{
		this.danoBase = danoBase;
	}
}

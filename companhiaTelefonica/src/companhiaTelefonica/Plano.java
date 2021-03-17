package companhiaTelefonica;
//código, descrição, valor mensal, franquia (minutos) e valor da chamada.
public class Plano extends companhiaEletronica 
{
	private int codigo;
	private String descricao;
	private float valorMensal;
	private float franquia;
	private float valorChamada;

	public Plano(int codigo ,String descricao, float valorMensal,float franquia,float valorChamada)
	{
		this.codigo=codigo;
		this.descricao  = descricao;
		this.valorMensal = valorMensal;
		this.franquia = franquia;
		this.valorChamada = valorChamada;
	}

}

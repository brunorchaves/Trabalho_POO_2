package companhiaTelefonica;
//código, descrição, valor mensal, franquia (minutos) e valor da chamada.
public class Plano 
{
	private int codigo;
	private String descricao;
	private int valorMensal;
	private int franquia;
	private int valorChamada;

	public Plano(int codigo ,String descricao, int valorMensal,int franquia,int valorChamada)
	{
		this.codigo=codigo;
		this.descricao  = descricao;
		this.valorMensal = valorMensal;
		this.franquia = franquia;
		this.valorChamada = valorChamada;
	}

}

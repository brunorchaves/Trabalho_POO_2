package companhiaTelefonica;

public class Cliente extends companhiaEletronica
{
	private int CPF;
	private String nome;
	private int endereco;

	public Cliente(int CPF ,String nome, int endereco) {
		this.CPF=CPF;
		this.nome  = nome;
		this.endereco = endereco;
	}

}

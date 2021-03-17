package companhiaTelefonica;

public class Cliente extends companhiaEletronica
{
	private int CPF;
	private String nome;
	private int endereço;

	public Cliente(int CPF ,String nome, int endereço) {
		this.CPF=CPF;
		this.nome  = nome;
		this.endereço = endereço;
	}

}

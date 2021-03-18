package companhiaTelefonica;

public class Endereco {

	private String rua;
	private String bairro;
	private String cidade;
	private int numero;
	private String estado;
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String getRua() {
		return rua;
	}
	public Endereco() {
		super();
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rua+" "+bairro+" "+cidade+" "+estado+" "+numero;
	}
}

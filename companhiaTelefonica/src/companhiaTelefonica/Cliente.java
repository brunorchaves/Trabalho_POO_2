package companhiaTelefonica;

public class Cliente implements Dado
{
	private long CPF;
	private String nome;
	private Endereco endereco;
	public Cliente(long CPF, String nome, Endereco endereco) {
		super();
		this.CPF = CPF;
		this.nome = nome;
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public long getCPF() {
		return CPF;
	}
	
	@Override
	public boolean isDadoValido() {
		if(CPF>Math.pow(10,9)&&CPF<Math.pow(10,11)&&nome!=null&&endereco!=null) {
			return true;
		}return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return CPF+" "+nome+" "+endereco;
	}
}

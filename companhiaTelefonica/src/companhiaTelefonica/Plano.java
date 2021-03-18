package companhiaTelefonica;
public class Plano implements Dado
{
	private int codigo;
	private String descricao;
	private float valorMensal;
	private int franquia;
	private float valorChamada;
	public Plano(int codigo, String descricao, float valorMensal, int franquia, float valorChamada) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.valorMensal = valorMensal;
		this.franquia = franquia;
		this.valorChamada = valorChamada;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorMensal() {
		return valorMensal;
	}
	public void setValorMensal(float valorMensal) {
		this.valorMensal = valorMensal;
	}
	public int getFranquia() {
		return franquia;
	}
	public void setFranquia(int franquia) {
		this.franquia = franquia;
	}
	public float getValorChamada() {
		return valorChamada;
	}
	public void setValorChamada(float valorChamada) {
		this.valorChamada = valorChamada;
	}
	public int getCodigo() {
		return codigo;
	}
	@Override
	public boolean isDadoValido() {
		if(valorMensal>=0&&franquia>=0&&valorChamada>=0) {
			return true;
		}return false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return codigo+" "+descricao+" "+valorMensal+" "+franquia+" "+valorChamada;
	}

}

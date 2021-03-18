package companhiaTelefonica;

import java.util.Date;
import java.util.List;
public class NumerodeTelefone implements Dado{
	private int numero;
	private Cliente cliente;
	private Plano plano;
	private Date dataCancelamento;
	private int[] diasPagamento;
	
	public NumerodeTelefone(int numero, Cliente cliente, Plano plano, Date dataCancelamento,
			int[] diaPagamento) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.plano = plano;
		this.dataCancelamento = dataCancelamento;
		this.diasPagamento = diaPagamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Plano getPlano() {
		return plano;
	}
	public void setPlano(Plano plano) {
		this.plano = plano;
	}
	public Date getDataCancelamento() {
		return dataCancelamento;
	}
	public void setDataCancelamento(Date dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}
	public int[]  getDiaPagamento() {
		return diasPagamento;
	}
	public void setDiaPagamento(int[]  diaPagamento) {
		this.diasPagamento = diaPagamento;
	}
	public int getNumero() {
		return numero;
	}
	@Override
	public boolean isDadoValido() {
		if(numero>99&&cliente!=null&&cliente.isDadoValido()&&plano!=null&&plano.isDadoValido()&&diasPagamento!=null) {
			return true;
		}return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return numero+" "+cliente+" "+plano+" "+dataCancelamento+" "+diasPagamento;
	}
	


}

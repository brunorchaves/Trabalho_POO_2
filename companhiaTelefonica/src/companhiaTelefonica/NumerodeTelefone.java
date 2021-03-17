package companhiaTelefonica;
//import Plano;

public class NumerodeTelefone extends companhiaEletronica{
	private int numero;
	private Cliente cliente;
	private Plano plano;
	private int dataCancelamento ;
	private int diaPagamento ;

	public NumerodeTelefone(int numero, Cliente cliente, Plano plano, int dataCancelamento, int diaPagamento) {
	
		this.numero = numero;
		this.cliente = cliente;
		this.plano = plano;
		this.dataCancelamento = dataCancelamento;
		this.diaPagamento = diaPagamento;
	}

/*
	public String getCliente() {
		return cliente;
	}*/

/*
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}*/


	public Plano getPlano() {
		return plano;
	}


	public void setPlano(Plano plano) {
		this.plano = plano;
	}


	public int getDataCancelamento() {
		return dataCancelamento;
	}


	public void setDataCancelamento(int dataCancelamento) {
		this.dataCancelamento = dataCancelamento;
	}

	public int getDiaPagamento() {
		return diaPagamento;
	}

	public void setDiaPagamento(int diaPagamento) {
		this.diaPagamento = diaPagamento;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}


}

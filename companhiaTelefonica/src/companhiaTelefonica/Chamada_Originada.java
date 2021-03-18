package companhiaTelefonica;

import java.util.Date;

public class Chamada_Originada implements Dado{
	private NumerodeTelefone numeroOrigem;
	private long numeroDestino;
	private Date dataInicioChamada;
	private Date dataFimChamada;
	public Chamada_Originada(NumerodeTelefone numeroOrigem, long numeroDestino, Date dataInicioChamada,
			Date dataFimChamada) {
		super();
		this.numeroOrigem = numeroOrigem;
		this.numeroDestino = numeroDestino;
		this.dataInicioChamada = dataInicioChamada;
		this.dataFimChamada = dataFimChamada;
	}
	public NumerodeTelefone getNumeroOrigem() {
		return numeroOrigem;
	}
	public void setNumeroOrigem(NumerodeTelefone numeroOrigem) {
		this.numeroOrigem = numeroOrigem;
	}
	public long getNumeroDestino() {
		return numeroDestino;
	}
	public void setNumeroDestino(long numeroDestino) {
		this.numeroDestino = numeroDestino;
	}
	public Date getDataInicioChamada() {
		return dataInicioChamada;
	}
	public void setDataInicioChamada(Date dataInicioChamada) {
		this.dataInicioChamada = dataInicioChamada;
	}
	public Date getDataFimChamada() {
		return dataFimChamada;
	}
	public void setDataFimChamada(Date dataFimChamada) {
		this.dataFimChamada = dataFimChamada;
	}
	@Override
	public boolean isDadoValido() {
		if(numeroOrigem!=null&&numeroOrigem.isDadoValido()&&dataInicioChamada!=null&&(dataFimChamada==null||dataInicioChamada.before(dataFimChamada))) {
			return true;
		}return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return numeroOrigem+" "+numeroDestino+" "+dataInicioChamada+" "+dataFimChamada;
	}
}

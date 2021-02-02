package model.entidade;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prestacao {

	private Date dataVencimento;
	private Double valorParcela;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Prestacao() {
	}

	public Prestacao(Date dataVencimento, Double valorParcela) {
		this.dataVencimento = dataVencimento;
		this.valorParcela = valorParcela;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}
	
	@Override
	public String toString() {
		return sdf.format(this.dataVencimento) + " - " + this.valorParcela;
	}
	
}

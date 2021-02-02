package model.entidade;

import java.util.Date;

public class Contratos {

	private Integer numero;
	private Date data;
	private Double valorTotal;
	private Prestacao parcelas;
	
	public Contratos() {
	}

	public Contratos(Integer numero, Date data, Double valorTotal, Prestacao parcelas) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
		this.parcelas = parcelas;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Prestacao getParcelas() {
		return parcelas;
	}

	public void setParcelas(Prestacao parcelas) {
		this.parcelas = parcelas;
	}
		
}

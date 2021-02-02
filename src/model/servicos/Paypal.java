package model.servicos;

public class Paypal implements TaxasPagamento{

	public double taxaMensal(Double valor, int mes) {
		return valor + (valor * 0.01) * mes;
	}
	
	public double taxaPagamento(Double valor) {
		return valor + (valor * 0.02);
	}
	
}

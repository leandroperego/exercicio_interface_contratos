package model.servicos;

public interface TaxasPagamento {

	double taxaMensal(Double valor, int mes);
	double taxaPagamento(Double valor);
}

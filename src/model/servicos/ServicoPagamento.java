package model.servicos;

import java.util.Date;

import model.entidade.Contratos;
import model.entidade.Prestacao;

public class ServicoPagamento {

	private Contratos contrato;
	private TaxasPagamento empresa;
	
	public ServicoPagamento() {
	}

	public ServicoPagamento(Contratos contrato, TaxasPagamento empresa) {
		this.contrato = contrato;
		this.empresa = empresa;
	}

	public Contratos getContrato() {
		return contrato;
	}

	public void setContrato(Contratos contrato) {
		this.contrato = contrato;
	}

	public TaxasPagamento getEmpresa() {
		return empresa;
	}

	public void setEmpresa(TaxasPagamento empresa) {
		this.empresa = empresa;
	}
	
	public void processamentoContrato(Integer parcelas) {
		double parcelasBruta = contrato.getValorTotal() / parcelas;
		Date dataContrato = contrato.getData();
		
		for (int i=1; i<=parcelas; i++) {
			double parcelaComJurosMensal = empresa.taxaMensal(parcelasBruta,i);
			double parcelaFinal = empresa.taxaPagamento(parcelaComJurosMensal);
			contrato.setParcelas(new Prestacao(dataContrato, parcelaFinal));
		}
	}
	
}

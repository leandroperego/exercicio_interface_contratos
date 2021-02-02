package model.aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entidade.Contratos;
import model.servicos.Paypal;
import model.servicos.ServicoPagamento;

public class Principal {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Dados Contrato:");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		Date data = sdf.parse(sc.nextLine());
		System.out.print("Valor Contrato: ");
		double valor = sc.nextDouble();
		
		Contratos contrato = new Contratos(numero, data, valor);
		
		System.out.print("Número de parcelas: ");
		int numParcelas = sc.nextInt();
		
		ServicoPagamento servico = new ServicoPagamento(contrato, new Paypal());
		servico.processamentoContrato(numParcelas);
		
		System.out.println("Parcelas:");
		System.out.println(contrato.toString());

	}

}

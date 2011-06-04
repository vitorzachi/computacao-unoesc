package adapter.test;

import adapter.acne.Pagamento;
import adapter.acne.PagamentoImpl;
import adapter.acne.RegistrarPagamentoAcne;
import adapter.acne.adapter.PagamentoAdapter;
import adapter.pigbank.RegistrarPagamentoPigBank;

public class AdapterTest {

	public static void main(String arg[]){

		Pagamento pagamentoRegras = new PagamentoImpl();

		RegistrarPagamentoAcne regAcne = new RegistrarPagamentoAcne();

		regAcne.registrar(pagamentoRegras);

		RegistrarPagamentoPigBank reg = new RegistrarPagamentoPigBank();

		reg.registrar(new PagamentoAdapter(pagamentoRegras));

		System.out.println("Teste");

	}

}

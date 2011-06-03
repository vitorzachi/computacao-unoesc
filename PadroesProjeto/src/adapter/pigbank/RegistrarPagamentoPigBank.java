package adapter.pigbank;

import java.math.BigDecimal;

public class RegistrarPagamentoPigBank {

	public void registrar(adapter.pigbank.Pagamento pagamento){
		BigDecimal valor = pagamento.getValor();
		System.out.printf("Pagamento %.2f recebido \n",valor);
	}
}

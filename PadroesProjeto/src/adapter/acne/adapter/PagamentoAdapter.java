package adapter.acne.adapter;

import java.math.BigDecimal;

import adapter.pigbank.Pagamento;

public class PagamentoAdapter implements Pagamento {

	private adapter.acne.Pagamento pagamento;

	public PagamentoAdapter(adapter.acne.Pagamento pagamento){
		this.pagamento = pagamento;
	}

	@Override
	public BigDecimal getValor() {
		return new BigDecimal(pagamento.getValor());
	}

}

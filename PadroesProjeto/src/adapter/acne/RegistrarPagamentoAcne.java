package adapter.acne;
//conflito de svn -------------

public class RegistrarPagamentoAcne {

	public void registrar(Pagamento pagamento){
		double valor = pagamento.getValor();
		System.out.printf("Pagamento %.2f recebido \n",valor);
		System.out.println("Alteração uelyson");
	}

}

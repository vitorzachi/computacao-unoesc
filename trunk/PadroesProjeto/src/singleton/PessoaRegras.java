package singleton;

public class PessoaRegras {

	private static PessoaRegras instance = new PessoaRegras();

	private PessoaRegras(){}

	public static PessoaRegras getInstance(){
		return instance;
	}

	public void salvar(){
		System.out.println("Salvar");
	}

	public void excluir(){
		System.out.println("Excluiu");
	}

}

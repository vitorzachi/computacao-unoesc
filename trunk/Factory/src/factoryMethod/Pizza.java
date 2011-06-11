package factoryMethod;

public abstract class Pizza {

	private String nome;
	private String tipo;
	private String massa;

	public void prepare() {
		System.out.println("Preparando pizza: "+this.nome);
	}

	public void assar() {
		System.out.println("Assando");
	}

	public void cortar() {
		System.out.println("Cortando");
	}

	public void empacotar() {
		System.out.println("Empacontando");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}



}

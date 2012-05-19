package br.unoesc.cursoComputacao.model;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private String RG;
	private String CPF;

	private String branch;

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cpf) {
		this.CPF = cpf;
	}

	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}

	public String getNomeSobrenome() {
		return this.nome + " " + this.sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}

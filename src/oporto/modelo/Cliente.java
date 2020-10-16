package oporto.modelo;

public class Cliente {
	private String nome;
	private String dataNascimento;
	private Agencia agenciaVinculado;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Agencia getAgenciaVinculado() {
		return agenciaVinculado;
	}
	public void setAgenciaVinculado(Agencia agenciaVinculado) {
		this.agenciaVinculado = agenciaVinculado;
	}
}
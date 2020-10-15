package oporto.modelo;

import java.util.List;

public class Agencia{
	private String identificacaoAgencia;
	private Banco bancoVinculado;
	private List<Cliente> clientes;
	
	public String getIdentificacaoAgencia() {
		return identificacaoAgencia;
	}
	public void setIdentificacaoAgencia(String identificacaoAgencia) {
		this.identificacaoAgencia = identificacaoAgencia;
	}
	public List<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
	public Banco getBanco() {
		return bancoVinculado;
	}
	public void setBanco(Banco banco) {
		this.bancoVinculado = banco;
	}	
}
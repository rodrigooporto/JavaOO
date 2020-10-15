package oporto.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oporto.dominio.Agencia;
import oporto.dominio.Banco;
import oporto.dominio.Cliente;
import oporto.util.Util;

public class Cadastro {
	private Banco banco;
	private Agencia agencia = new Agencia();
	private Cliente cliente;
	List<Banco> bancos = new ArrayList<Banco>();
	Scanner entrada = new Scanner(System.in);
	
	
	public void cadastrarBanco() {
		Util.saidaTexto("Entre com os dados do Banco\n");
		String dados = entrada.nextLine();
		banco = new Banco();
		banco.setNome(dados);	
		bancos.add(banco);
	}

	public void listarBancos() {
		if(bancos.isEmpty()) {
			Util.saidaTexto("Nenhum Banco Cadastrado");
		}else {
			Util.saidaTexto("Relatório de Bancos Cadastrados\n");
		}
		Util.saidaTexto(banco.getNome());
	}
}
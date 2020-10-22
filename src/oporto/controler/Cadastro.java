package oporto.controler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import oporto.modelo.Agencia;
import oporto.modelo.Banco;
import oporto.modelo.Cliente;
import oporto.util.Util;

public class Cadastro {
	private Banco banco;
	private Agencia agencia = new Agencia();
	private Cliente cliente;
	private int codigo;
	List<Banco> bancos = new ArrayList<Banco>();
	List<Agencia> agencias = new ArrayList<Agencia>();
	List<Cliente> clientes = new ArrayList<Cliente>();
	Scanner entrada = new Scanner(System.in);

	public void cadastrarBanco() {
		Util.saidaTexto("Entre com os dados do Banco\n");
		String dados = entrada.nextLine();
		banco = new Banco();
		banco.setNome(dados);
		bancos.add(banco);
	}

	public void listarBancos() {
		if (bancos.isEmpty()) {
			Util.saidaTexto("Oh não, nenhum Banco Cadastrado");
		} else {
			Util.saidaTexto("Relatório de Bancos Cadastrados.\n[Código Banco]-[Descrição]");
		}
		for (Banco banco : bancos) {
			Util.saidaTexto(bancos.indexOf(banco) + "-" + banco.getNome());
		}
	}

	public void mostrarBuscarBanco(int codigo) {
		try {
			Util.saidaTexto(codigo + "-" + bancos.get(codigo).getNome());
		} catch (IndexOutOfBoundsException e) {
			Util.saidaTexto("Foi buscado um banco inesistente.");
		}
	}
	
	public void mostrarBuscarAgencia(int codigo) {
		try {
			Util.saidaTexto(codigo + "-" + agencias.get(codigo).getIdentificacaoAgencia());
		} catch (IndexOutOfBoundsException e) {
			Util.saidaTexto("Foi buscado uma agência inesistente.");
		}
	}

	public Banco buscaPorCodigoBanco(int codigo) {
		Banco codigoBanco = bancos.get(codigo);
		return codigoBanco;
	}	
	
	private Agencia buscarPorCodigoAgencia(int codigo) {
		Agencia codigoAgencia = agencias.get(codigo);
		return codigoAgencia;
	}


	public Banco vincularAgenciaAoBanco() {
		Util.saidaTexto("Agora vamos iniciar o processo de vinculação da agência. Entre com o código do banco.");
		codigo = entrada.nextInt();
		banco = buscaPorCodigoBanco(codigo);
		//Limpar Buffer
		if(entrada.hasNextLine()) {
			entrada.nextLine();
		}
		return banco;
	}

	private Agencia vincularClienteAgencia() {
		try {
			Util.saidaTexto("Vamos iniciar o processo de vinculação do cliente a uma agência. Entre com o código da Agência.");
			codigo = entrada.nextInt();
			agencia = buscarPorCodigoAgencia(codigo);
			//Limpar Buffer
			if(entrada.hasNextLine()) {
				entrada.nextLine();
			}
			return agencia;
		} catch (Exception e) {
			Util.saidaTexto("Foi escolhido um código invalido para agência");
		}		
		return agencia;
	}
	
	public void cadastroAgencia() {
		if (bancos.size() > 0) {			
			Util.saidaTexto("Entre com a identificação da Agência");
			String identificacaoAgencia = entrada.nextLine();
			agencia = new Agencia();
			agencia.setIdentificacaoAgencia(identificacaoAgencia);			
			banco = vincularAgenciaAoBanco();			
			agencia.setBanco(banco);
			agencias.add(agencia);
		} else {
			Util.saidaTexto("É necessário ter um banco cadastrado para cadastrar agências");
		}
	}
	public void cadastrarCliente() {
		if(agencias.size() > 0) {
			Util.saidaTexto("Entre com o nome do Cliente.");
			String nomeCliente = entrada.nextLine();
			Util.saidaTexto("Entre com a idade do cliente no formato dd/mm/yyyy");
			String dataNascimento = entrada.nextLine();					
			cliente = new Cliente();
			agencia = vincularClienteAgencia();
			cliente.setAgenciaVinculado(agencia);
			cliente.setNome(nomeCliente);
			cliente.setDataNascimento(dataNascimento);	
			clientes.add(cliente);
		}else {
			Util.saidaTexto("É necessário ter uma agencia antes de cadastrar cliente.");
		}
	}
	
	public void listarAgencia() {
		if (agencias.isEmpty()) {
			Util.saidaTexto("Não há nenhuma agência cadastrada.");
		} else {
			Util.saidaTexto("Relatório das Agências Cadastradas.\n[Banco]-[Código Agência]-[Descrição Agência]");
		}
		for (Agencia agencia : agencias) {
			Util.saidaTexto(agencia.getBanco().getNome() + "-" + agencias.indexOf(agencia) + "-"
					+ agencia.getIdentificacaoAgencia());
		}
	}
	
	public void listarCliente() {
		if(clientes.isEmpty()) {
			Util.saidaTexto("Não há nunhum cliente cadastrado.");
		} else {
			Util.saidaTexto("Relatório dos Clientes Cadastrados.\\n[Agencia]-[Código Cliente]-[Nome Cliente]");
		}
		for(Cliente cliente : clientes) {
			Util.saidaTexto(cliente.getAgenciaVinculado().getIdentificacaoAgencia() + "-"+clientes.indexOf(cliente) + "-"
					+ cliente.getNome());
		}
	}
}
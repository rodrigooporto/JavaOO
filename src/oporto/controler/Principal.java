package oporto.controler;

import oporto.util.Util;

public class Principal {

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
		int opcao, codigo;

		do {
			Util.saidaTexto("-----------------\nDigite a opção desejada. \n"
					+ "0 - Para Sair\n"
					+ "1 - Cadastrar Bancos\n"
					+ "2 - Listar Bancos\n"
					+ "3 - Buscar Banco por ID \n" 
					+ "4 - Cadastrar Agência\n"
					+ "5 - Listar Agência\n");
			opcao = Util.entrada.nextInt();

			if (opcao == 1) {
				cadastro.cadastrarBanco();
			} else if (opcao == 2) {
				cadastro.listarBancos();
			} else if(opcao == 3) {
				Util.saidaTexto("\nEntre com o código do Banco");
				codigo = Util.entrada.nextInt();
				cadastro.mostrarBuscarBanco(codigo);
			} else if(opcao == 4) {
				cadastro.cadastroAgencia();
			} else if(opcao == 5) {
				cadastro.listarAgencia();
			}
			
		} while (opcao != 0);
	}

}

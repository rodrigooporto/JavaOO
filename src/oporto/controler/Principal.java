package oporto.controler;

import oporto.util.Util;

public class Principal {

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
		int opcao, codigo;

		do {
			Util.saidaTexto("-----------------\nDigite a opção desejada. \n0 - Para Sair\n1 - Para Cadastro\n2 - Para Listar \n"
					+ "3 - Buscar Banco por ID");
			opcao = Util.entrada.nextInt();

			if (opcao == 1) {
				cadastro.cadastrarBanco();
			} else if (opcao == 2) {
				cadastro.listarBancos();
			} else if(opcao == 3) {
				Util.saidaTexto("\nEntre com o código do Banco");
				codigo = Util.entrada.nextInt();
				cadastro.buscarBanco(codigo);
			}
		} while (opcao != 0);
	}

}

package oporto.controler;

import oporto.util.Util;

public class Principal {

	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
		int opcao;

		do {
			Util.saidaTexto("-----------------\nDigite a opção desejada. \n0 - Para Sair\n1 - Para Cadastro\n2 - Para Listar \n-----------------");
			opcao = Util.entrada.nextInt();

			if (opcao == 1) {
				cadastro.cadastrarBanco();
			} else if (opcao == 2) {
				cadastro.listarBancos();
			}
		} while (opcao != 0);
	}

}

package oporto.util;

import java.util.Scanner;

public class Util {
	public static Scanner entrada = new Scanner(System.in);
	
	public static void saidaTexto(String mensagem) {
		System.out.println(mensagem);
	}
	
	public static void saidaInteiro(int numero) {
		System.out.println(numero);
	}
}
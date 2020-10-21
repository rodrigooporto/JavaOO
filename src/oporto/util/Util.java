package oporto.util;

import java.util.Scanner;

public class Util {
	//Comentario para testar o comportamento do Egit
	public static Scanner entrada = new Scanner(System.in);
	
	public static void saidaTexto(String mensagem) {
		System.out.println(mensagem+"\n-------------------------------");
	}
	
	public static void saidaInteiro(int numero) {
		System.out.println(numero);
	}
}

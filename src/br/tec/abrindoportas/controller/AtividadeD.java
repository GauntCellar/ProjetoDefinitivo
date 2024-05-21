package br.tec.abrindoportas.controller;

public class AtividadeD {
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Solicita ao usuário que insira um número entre 1 e 10
	        System.out.println("Digite um número entre 1 e 10:");
	        int numero = scanner.nextInt();
	        
	        int contador = 1; // Inicializa o contador
	        
	        // Loop while que executa enquanto o contador for menor ou igual ao número inserido pelo usuário
	        while (contador <= numero) {
	            // Loop for que executa 5 vezes
	            for (int i = 0; i < 5; i++) {
	                System.out.println(contador + "º dia: Livre");
	            }
	            contador++; // Incrementa o contador
	        }
	        
	        scanner.close();
	    }
	}

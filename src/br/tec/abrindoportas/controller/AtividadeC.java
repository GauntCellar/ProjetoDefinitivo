package br.tec.abrindoportas.controller;

public class AtividadeC {
	import java.util.Scanner;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Solicita ao usuário que insira um número entre 1 e 5
	        System.out.println("Digite um número entre 1 e 5:");
	        int numero = scanner.nextInt();
	        
	        // Loop for que executa com base no número inserido pelo usuário
	        for (int i = 1; i <= numero; i++) {
	            // Estrutura switch que imprime "livre" para números específicos
	            switch (i) {
	                case 1:
	                    System.out.println("1º dia: Livre");
	                    break;
	                case 2:
	                    System.out.println("2º dia: Livre");
	                    break;
	                case 3:
	                    System.out.println("3º dia: Livre");
	                    break;
	                case 4:
	                    System.out.println("4º dia: Livre");
	                    break;
	                case 5:
	                    System.out.println("5º dia: Livre");
	                    break;
	                default:
	                    System.out.println("Dia inválido");
	            }
	        }
	        
	        scanner.close();
	    }
	}
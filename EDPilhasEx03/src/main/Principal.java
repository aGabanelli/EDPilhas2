package main;

import java.util.Scanner;

import controller.FatController;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		FatController fat = new FatController();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número entre 1 e 10");
		int n = scanner.nextInt();
		
		fat.fatorial(n);
		
	}
	
}

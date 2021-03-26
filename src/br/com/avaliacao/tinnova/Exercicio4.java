package br.com.avaliacao.tinnova;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int num = sc.nextInt();
		
		int x = 3;
		int y = 5;
		int soma = 0;

		for(int i=0; i<num; i++){
		    if(i % x==0 || i % y==0){
		        soma += i;
		    }
		}

		System.out.println("A soma dos multiplos de 3 ou 5 abaixo de " + num + " é: " + soma);
		
		sc.close();

	}

}

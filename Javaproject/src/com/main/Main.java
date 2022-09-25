package com.main;

public class Main {

	
	 public static void main(String[] args) {
		 
		 
		 // Mensagem
	        System.out.println("Exercício mensagem");
	        Mensagem.obterMensagem(9);
	        Mensagem.obterMensagem(14);
	        Mensagem.obterMensagem(1);
		 
	     // Empréstimo
	        System.out.println("Exercício empréstimo");
	        emprestimo.calculo(1000, emprestimo.getDuasParcelas());
	        emprestimo.calculo(1000, emprestimo.getTresParcelas());
	        emprestimo.calculo(1000, 5);
	        
	     // Calculadora
	        System.out.println("Exercício calculadora");
	        BasicCalculator.calculadora(3, 6);  
	 }

}

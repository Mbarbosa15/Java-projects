package Main;


import java.util.Scanner;

import entidades.estudante;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			
		
		estudante estudante = new estudante ();
		
		System.out.println("Exiba as notas do ano letivo desse aluno: ");
		
		System.out.print("Nome:" );
		estudante.nome = sc.nextLine();
		
		System.out.print("Nota 1:" );
		estudante.nota1 = sc.nextDouble();
		System.out.print("Nota 2:" );
		estudante.nota2 = sc.nextDouble();
		System.out.print("Nota 3:" );
		estudante.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.printf("A soma das notas foi: %.2f%n" , estudante.finalNota());
		
		if (estudante.finalNota() < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("FALTAM %.2f PONTOS %n",estudante.pontos());
		} else {
			System.out.println("PASSOU");
		}
		sc.close();

	}
	
}

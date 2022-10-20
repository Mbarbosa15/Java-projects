package Main;

import java.util.Scanner;

import entities.salario;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		salario salario = new salario();
		
		System.out.println("Entre com os dados do funcionario ");
		System.out.print("Nome: ");
		salario.nome = sc.nextLine();
		System.out.print("Salario bruto: ");
		salario.salBruto = sc.nextDouble();
		System.out.println("TAXA: ");
		salario.tax = sc.nextInt();

		System.out.println();
		System.out.println("Dados do funcionario:  "  +  salario);
		
		System.out.println();
		System.out.println("Qual a porcentagem a ser adicionada? : ");
		double percentage = sc.nextDouble();
		salario.increaseSalary(percentage);
		System.out.println();
		System.out.println("Atualizando salario: " + salario);
		
		sc.close();
	}

}

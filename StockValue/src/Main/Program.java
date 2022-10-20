package Main;

import java.util.Scanner;

import Entitties.Product;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		
		Product product = new Product();
		System.out.println("Entre com os dados do produto: ");
		System.out.print("Nome: ");
		product.name = sc.nextLine();
		System.out.print("Preço: ");
		product.price = sc.nextDouble();
		System.out.print("Quantidade em estoque:  ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + product );
		
		System.out.println();
		System.out.print("Adicione mais produtos ao estoque: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Atualizando dados.. : " + product);
		
		System.out.println();
		System.out.print("Remova produtos do estoque: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Atualizando dados... : " + product);
		
		
		sc.close();
		
		
		
		

	}

}

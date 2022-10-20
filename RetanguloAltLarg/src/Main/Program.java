package Main;

import java.util.Scanner;

import entities.Retangulo;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		Retangulo x;
		x = new Retangulo ();
		
		
		System.out.println("Entre com as medidas de largura e altura do retangulo: ");
		x.b = sc.nextDouble();
		x.h = sc.nextDouble();
		
		
		double area  = x.area();
		System.out.printf("AREA = %.2f%n"  , area);
		
		double perimetro  = x.perimetro();
		System.out.printf( "PERIMETRO = %.2f%n"  , perimetro);
		
		double diagonal = x.diagonal();
		System.out.printf("DIAGONAL = %.2f%n" , diagonal);
		
		
		sc.close();
	}

}

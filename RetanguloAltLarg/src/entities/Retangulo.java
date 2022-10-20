package entities;

public class Retangulo {
	
	
 public double b;
 public double h; 
 
 public double area () {
	 
	 return b * h;
 }	
 
 public double perimetro () {
	 return 2 * (b + h) ;
	 
 }
 
 public double diagonal () {
	 return Math.sqrt(Math.pow(b, 2) + Math.pow(h, 2));
 }
 
 
}

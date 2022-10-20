package entidades;

public class estudante {
public String nome; 
public double nota1;
public double nota2;
public double nota3;


 public double finalNota () {
	 return nota1 + nota2 + nota3;
 }
 
 public double pontos () {
	 if (finalNota () < 60.0) {
		 return 60.0 - finalNota();
	 } else {
		 return 0.0;
	 }
 }

}


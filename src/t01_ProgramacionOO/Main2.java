package t01_ProgramacionOO;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		System.out.println("----Ingrese el valor del primer n�mero-----");
		int A = lector.nextInt();
		System.out.println("----Ingrese el valor del segundo n�mero-----");
		int B = lector.nextInt();
		if(A%B==0) {
			 System.out.println("***El n�mero "+A+" Es multiplo de "+B+"***");
		
	}else {
		System.out.println("***El n�mero "+A+" No es multiplo de "+B+"***");
	}
		
		System.out.println("***El n�mero "+A+" No es multiplo de "+B+"***");
	
}
} 

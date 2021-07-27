package andres.alberto.asitimbay.pito;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S = 0;
		int P = 0;
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		do {
			System.out.print("Ingrese solo numeros positivos: ");
			if(N%2==0){
				S = S + N;
			}else {
				P = P + N;
			}
		}while(N == -1);
		System.out.print("La suma de numeros positivos es: " + S);
		int p1 = P/N;
		System.out.print("La suma de numeros positivos es: " + p1);
	}

}

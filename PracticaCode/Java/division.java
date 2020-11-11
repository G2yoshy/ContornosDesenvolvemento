import java.util.Scanner;

public class division{
	public static void main(String args[]){
		int numero1;
		int numero2;
		Scanner teclado;
		
		teclado = new Scanner(System.in);
		
		System.out.print("Introduzca un umero enteiro: ");
		numero1 = teclado.nextInt();
		System.out.print("Introduzca un umero enteiro: ");
		numero2 = teclado.nextInt();
		
	System.out.println("A division de " + numero1 + "/" + numero2 + " = " + numero1/numero2);
	}
}
import java.util.Scanner;

public class Fatorial {

	private static Scanner in;

	public static void main(String[] args) {

		long fat = 1;
		in = new Scanner(System.in);

		System.out.println("Digite um n�mero e obtenha o seu fatorial:");
		int num = in.nextInt();
		int numero = num;

		for (; 1 <= num; num--) {
			fat = fat * num;

		}
		System.out.println("O fatorial de " + numero + " � igual a " + fat);

	}

}

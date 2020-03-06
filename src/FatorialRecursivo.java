import java.util.Scanner;

public class FatorialRecursivo {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);

		System.out.println("Digite um número e obtenha seu fatorial:");

		int num = in.nextInt();

		System.out.println(calculaFatorial(num));

	}

	private static int calculaFatorial(int num) {

		if (num <= 1) {

			return 1;

		} else {

			return calculaFatorial(num - 1) * num;
		}

	}

}

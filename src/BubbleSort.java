import java.util.Scanner;

public class BubbleSort {

	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int[] numeros = new int[10];

		System.out.println("Digite 10 valores e obtenha-os em ordem crescente");
		for (int i = 0; i < 10; i++) {

			numeros[i] = in.nextInt();

		}

		for (int i = 0; i < 10; i++) {
			for (int j = i + 1; j < 10; j++) {
				if (numeros[i] > numeros[j]) {
					int aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;

				}

			}

		}

		for (int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}

	}

}

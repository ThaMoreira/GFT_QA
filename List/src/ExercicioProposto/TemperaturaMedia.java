package ExercicioProposto;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Fa�a um programa que receba a temperatura m�dia os 6 primeiros meses do ano e armazene-as em uma lista.
Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as temperaturas acima desta m�dia,
e em que m�s elas ocorreram (mostrar o m�s por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
*/

public class TemperaturaMedia {

	public static void main(String[] args) {

		List<Double> temperatura = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int count = 0;

		while (count < 6) {
			System.out.println("Digite a temperatura: ");
			double temp = sc.nextDouble();
			temperatura.add(temp);
			count++;
		}
		System.out.println("---Temperaturas---"); // exibindo temperaturas
		System.out.println(temperatura);

		double media = temperatura.stream().mapToDouble(Double::doubleValue).average().orElse(0d);
		System.out.printf("\nM�dia das temperaturas: %.1f\n", media);

		// exibindo as temperaturas acima da m�dia
		System.out.print("Temperaturas acima da m�dia: ");
		temperatura.stream().filter(t -> t > media).forEach(t -> System.out.printf("%.1f ", t));

		// exibindo o m�s das temperaturas acima da m�dia por extenso:
		System.out.println("\n\nMeses das temperaturas acima da m�dia: ");
		Iterator<Double> iterator = temperatura.iterator();

		count = 0;
		while (iterator.hasNext()) {
			Double temp = iterator.next();
			if (temp > media) {
				switch (count) {
				case (0):
					System.out.printf("1 - janeiro: %.1f\n ", temp);
					break;
				case (1):
					System.out.printf("2 - fevereiro: %.1f\n", temp);
					break;
				case (2):
					System.out.printf("3 - mar�o: %.1f\n", temp);
					break;
				case (3):
					System.out.printf("4 - abril: %.1f\n", temp);
					break;
				case (4):
					System.out.printf("5 - maio: %.1f\n", temp);
					break;
				case (5):
					System.out.printf("6 - junho: %.1f\n", temp);
					break;
				default:
					System.out.println("N�o houve temperatura acima da m�dia.");
				}
			}
			count++;
		}

	}

}

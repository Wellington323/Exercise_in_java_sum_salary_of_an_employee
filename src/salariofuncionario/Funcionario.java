package salariofuncionario;

import java.util.Locale;
import java.util.Scanner;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String name;

		double salariobruto, acrescimo;
		double tax;

		System.out.println("Nome do funcionario:");
		name = sc.next();

		System.out.println("Salario liquido:");
		salariobruto = sc.nextDouble();

		System.out.println("Acrecimo:");
		acrescimo = sc.nextDouble();

		System.out.println("imposto:");
		tax = sc.nextDouble();

		double novosalario = salariobruto * salariobruto * ((acrescimo / 100 - tax % 10));

		System.out.println(name + " recebera R$ " + novosalario);

		sc.close();

	}

}

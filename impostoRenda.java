
import java.util.Scanner;

public class impostoRenda {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		
		System.out.println("digite o nome do funcionario");
		String nome = dados.next();
		
		System.out.println("digite o seu salario: ");
		double salario = dados.nextDouble();
		
		double imposto = 0.0;
		
		if (salario <= 2000) {
			System.out.println("Isento");
		}
		else if (salario <= 3000) {
			imposto = (salario - 2000 ) * 0.08;
		}
		else if (salario <= 4500 ) {
			imposto = (1000 * 0.08) + ((salario - 3000)* 0.18);
		} else {
			imposto = (1000 * 0.08) + (1500 * 0.18) + ((salario - 4500) * 0.28);
		}
		
		if (imposto > 0 ) {
			System.out.printf("funcionário: %s%nImposto a pagar: R$ %.2f%n" , nome , imposto);
		}
		
		dados.close();

	}

}

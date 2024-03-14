import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int resultado = b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite o numero que deseja saber se Pertence a sequencia de Fibonacci");
		int valor = sc.nextInt();
		while(resultado < valor) {
			resultado = a + b;
			a = b;
			b = resultado;
		}
		if(valor == 0) {
			System.out.println(valor + " é o primeiro número da sequencia de fibonacci");
		}
		else if(resultado == valor) {
			System.out.println(valor + " é um número pertencente a sequencia de Fibonacci");
		}else {
			System.out.println(valor + " não é um número pertencente a sequenca de Fibonacci");
		}
	}

}

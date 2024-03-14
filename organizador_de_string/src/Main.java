import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine(); 
		StringBuilder resultado = new StringBuilder(text.length());
		for(String s : text.split(" ")){
			if (resultado.length() != 0 ) resultado.append(' ');
			for (int x = s.length() - 1; x >=0; x--) {
				resultado.append(s.charAt(x));
			}
		}sc.close();
		System.out.println(resultado);
	}
	

}

import java.util.Scanner;
public class Somatoria {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int i=1, n, mult=1;
		System.out.println("Entre com um número: ");
		n = input.nextInt();
		
		while(i <= n) {
			mult = mult * i;
			i++;
		}
		System.out.println("O fatorial é: "+mult);
		input.close();
	}
}
import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i =1, maior = 0, menor = 0, idade;
		while(i <= 10) {
			System.out.println("Entre com a idade atual:");
			idade = input.nextInt();
			if(idade < 18) {
				System.out.println("Menor de idade");
				menor++;
			}else {
				System.out.println("Maior de idade");
				maior++;
			}
			i++;
		}
		System.out.println("Quantidade de maiores: "+maior);
		System.out.println("Quantidade de menores: "+menor);
		input.close();
	}
}

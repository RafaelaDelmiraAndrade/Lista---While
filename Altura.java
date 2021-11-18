public class Altura {
	public static void main(String[]args) {
		double joao = 134, pedro = 145, i=1;
		
		while(joao < pedro) {
			joao = 2.5 + joao;
			pedro = 2 + pedro;
			
			i = i+ 1;
		}
		System.out.println("Irá demorar: "+i+" anos.");
	}
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Digite o primeiro numero: ");
		  double num1 = scanner.nextDouble();
		 
		 System.out.print("Digite o segundo numero: ");
		  double num2 = scanner.nextDouble();
	
		 System.out.print("Digite o terceiro numero: ");
		  double num3 = scanner.nextDouble();
		 
		 double maior = num1;
		  if (num2 > maior) { 
		     maior = num2;
		 }
		 
		  if (num3 > maior) {
		     maior = num3;
		 }
		 
		 double menor = num1;
		  if (num2 < menor) {
		     menor = num2;
		 }
		 
		  if ( num3 < menor) {
		     menor = num3;
		 }
		 
		 double media = (num1 + num2 + num3) / 3;
		 
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		System.out.println("A média aritmética é: " + media);
		
		scanner.close();
	}
}

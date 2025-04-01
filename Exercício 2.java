import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Digite o valor da compra: R$ ");
          double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor pago: R$ ");
         double valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("Valor pago insuficiente para a compra.");
        } else {
            double troco = valorPago - valorCompra;
            System.out.printf("Troco: R$ %.2f%n", troco);

            int notas50 = (int) (troco / 50);
            troco = troco % 50;

            int notas20 = (int) (troco / 20);
            troco = troco % 20;

            int notas10 = (int) (troco / 10);
            troco = troco % 10;

            int notas5 = (int) (troco / 5);
            troco = troco % 5;

            int notas2 = (int) (troco / 2);
            troco = troco % 2;

            int notas1 = (int) (troco / 1);
            troco = troco % 1;

          System.out.println("Notas de R$ 50,00: " + notas50);
          System.out.println("Notas de R$ 20,00: " + notas20);
          System.out.println("Notas de R$ 10,00: " + notas10);
          System.out.println("Notas de R$ 5,00: " + notas5);
          System.out.println("Notas de R$ 2,00: " + notas2);
          System.out.println("Notas de R$ 1,00: " + notas1);
        }
		scanner.close();
	}
}

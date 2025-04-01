import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código da operação (1, 2 ou 3): ");
        int operacao = scanner.nextInt();

        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        final double PI = 3.141592;

        if (operacao == 1) {
            double perimetro = 2 * PI * raio;
            System.out.printf("Perímetro do círculo: %.2f\n", perimetro);
        } else if (operacao == 2) {
            double area = PI * Math.pow(raio, 2);
            System.out.printf("Área do círculo: %.2f\n", area);
        } else if (operacao == 3) {
            double volume = (4.0 / 3.0) * PI * Math.pow(raio, 3);
            System.out.printf("Volume da esfera: %.2f\n", volume);
        } else {
            System.out.println("Código da operação inválido.");
        }

        scanner.close();
	}
}

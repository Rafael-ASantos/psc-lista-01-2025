import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite o símbolo da operação (+, -, *, /, ^): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    operacaoValida = false;
                    System.out.println("Erro: Divisão por zero.");
                }
                break;
            case '^':
                resultado = Math.pow(num1, num2);
                break;
            default:
                operacaoValida = false;
                System.out.println("Erro: Símbolo da operação inválido.");
        }

        if (operacaoValida) {
            System.out.printf("Resultado: %.2f\n", resultado);
        }

        scanner.close();
	}
}

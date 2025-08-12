import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcDesconto {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double preco, desconto, ValorFinal = 0.0;

        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();

        while (true) {
            try {
                System.out.println("Digite o Preço do produto: ");
                preco = sc.nextDouble();

                System.out.println("Desconto do produto: ");
                desconto = sc.nextDouble();

                ValorFinal = preco - (preco * (desconto / 100));

                break;
            }
            catch (InputMismatchException e){
                System.out.println("Erro! digite apenas números...");
                sc.nextLine();
            }
        }
        System.out.println("\n---Resumo---");
        System.out.printf("Produto: %s%n", nome);
        System.out.printf("Preço original: R$ %.2f%n", preco);
        System.out.printf("Desconto: %.0f%%%n", desconto);
        System.out.printf("Preço final: R$ %.2f%n", ValorFinal);


        sc.close();
    }
}

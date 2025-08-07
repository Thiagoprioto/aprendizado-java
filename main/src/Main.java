import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número que deseja ver a tabuada:");
        int numero = scanner.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(
                    numero + "x" + i + "=" + (numero * i)
            );
        }
        scanner.close();


    }
}
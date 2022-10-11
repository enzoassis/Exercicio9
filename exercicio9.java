import java.util.Scanner;

public class exercicio9 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura que gostaria de converter de Fahrenheit para Celsius: ");
        float temperatura = scan.nextFloat();

        float celsius = 5 * ((temperatura - 32) / 9);

        System.out.println("O valor convertido de Fahrenheit para celsius é de " + celsius + "°C");
        scan.close();
    }
}

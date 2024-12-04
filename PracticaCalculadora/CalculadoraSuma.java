import java.util.Scanner;
public class CalculadoraSuma{
    public static void main(String[] args) {
        int num1, num2;
        float suma;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Introduce numero 1: ");
            num1= in.nextInt();

        System.out.print("Introduce numero 2: ");
            num2 = in.nextInt();

        suma = num1 + num2;

        System.out.println("El resultadoe es: "+suma);

        in.close();

    }
}
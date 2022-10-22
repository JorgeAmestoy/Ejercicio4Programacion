import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int billetes100, billetes20, billetes5, monedasDeUnEuro, cantidadeTotal;

        Scanner obxDiñeiro = new Scanner(System.in);
        System.out.println("Teclea billetes de 100:");
        billetes100 = obxDiñeiro.nextInt();
        System.out.println("Teclea billetes de 20:");
        billetes20 = obxDiñeiro.nextInt();
        System.out.println("Teclea billetes de 5:");
        billetes5 = obxDiñeiro.nextInt();
        System.out.println("Teclea monedas de 1 euro:");
        monedasDeUnEuro = obxDiñeiro.nextInt();

        cantidadeTotal = (billetes100*100)+(billetes20*20)+(billetes5*5)+monedasDeUnEuro;
        System.out.println ("En total son " +cantidadeTotal+ " euros");


    }
}
import java.util.Scanner;

public class simulado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nomeCliente;
        double valorCompra, valorPago, troco = 0;

        System.out.println("--- CAIXA ---");

        System.out.println("Cliente: ");
        nomeCliente = teclado.nextLine();
        System.out.println("Valor da compra: ");
        valorCompra = teclado.nextInt();
        System.out.println("Valor pago: ");
        valorPago = teclado.nextInt();

        if (valorPago >= valorCompra) {
            troco = valorPago - valorCompra;
            System.out.println("--- Nota fiscal ---");
            System.out.println("Cliente: " + nomeCliente);
            System.out.println("Valor total da compra: R$ " + valorCompra);
            System.out.println("Valor pago: R$ " + valorPago);
            System.out.println("Troco: R$ " + troco);
            System.out.println("-------------------");
        } else {
            System.out.println("Valor insuficiente! Vai ter que lavar prato hahahaha");
        }

        teclado.close();
    }
}

package program;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Product product = new Product();

        //parte de input de dados dos produtos
        System.out.println("Coloque os dados do produto: ");
        System.out.print("Nome do produto: ");
        product.name = sc.nextLine();
        System.out.print("Preco do produto: ");
        product.price = sc.nextDouble();
        System.out.print("Quantidade do produto: ");
        product.quantity = sc.nextInt();

        System.out.println();
        System.out.println("Product Data:" + product);

        //adiciona produtos
        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated Data:" + product);

        //Remove produtos
        System.out.println();
        System.out.println("Enter the number of products to be removed from stock:");
        int quantityToRemove = sc.nextInt();
        product.removeProducts(quantityToRemove);


        System.out.println();
        System.out.println("Updated Data:" + product);




        sc.close();
    }

}

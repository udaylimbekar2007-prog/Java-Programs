import java.util.Scanner;

class shoppingcart {
  public static void main(String[] args) {

    // SHOPPING CART PROGRAM

    Scanner scanner = new Scanner(System.in);

    String item;
    double price;
    int quantity;
    char currency = '$';
    double total;

    System.out.print("What item would you like to buy?: ");
    item = scanner.nextLine();

    System.out.print("How much does it cost?: ");
    price = scanner.nextDouble();

    System.out.print("How many would you like to buy?: ");
    quantity = scanner.nextInt();

    total = price * quantity;

    System.out.println("\n you have bought " + quantity + " " + item + "/s");
    System.out.print("the total cost is " + currency + total); 

    scanner.close();
  }
}
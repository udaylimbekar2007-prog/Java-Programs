import java.util.Scanner;

class arithmetic {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Arithmetic Operators : 

    int x = 10;
    int y = 5;
    int z;

    z = x + y;
    z = x - y;
    z = x*y;
    z = x/y;
    z = x%y;

    System.out.println(z);

    // Augmented Assignment Operators : 

    x += y;
    x -= y;
    x *= y;
    x /= y;
    x %= y;

    System.out.println(x);

    // Increment and Decrement Operators : 

    x++; // for increment
    x--; // to decrement
    System.out.println(x);

    // Order Of Operations [P-E-M-D-A-S] : 

    double result = 3 + 4 * (7-5) / 2.0;
    System.out.println(result); 

    scanner.close();
  }  
}

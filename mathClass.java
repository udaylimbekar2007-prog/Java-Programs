import java.util.Scanner;

class mathClass 
{
  public static void main(String[] args) {

    System.out.println(Math.PI);
    System.out.println(Math.E);

    double result;

    result = Math.pow(4, 2);
    result = Math.abs(-5);
    result = Math.sqrt(16);
    result = Math.round(3.14);
    result = Math.ceil(3.14);
    result = Math.floor(3.92);
    result = Math.max(10, 20);
    result = Math.min(15, 8);

    System.out.println(result);
    
    // SOME SMALL EXERCISES : 
    // 1. HYPOTENUSE c = Math.sqrt(a^2 + b^2) 
    Scanner scanner = new Scanner(System.in);

    double a;
    double b;
    double c;

    System.out.print("Enter the length of side A: ");
    a = scanner.nextDouble();

    System.out.print("Eneter the length of side B: ");
    b = scanner.nextDouble();

    c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.print("The Hypotenuse (side c) is: " + c + "cm");

    //2.
    // circumference = 2 * Math.PI * radius
    // area = Math.PI * Math.pow(radius, 2)
    // volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)

    double radius;
    double circumference;
    double area;
    double volume;

    System.out.print("Enter the radius: ");
    radius = scanner.nextDouble();

    circumference = 2 * Math.PI * radius;
    System.out.printf("\n The circumference of the circle is: %.4f cm", circumference);

    area = Math.PI * Math.pow(radius, 2);
    System.out.printf("\n The area of the circle is: %.4f cm^2", area);

    volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    System.out.printf("\n The volume of the circle is: %.4f cm^3", volume);

    scanner.close();
  }
}
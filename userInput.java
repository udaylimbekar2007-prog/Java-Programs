import java.util.Scanner;

public class userInput {
  public static void main(String[] arg) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("enter you name: ");
    String name = scanner.nextLine();
    System.out.println("Hello " + name);

    System.out.print("enter you age: ");
    int Age = scanner.nextInt();
    System.out.println("you age is " + Age);

    System.out.print("enter you height: ");
    double height = scanner.nextDouble();
    System.out.println("you height is " + height  + " cm");

    System.out.print("are you a student: ");
    boolean isStudent = scanner.nextBoolean();
    System.out.println(isStudent);

    // common issues : 

    System.out.print("enter your age: ");
    int AGE = scanner.nextInt();
    System.out.println("you are " + AGE + " years old");

    System.out.print("enter your favourite color: ");
    String color = scanner.nextLine();
    System.out.println("your favourite color is " + color);

    // to over come the aobve issue : 

    System.out.print("enter your age: ");
    int age = scanner.nextInt();
    System.out.println("you are " + age + " years old");
    scanner.nextLine(); // use this so it doesnt take the nextline as its input that is the age in this case 

    System.out.print("enter your favourite color: ");
    String colors = scanner.nextLine();
    System.out.println("your favourite color is " + colors);

  }
} 

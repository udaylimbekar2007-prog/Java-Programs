import java.util.Scanner;

class conditionalstatements {
  public static void main(String[] args) {

    // if statement = performs a block of code if its condition evaluates to true

    Scanner scanner = new Scanner(System.in);

    String name;
    int age;

    System.out.print("enter your name: ");
    name = scanner.nextLine();

    System.out.print("enter your age: ");
    age = scanner.nextInt();

    if(name.isEmpty()) {
      System.out.println("Please enter your name.");
    }
    else {
      System.out.println("Hello " + name + "!");
    }

    if(age >= 18) {
      System.out.println("You are eligible to apply for your voter id.");
    }
    else if(age <= 0) {
      System.out.println("Please enter a valid age.");
    }
    else{
      System.out.println("You are not eligible to apply for your voter id.");
    }
    scanner.close();
  }
}
class printf {
  public static void main(String[] args) {

    // printf() = is a method used to format output 
    // %[flags][width][.precision][specifier-character]

    String name = "Uday";
    char firstLetter = 's';
    int age = 24;
    double weight = 70;
    boolean isEmployee = true; 

    System.out.printf("hello %s\n", name);
    System.out.printf("the first letter of your name is %c\n", firstLetter);
    System.out.printf("you are %d years old\n", age);
    System.out.printf("i am %f kilograms\n", weight);
    System.out.printf("employed: %b\n", isEmployee);

    System.out.printf("%s is %d years old.\n", name, age);

    // [flags] 
    // 1. + = output a plus 
    // 2. , = comma grouping separator
    // 3. ( = negative numbers are enclosed in ()
    // 4. space = display a minus if negative, space if positive  

    double price1 = 9.99;
    double price2 = 100.15;
    double price3 = -54.01;

    System.out.printf("%+.2f\n", price1);
    System.out.printf("%+.2f\n", price2);
    System.out.printf("%+.2f\n", price3);

    double price4 = 9000.99;
    double price5 = 100000.15;
    double price6 = -54000.01;

    System.out.printf("%,.2f\n", price4);
    System.out.printf("%,.2f\n", price5);
    System.out.printf("%,.2f\n", price6);

    double price7 = 9.99;
    double price8 = 100.15;
    double price9 = -54.01;

    System.out.printf("%(.2f\n", price7);
    System.out.printf("%(.2f\n", price8);
    System.out.printf("%(.2f\n", price9);

    double price10 = 9.99;
    double price11 = 100.15;
    double price12 = -54.01;

    System.out.printf("% .2f\n", price10);
    System.out.printf("% .2f\n", price11);
    System.out.printf("% .2f\n", price12);

    // [width]
    // 1. 0 = zero padding 
    // 2. number = right justified padding 
    // 3. neagtive number = left justified padding 

    int id1 = 1;
    int id2 = 23;
    int id3 = 456;
    int id4 = 7890;

    System.out.printf("%04d\n", id1);
    System.out.printf("%04d\n", id2);
    System.out.printf("%04d\n", id3);
    System.out.printf("%04d\n", id4);

    int id5 = 1;
    int id6 = 23;
    int id7 = 456;
    int id8 = 7890;

    System.out.printf("%4d\n", id5);
    System.out.printf("%4d\n", id6);
    System.out.printf("%4d\n", id7);
    System.out.printf("%4d\n", id8);

    int id9 = 1;
    int id10 = 23;
    int id11 = 456;
    int id12 = 7890;

    System.out.printf("%-4d\n", id9);
    System.out.printf("%-4d\n", id10);
    System.out.printf("%-4d\n", id11);
    System.out.printf("%-4d\n", id12);
  }  
}

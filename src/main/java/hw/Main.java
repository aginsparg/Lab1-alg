package hw;


public class Main {

  public static void main(final String[] args) {
    int max = 0;
    if (args.length > 0) {
      try {
        max = Integer.parseInt(args[0]);
      } catch (NumberFormatException e) {
        System.err.println("The argument entered must be an integer ");}

        for (int i = 1; i <= max; i++) {
          if (i % 3 == 0)
            System.out.print("fizz");
          if (i % 5 == 0)
            System.out.print("buzz");
          if ((i % 3 != 0) && (i % 5 != 0))
            System.out.print(i);
          System.out.println();
        }
      }
    }
  }

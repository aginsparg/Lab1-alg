package hw;

public class fizzBuzz {

  public static String[] fizzBuzzArray(int n) {
    String[]fizzbuzz = new String[n];
    int b=0;
    for (int i = 1; i <= n; i++) {
      if((i % 3 == 0) && (i % 5 == 0))
        fizzbuzz[b] = ("fizz buzz");
      else if (i % 3 == 0)
        fizzbuzz[b] = ("fizz");
      else if (i % 5 == 0)
        fizzbuzz[b] = ("buzz");
      else
        fizzbuzz[b] = Integer.toString(i);
      b++;
    }
    return fizzbuzz;
  }
}
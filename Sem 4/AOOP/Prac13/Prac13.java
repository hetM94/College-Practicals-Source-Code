import java.util.Scanner;

class Prac13 {

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String s1 = scanner.nextLine();
    int a = 5;

    System.out.println("Character at index 3: " + s1.charAt(3));
    //String Split Splits Based on Spaces :-
    String[] splited = s1.split("\\s");
    for (String w : splited) {
      System.out.println(w);
    }
    System.out.println("Does string has char W ? " + s1.contains("W"));
    System.out.println(
      String.format("Printing value of a using string format: %d", a)
    );
    System.out.println("Length of the string: " + s1.length());

    System.out.println("\n\n\nExtras");
    //Extras :-
    System.out.println("Before trim length:" + s1.length());
    s1 = s1.trim();
    System.out.println("After trim length:" + s1.length());

    System.out.println("Substring from index 3 to 6: " + s1.substring(3, 6));
    System.out.println("First occurance of l is at: " + s1.indexOf("l"));
    System.out.println("String to Upper: " + s1.toUpperCase());
    System.out.println("String to Lower: " + s1.toLowerCase());

    System.out.print("Enter 2nd string: ");
    String s2 = scanner.nextLine();
    System.out.println("Are both string same? " + s1.equals(s2));
    System.out.println(
      "Are both string same ignoring case? " + s1.equalsIgnoreCase(s2)
    );
    System.out.println("Comparing both string: " + s1.compareTo(s2));
  }
}

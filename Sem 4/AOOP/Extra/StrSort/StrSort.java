import java.util.Scanner;

public class StrSort {

  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);

    System.out.print("Enter String: ");
    String unsorted = scanner.nextLine();
    unsorted = unsorted.trim();
    System.out.println("Original String: " + unsorted);
    String sorted = bubbleSort(unsorted);
    System.out.println("Sorted String: " + sorted);
  }

  public static String bubbleSort(String str) {
    char[] charArray = str.toCharArray();
    int n = charArray.length;
    boolean swapped;

    do {
      swapped = false;
      for (int i = 1; i < n; i++) {
        if (Character.valueOf(charArray[i - 1]).compareTo(charArray[i]) > 0) {
          char temp = charArray[i - 1];
          charArray[i - 1] = charArray[i];
          charArray[i] = temp;
          swapped = true;
        }
      }
    } while (swapped);
    return new String(charArray);
  }
}

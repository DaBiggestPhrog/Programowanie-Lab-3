import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // zapytanie o znak
    System.out.print("Podaj znak: ");
    char znak = scanner.next().charAt(0);

    // zapytanie o rozmiar
    System.out.print("Podaj rozmiar: ");
    int rozmiar = scanner.nextInt();

    // rysowanie
    for (int i = 0; i < rozmiar; i++) {
      for (int j = 0; j < rozmiar; j++) {
        System.out.print(znak + " ");
      }
      System.out.println();
    }
  }
}
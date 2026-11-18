import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Etunimesi?");
        String etunimi = input.nextLine();

        System.out.print("Sukunimesi?");
        String sukunimi = input.nextLine();

        System.out.print("Yrityksen verkkotunnus?");
        String verkkotunnus = input.nextLine();

        if (etunimi.isEmpty() || sukunimi.isEmpty() || verkkotunnus.isEmpty()) {
            System.out.println("Virhe! Jokin tiedoista puuttui.");
            if (etunimi.isEmpty()) {
                System.out.println("Käyttäjä ei antanut tietoa etunimi.");
            } else if (sukunimi.isEmpty()) {
                System.out.println("Käyttäjä ei kirjoittanut sukunimeä.");
            } else if (verkkotunnus.isEmpty()) {
                System.out.println("Käyttäjä ei kirjoittanut verkkotunnusta.");
            }
        } else {
            GenerateEmail(etunimi, sukunimi, verkkotunnus);
            GenerateUsername(etunimi, sukunimi);
        }

        input.close();
    }

    public static void GenerateEmail(String etunimi, String sukunimi, String verkkotunnus) {
        String email = (etunimi + "." + sukunimi + "@" + verkkotunnus).toLowerCase();
        System.out.println(email);
    }

    public static void GenerateUsername(String etunimi, String sukunimi) {
        String username = (etunimi.substring(0, 4) + sukunimi.substring(sukunimi.length() - 4)).toLowerCase();
        System.out.println(username);
    }
}
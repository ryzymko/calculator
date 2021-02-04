package pl.wojciechwojdyla;

public class Main {

    public static void main(String[] args) {
        String firstName = "Jan";
        String lastName = "Kowalski";
        int age = 25;
        double height = 180;
        String pesel = "1234567890";

        System.out.println(firstName+ " " +lastName+ " ma " +age+ " lat");
        System.out.println("Pan " +lastName+" ma pesel " +pesel);
        System.out.println(firstName + " ma wzrost "+height+ "cm");
        System.out.println("Jeżeli " +firstName+ " urośnie o 5cm, to będzie miał " +(height+5)+ "cm");

        firstName = "Krzysztof";
        System.out.println("Imię po zmianie to: " +firstName);
    }
}

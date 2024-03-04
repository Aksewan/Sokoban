import java.util.Scanner;

class Essai_Scanner {
    public static void main(String [] args) {
        Scanner my_scanner;
        String ligne;

        my_scanner = new Scanner(System.in);
        System.out.println("Saisissez une ligne");
        ligne = my_scanner.nextLine();
        System.out.println("Vous avez saisi la ligne : " + ligne);
    }
}
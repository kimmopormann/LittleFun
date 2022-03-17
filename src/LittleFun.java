import java.util.Scanner;

public class LittleFun extends RPC {

    public static void main(String[] args) {

        int secretNumber;
        int guess;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Olen sinu väike sõbrake ja me võiksime natuke lõbutseda" + "\n");
        System.out.println("Mis on su nimi?");
        String nimi = keyboard.nextLine();
        System.out.println("Tere " + nimi + ", minu nimi on Kimmo ");
        System.out.println("Kuidas ennast hetkel tunned?");
        String tunne = keyboard.nextLine();
        System.out.println("Kui " + tunne + ", siis " + tunne);
        System.out.println("Aga võiks natuke mängida");
        System.out.println("Esimene mäng on salajase numbri äraarvamise mäng" + "\n");

        System.out.println("Sisesta see number, mis vahemikus numbrit soovid arvata: (nt 1 ja 50 vahelist numbrit, siis vali 50)");
        int b = keyboard.nextInt();
        secretNumber = (int) (Math.random() * b + 1);

        do {

            System.out.println("Proovi arvata salajane number: ");

            guess = keyboard.nextInt();

            if (guess == secretNumber)

                System.out.println("Palju õnne! " + secretNumber + " on õige vastus");


            else if (guess < secretNumber)

                System.out.println("Salajane number on suurem sinu pakutud numbrist");

            else if (guess > secretNumber)

                System.out.println("Salajane number on väiksem sinu pakutud numbrist");

        } while (guess != secretNumber);
        System.out.println(" ");
        System.out.println("Aga nüüd võiks kivi, paber, käärid mängida");
        play();
        while (playAgain()) {
            play();
        }


    }
}
import java.util.Random;
import java.util.Scanner;


class RPC {

    public static Scanner sc = new Scanner(System.in);
    public static int score = 0;
    public static int gameCount = 0;

    public static void main(String[] args) {
        play();
        while (playAgain()) {
            play();
        }
    }

    public static void play() {
        String computer = computerChoice();
        String user = userChoice();
        determineWinner(computer, user);
    }

    public static String computerChoice() {
        Random rand = new Random();
        int cinput = rand.nextInt(3) + 1;
        String computer = "thing";
        if (cinput == 1)
            computer = "kivi";
        if (cinput == 2)
            computer = "paber";
        if (cinput == 3)
            computer = "käärid";
        return computer;
    }

    public static boolean playAgain() {
        System.out.println("Mängime veel?(y/n)");
        String input = sc.nextLine();
        if (input.toLowerCase().equals("y")) {
            return true;
        } else if (input.toLowerCase().equals("n")) {
            return false;
        } else {
            System.out.println("Vale valik, saad sisestada ainult y (jah) või n (ei)");
            return playAgain();
        }

    }

    public static String userChoice() {
        System.out.println("* KIVI PABER KÄÄRID * " + "\n" + "\t");
        String user = "default";
        do {
            System.out.println("Tee oma valik! kivi, paber või käärid?");
            user = sc.nextLine();
        } while (!isValidChoice(user));
        return user;
    }

    public static boolean isValidChoice(String choice) {
        boolean status;
        if (choice.equals("kivi"))
            status = true;
        else if (choice.equals("paber"))
            status = true;
        else if (choice.equals("käärid"))
            status = true;
        else {
            status = false;
            System.out.println("Error! Saad valida AINULT kas kivi, paber või käärid");
        }

        return status;
    }

    public static void determineWinner(String computer, String user) {
        gameCount++;
        System.out.println(" Minu valik: " + computer);
        System.out.println("Sinu valik : " + user);

        if (computer.equals("kivi") && user.equals("käärid")
                || computer.equals("käärid") && user.equals("paber")
                || (computer.equals("paber") && user.equals("kivi"))) {
            score--;
            System.out.println(" Mina võitsin! ");

        } else if (computer.equals(user)) {
            System.out.println(" VIIK ! ");

        } else {
            score++;
            System.out.println(" Sina võitsid !");
        }

        System.out.println("Oleme mänginud " + gameCount + " korda ja sul on " + score + " punkti");
        return;
    }

}

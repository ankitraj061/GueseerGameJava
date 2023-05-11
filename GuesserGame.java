import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessingNum() {
        System.out.println("Guesser! please enter a number");
        Scanner scan = new Scanner(System.in);
        guessNum = scan.nextInt();
        if (guessNum >= 0 && guessNum <= 20) {
            System.out.println();
            System.out.println("Hint: The number is between 0 to 20");

        } else if (guessNum >= 21 && guessNum <= 40) {
            System.out.println();
            System.out.println("Hint: The number is between 21 to 40");
        } else if (guessNum >= 41 && guessNum <= 60) {
            System.out.println();
            System.out.println("Hint: The number is between 41 to 60");
        } else if (guessNum >= 61 && guessNum <= 80) {
            System.out.println();
            System.out.println("Hint: The number is between 61 to 80");
        } else if (guessNum >= 81 && guessNum <= 100) {
            System.out.println();
            System.out.println("Hint: The number is between 81 to 100");
        } else {
            System.out.println();
            System.out.println("Hint: The number is above 100");
        }
        return guessNum;

    }

}

class Player {
    int player1Num, player2Num, player3Num;

    int p1() {
        System.out.println("Player1!enter your number:");
        Scanner scan = new Scanner(System.in);
        player1Num = scan.nextInt();
        return player1Num;

    }

    int p2() {
        System.out.println("Player2!enter your number:");
        Scanner scan = new Scanner(System.in);
        player2Num = scan.nextInt();
        return player2Num;

    }

    int p3() {
        System.out.println("Player3!enter your number:");
        Scanner scan = new Scanner(System.in);
        player3Num = scan.nextInt();
        return player3Num;

    }
}

class Umpire {
    int gNum, player1, player2, player3;

    void takeGuesserNum() {
        Guesser obj1 = new Guesser();
        gNum = obj1.guessingNum();

    }

    void takePlayerNum() {
        Player obj2 = new Player();
        player1 = obj2.p1();
        player2 = obj2.p2();
        player3 = obj2.p3();
    }

    void compare() {
        if (gNum == player1) {
            if (gNum != player2 && gNum != player3) {
                System.out.println("player1 : won the game ");
            } else if (gNum != player2 && gNum == player3) {
                System.out.println("player1 and player3: both won the game ");
            } else if (gNum == player2 && gNum != player3) {
                System.out.println("player1 and player2: both won the game ");
            } else {
                System.out.println("All had guessed corect number so match tied ");
                System.out.println();
                System.out.println("will player's want to play again if yes then write below 'yes' or you can quit! ");
                Scanner scan = new Scanner(System.in);
                String yes = scan.next();
                if (yes.equals("yes")) {
                    Umpire obj3 = new Umpire();
                    obj3.takeGuesserNum();
                    obj3.takePlayerNum();
                    obj3.compare();
                } else {
                    System.out.println();
                    System.out.println("sorry! you had entered wrong charecter");
                    System.out.println("If you really want to play write below 'yes'");
                    String no = scan.next();
                    if (no.equals("yes")) {
                        Umpire obj3 = new Umpire();
                        obj3.takeGuesserNum();
                        obj3.takePlayerNum();
                        obj3.compare();
                    } else {
                        System.out.println("you had crossed your limit");
                    }
                }
            }
        } else if (gNum == player2) {
            if (gNum == player3) {
                System.out.println("player2 and player3: both won the game ");
            } else {
                System.out.println("player2: won the game");
            }
        } else if (gNum == player3) {
            System.out.println("player3: won the game");
        } else {
            System.out.println("All had guessed wrong number so match tied");
            System.out.println();
            System.out.println("will player's want to play again if yes then write below 'yes' or you can quit! ");
            Scanner scan = new Scanner(System.in);
            String yes = scan.next();
            if (yes.equals("yes")) {
                Umpire obj3 = new Umpire();
                obj3.takeGuesserNum();
                obj3.takePlayerNum();
                obj3.compare();
            } else {
                System.out.println();
                System.out.println("sorry! you had entered wrong charecter");
                System.out.println("If you really want to play write below 'yes'");
                String no = scan.next();
                if (no.equals("yes")) {
                    Umpire obj3 = new Umpire();
                    obj3.takeGuesserNum();
                    obj3.takePlayerNum();
                    obj3.compare();
                } else {
                    System.out.println("you had crossed your limit");
                }
            }
        }

    }
}

public class GuesserGame {
    public static void main(String[] args) {
        System.out.println("GuesserGame started!");
        Umpire obj4 = new Umpire();
        obj4.takeGuesserNum();
        obj4.takePlayerNum();
        obj4.compare();
        System.out.println();
        System.out.println("thankyou for participating!");
    }

}

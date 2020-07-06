import java.util.Scanner;

/**
 * The main class for running our question game.
 */
public class QuestionGame {

  public static void main(String[] args) {
    IKNugget Atree = new Question("Does it have a horn?",
        new Question("Is it magical?", new Thing("a unicorn"), new Thing("a car")),
        new Question("Is it frozen?", new Thing("ice cream"), new Thing("a computer")));

    Scanner sc = new Scanner(System.in);
    System.out.println("Play a game? (yes/no)");
    String resp = sc.nextLine();

    while (StringUtils.isYesResponse(resp)) {
      System.out.println("I'll try to guess what you are thinking of!");
      Atree = Atree.askAndLearn(sc);
      System.out.println("Play again? (yes/no)");
      resp = sc.nextLine();
    }

  }
}

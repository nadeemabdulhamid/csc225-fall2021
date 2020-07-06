import java.util.Scanner;

/** 
 * Represents an object that is known about by the computer.
 */
class Thing implements IKNugget {
  String name;

  public Thing(String name) {
    this.name = name;
  }

  /*
   * Ask if the thing is 'this' one. If it is not, ask what the thing is and then
   * obtain information to build a new question branch that distinguishes 'this'
   * thing from the heretofore unknown thing.
   */
  public IKNugget askAndLearn(Scanner input) {
    System.out.println("Is it " + this.name + "? (yes/no)");
    String resp = input.nextLine();
    if (StringUtils.isYesResponse(resp)) {
      System.out.println("I guessed it!");
      return this; // `this` Thing object is produced, unchanged
    } else {
      System.out.println("Darn. I give up. What were you thinking of?");
      String newThingName = input.nextLine();
      System.out.println("What question would distinguish " + this.name + " from " + newThingName
          + "?\n(The 'yes' answer to the question should be " + this.name + ".)");
      String newQuestion = input.nextLine();
      return new Question(newQuestion, new Thing(this.name), new Thing(newThingName));
    }
  }
}
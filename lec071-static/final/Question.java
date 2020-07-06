import java.util.Scanner;

/** Represents an internal question branch in a binary decision tree */
class Question implements IKNugget {
  String question;
  IKNugget yes;
  IKNugget no;

  public Question(String question, IKNugget yes, IKNugget no) {
    this.question = question;
    this.yes = yes;
    this.no = no;
  }

  /*
   * Ask the question and continue on down the appropriate branch of the decision
   * tree based on the yes/no response. The tree from this point is reconstructed
   * and returned, just in case a subtree was extended with new knowledge.
   */
  public IKNugget askAndLearn(Scanner input) {
    System.out.println(question + " (yes/no)");
    String resp = input.nextLine().toLowerCase();
    if (StringUtils.isYesResponse(resp)) {
      return new Question(this.question, this.yes.askAndLearn(input), this.no);
    } else {
      return new Question(this.question, this.yes, this.no.askAndLearn(input));
    }
  }

}
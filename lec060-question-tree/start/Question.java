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
}
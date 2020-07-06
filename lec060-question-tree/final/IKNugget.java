import java.util.Scanner;

/**
 * Represents a knowledge node in a binary decision tree.
 */
interface IKNugget {
  /**
   * Ask questions to identify a thing. In the event that the thing is not
   * correctly identified, produce a new tree that has been extended with an
   * appropriate question to distingish the newly discovered thing from existing
   * things.
   */
  public IKNugget askAndLearn(Scanner input);
}

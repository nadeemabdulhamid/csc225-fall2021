public class Player {
  private String name;
  private Player next;  // the players sitting in the immediate "forward" and
  private Player prev;  // "reverse" directions of this player
  /* a real implementation would
   * have more fields to keep track
   * of here...
   */
  
  // direction of play is "forward" if true; "reverse" if false
  private static boolean playForward = true;  // initially set to 'true' 
  // ^^^
  // This is a 'static' field in Java -- meaning it is __SHARED__
  //   by all instances of this class
  // So it is kind of like a 'global' variable, but since it is 'private',
  //   it can only be accessed from within the Player class
  // These are also known as "class variables":
  //   https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html


  // set up this player as the only one in the game initially
  public Player(String name) {
    this.name = name;
    this.next = this;
    this.prev = this;
  }
  
  // set up this player as coming right after the given 'prev' player
  // in the normal ("forward") direction of game play
  public Player(String name, Player prev) {
    this.name = name;
    // ******************** TODO ********************************
    //  finish setting up the links (draw a picture!!!)
  }
  
  // produce the name of this player
  public String getName() {
    return this.name;
  }
  
  // play the given card by this player.
  // return the player whose turn it is next
  public Player playCard(ICard c) {
    return c.applyTo(this);
  }

  // produce a comma-separated string of all the player's names in the 
  // game, starting from this player
  public String allNames() {
    String names = this.getName();
    // ******************** TODO ********************************
    return names;
  }

  
  // produce the player sitting next to this player 
  // *** in the current direction of the game play
  public Player nextPlayer() {
    // ******************** TODO ********************************
    return this;
  }


  // skip a player and produce the player that comes after
  // the skipped player in the current direction of the
  // game play
  public Player skipPlayer() {
    // ******************** TODO ********************************
    return this;
  }


  // reverse the direction of game play and produce the 
  // player who turn it is next based on that reversed direction
  public Player reversePlay() {
    // ******************** TODO ********************************
    return this;
  }


  // remove this player from the list of players
  // produce the player that would play after them
  public Player leaveGame() {
    // ******************** TODO ********************************
    return this;
  }

}

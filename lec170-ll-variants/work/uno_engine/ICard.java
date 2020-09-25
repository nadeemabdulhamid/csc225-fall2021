public interface ICard {
  // carries out the effect of this card on the given player
  // and returns the player whose turn it is next
  Player applyTo(Player p);
}

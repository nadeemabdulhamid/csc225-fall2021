package lec12_generics_starter;

public class FactNode {
  Fact data;
  FactNode next;

  public FactNode(Fact data, FactNode next) {
    this.data = data;
    this.next = next;
  }
}
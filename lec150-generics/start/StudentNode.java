package lec12_generics_starter;

public class StudentNode {
  Student data;  
  StudentNode next;

  public StudentNode(Student data, StudentNode next) {
    this.data = data;
    this.next = next;
  }
}

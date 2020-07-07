package lec12_generics_starter;

public class Student {
  private String name;
  private double gpa;
  
  public Student(String name, double gpa) {
    this.name = name;
    this.gpa = gpa;
  }
  
  public boolean hasName(String n) {
    return this.name.equals(n);
  }

  public String getName() {
    return name;
  }
}

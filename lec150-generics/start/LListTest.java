package lec12_generics_starter;

import static org.junit.Assert.*;

import org.junit.Test;

public class LListTest {

  @Test
  public void test() {
    /*
    LList<Fact> facts = new LList<Fact>();
    facts.addToFront(new Fact("plants", "need", "the sun"));
    facts.addToFront(new Fact("cars", "run on", "fuel"));
    facts.addToFront(new Fact("rabbits", "like", "carrots"));
    assertEquals(3, facts.length());
    
    LList<Student> stus = new LList<Student>();
    stus.addToFront(new Student("Alice", 3.75));
    stus.addToFront(new Student("Bob", 3.2));
    stus.addToFront(new Student("Chan", 2.8));
    stus.addToFront(new Student("Dee", 3.54));
    assertEquals(4, stus.length());
    */
    
    // LList<String> names = stus.map( toName );
    // LList<String> things = facts.map( nounA );
    
    /*
    LList<String> names = stus.map(new StudentNameFunction());
    assertEquals("[Dee Chan Bob Alice]", names.toString());
    
    LList<String> things = facts.map(new FactSubjectFunction());
    assertEquals("[rabbits cars plants]", things.toString());
    */
  }

}

/*
 idea:
 class StudentFunction {
    public String apply(Student s) { ... }
 }
 
 class FactFunction {
    public String apply(Fact f) { ... }
 }
 */


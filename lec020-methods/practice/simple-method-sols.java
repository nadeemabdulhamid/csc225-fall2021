import org.junit.Test;
import static org.junit.Assert.*;

class Planet {
  String name;
  double distToSun;
  double relGravity;

  Planet(String name, double distToSun, double relGravity) {
    this.name = name;
    this.distToSun = distToSun;
    this.relGravity = relGravity;
  }

  // produces the corresponding weight of an item on this planet
  double convertWeight(double itemWeight) {
    return (itemWeight * this.relGravity);
  }

  // determine whether this planet is farther from the sun than
  // the given planet
  boolean fartherFromSum(Planet otherPlanet) {
    return (this.distToSun > otherPlanet.distToSun);
  }
}

// -----------------------------------------

class BankCustomer {
  String firstName;
  String lastName;

  BankCustomer(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  // produces a new account for this customter with the given amount
  // as an initial balance
  BankAccount openAccount(double initAmt) {
    return (new BankAccount(this, initAmt));
  }
}

class BankAccount {
  BankCustomer forCust;
  double balance;

  BankAccount(BankCustomer forCust, double balance) {
    this.forCust = forCust;
    this.balance = balance;
  }

  // produces a status message describing the balance in the account
  String statusMessage() {
    if (this.balance == 0) {
      return ("No Money");
    } else if (this.balance < 0) {
      return ("Overdrawn");
    } else {
      return ("Positive Balance");
    }
  }
}

// -----------------------------------------

// This is one sample test case. You should have several more

class Examples {
  Examples() {
  }

  BankCustomer wpiCust = new BankCustomer("Gompei", "Goat");
  BankAccount gompeiAcct = wpiCust.openAccount(0);

  // test getting the correct status message with 0 balance
  @Test
  public void testStatusNoMoney() {
    assertEquals(gompeiAcct.statusMessage(), "No Money");
  }
}

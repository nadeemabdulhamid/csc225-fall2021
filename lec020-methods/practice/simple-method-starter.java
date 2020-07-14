class Planet {
  String name;
  double distToSun;
  double relGravity;
  
  Planet (String name, double distToSun, double relGravity) {
    this.name = name;
    this.distToSun = distToSun;
    this.relGravity = relGravity;
  }  
}

//-----------------------------------------

class BankCustomer {
  String firstName;
  String lastName;

  BankCustomer (String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
}

class BankAccount {
  BankCustomer forCust;
  double balance;
  
  BankAccount (BankCustomer forCust, double balance) {
    this.forCust = forCust;
    this.balance = balance;
  }
}


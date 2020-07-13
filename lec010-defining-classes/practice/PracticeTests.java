
class Student {
  String firstName;
  String lastName;
  int classYear;
  String major;
  
  Student (String firstName, String lastName, int classYear, String major) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.classYear = classYear;
    this.major = major;
  }
}

//-----------------------------------------

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

//-----------------------------------------

class SeatAsgn {
  int row;
  String seat;
  
  SeatAsgn (int row, String seat) {
    this.row = row;
    this.seat = seat;
  }
}

class AirlineTicket {
  String fromCity;
  String toCity;
  int flightNum;
  SeatAsgn seat;
  
  AirlineTicket (String fromCity, String toCity, 
                 int flightNum, SeatAsgn seat) {
    this.fromCity = fromCity;
    this.toCity = toCity;
    this.flightNum = flightNum;
    this.seat = seat;
  }
}

// --------------------------------------

public class PracticeTests {
  
  AirlineTicket ticketToRome = 
    new AirlineTicket("Boston", "Rome", 56,
                      new SeatAsgn(12, "A"));
}
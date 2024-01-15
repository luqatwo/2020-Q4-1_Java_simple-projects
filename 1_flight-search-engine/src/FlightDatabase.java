import java.util.ArrayList;

class FlightDatabase {
  ArrayList <Flight> flights = new ArrayList <Flight> ();

  public FlightDatabase () {
    this.flights.add (new Flight ("Warsaw", "Krakow"));
    this.flights.add (new Flight ("Warsaw", "Gdansk"));
    this.flights.add (new Flight ("Warsaw", "Lodz"));
    this.flights.add (new Flight ("Warsaw", "Gdynia"));
    this.flights.add (new Flight ("Krakow", "Gdansk"));
    this.flights.add (new Flight ("Krakow", "Lodz"));
    this.flights.add (new Flight ("Gdansk", "Gdynia"));
  }

  public void checkIfFlightExist (String start, String end) {
    boolean nonExist = true;
    for (int i=0; i<this.flights.size (); i++) {
      Flight flight = this.flights.get (i);
      if (start.equals (flight.departue) && end.equals (flight.arrival)) {
        System.out.println ("Flight exist!");
        nonExist = false;
      }
    }
    if (nonExist) {
      System.out.println ("Flight doesn't exist!");
    }
  }
}

///    String first = new String ("test");
///    String second = new String ("test");
///    if (first.equals(second)) {
///      System.out.println ("Cities are the same.");
///    } else {
///      System.out.println ("Cities are different.");
///    }

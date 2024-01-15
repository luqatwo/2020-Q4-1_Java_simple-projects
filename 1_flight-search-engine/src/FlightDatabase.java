import java.util.ArrayList;

class FlightDatabase {
  ArrayList <Flight> flights = new ArrayList <Flight> ();

  public FlightDatabase () {
    this.flights.add (new Flight ("Warsaw", "Krakow"));
    this.flights.add (new Flight ("Warsaw", "Gdansk"));
    this.flights.add (new Flight ("Warsaw", "Gdynia"));
    this.flights.add (new Flight ("Krakow", "Warsaw"));
    this.flights.add (new Flight ("Gdansk", "Warsaw"));
    this.flights.add (new Flight ("Gdynia", "Warsaw"));
    this.flights.add (new Flight ("Krakow", "Gdansk"));
  }
  
  /// < komentarz 14-21... baza danych lotów - odniesienie do kodu z głównej klasy Main >

  public void checkIfFlightExist_A (String start, String end) {
    boolean nonExist = true;
    for (int i=0; i<this.flights.size (); i++) {
      Flight flight = this.flights.get (i);
      if (start.equals (flight.departue) && end.equals (flight.arrival)) {
        System.out.println ("-> Flight from " + start + " to " + end + " exist!");
        nonExist = false;
      }
    }
    if (nonExist) {
      System.out.println ("-> Flight from " + start + " to " + end + " doesn't exist!");
    }
  }
  
  /// < komentarz 15-21 [C2]... weryfikowanie danych lotów poprzez ustalone wartości w bazie danych - odniesienie do kodu z głównej klasy Main >

  public void checkIfFlightExist_B (String start, String end) {
    boolean nonExist = true;
    for (int i=0; i<this.flights.size (); i++) {
      Flight flight = this.flights.get (i);
      if (start.equals (flight.departue) && end.equals (flight.arrival)) {
        System.out.println ("=> Flight from " + start + " to " + end + " is available right now!");
        nonExist = false;
        break;
      }
    }
    if (nonExist) {
      System.out.println ("=> Flight from " + start + " to " + end + " will be available soon!");
    }
  }
  
  /// < komentarz 16-21... weryfikowanie danych lotów poprzez ustalone wartości w bazie danych (z wykorzystaniem przerwania pętli poprzez instrukcję break w celu uniknęcia zbędnych interakcji w pętli) - odniesienie do kodu z głównej klasy Main >

  public void checkIfFlightExist_C (String start, String end) {
    for (int i=0; i<this.flights.size (); i++) {
      Flight flight = this.flights.get (i);
      if (start.equals (flight.departue) && end.equals (flight.arrival)) {
        System.out.println ("=> Flight from " + start + " to " + end + " is available right now!");
        return;
      }
    }
    System.out.println ("=> Flight from " + start + " to " + end + " will be available soon!");
  }
  
  /// < komentarz 17-21... weryfikowanie danych lotów poprzez ustalone wartości w bazie danych (z wykorzystaniem przerwania pętli poprzez instrukcję return w celu zmniejszenia objętości kodu oraz uniknęcia zbędnych interakcji w pętli) - odniesienie do kodu z głównej klasy Main >

  public void getFlightsFromCity_A (String city) {
    boolean isNotFound = true;
    for (int i=0; i<this.flights.size (); i++) {
      Flight flight = this.flights.get (i);
      if (city.equals (flight.departue)) {
        System.out.println ("- " + flight.arrival);
        isNotFound = false;
      }
    }
    if (isNotFound) {
      System.out.println ("Flight from " + city + " not found!");
    }
  }
  
  /// < komentarz 18-21... wyświetlanie wszystkich dostępnych połączeń lotniczych (dostępnych w bazie danych) z wybranego miasta (w tym przypadku z Warsaw) - odniesienie do kodu z głównej klasy Main >
  
  public void getFlightsFromCity_B (String city) {
    boolean isNotFound = true;
    for (int i=0; i<this.flights.size (); i++) {
      Flight flight = this.flights.get (i);
      if (city.equals (flight.departue)) {
        System.out.println ("- " + flight.arrival);
        isNotFound = false;
      }
    }
    if (isNotFound) {
      System.out.println ("Flight from " + city + " not found!");
    }
  }
  
  /// < komentarz 19-21... wyświetlanie wszystkich dostępnych połączeń lotniczych (dostępnych w bazie danych) z wybranego miasta, a jeśli nie istnieją połączenia lotnicze to zwrócenie informacji, iż nie znaleziono lotów (w tym przypadku dotyczy to miasta Lodz) - odniesienie do kodu z głównej klasy Main >

  public void getFlightsToCity_A (String city) {
    boolean isNotFound = true;
    for (int i=0; i<this.flights.size (); i++) {
      Flight flight = this.flights.get (i);
      if (city.equals (flight.arrival)) {
        System.out.println ("[>] " + flight.departue);
        isNotFound =false;
      }
    }
    if (isNotFound) {
      System.out.println ("Flight to " + city + " not found!");
    }
  }

  /// < komentarz 20-21... wyświetlanie wszystkich połączeń lotniczych do wybranego miasta bądź zwrócenie informacji, iż nie znaleziono lotów (w tym przypadku dotyczy to połączeń do miasta Warsaw) - odniesienie do kodu z głównej klasy Main >
  
  public void getFlightsToCity_B (String city) {
    boolean isNotFound = true;
    for (int i=0; i<this.flights.size (); i++) {
      Flight flight = this.flights.get (i);
      if (city.equals (flight.arrival)) {
        System.out.println ("[>] " + flight.departue);
        isNotFound = false;
      }
    }
    if (isNotFound) {
      System.out.println ("Flight to " + city + " not found!");
    }
  }
  
  /// < komentarz 21-21... wyświetlanie wszystkich połączeń lotniczych do wybranego miasta bądź zwrócenie informacji, iż nie znaleziono lotów (w tym przypadku dotyczy to braku połączeń do miasta Lodz) - odniesienie do kodu z głównej klasy Main >
  
  public ArrayList <Flight> getFlightsFromCity (String City) {
    ArrayList <Flight> results = new ArrayList <Flight> ();
    System.out.println ("From " + City + " you can reach:");
    for (int i=0; i<this.flights.size (); i++) {
      Flight flight = this.flights.get (i);
      if (City.equals (flight.departue)) {
        results.add (flight);
        System.out.println ("[->] " + flight.arrival);
      }
    }
    return results;
  }

  /// komentarz 22-22... wyświetlanie miast, do których doleci samolot z konkretnego miasta (w tym przypadku z Warsaw) - odniesienie do kodu z głównej klasy Main >
  
  public ArrayList <Flight> getFlightsToCity (String City) {
    ArrayList <Flight> results = new ArrayList <Flight> ();
    System.out.println ("... and to " + City + " you can fly from:");
    for (int i=0; i<this.flights.size (); i++) {
      Flight flight = this.flights.get (i);
      if (City.equals (flight.arrival)) {
        results.add (flight);
        System.out.println ("[->] " + flight.departue);
      }
    }
    return results;
  }
  
  /// komentarz 23-23... wyświetlanie miast, z których doleci samolot do konkretnego miasta (w tym przypadku do Gdansk) - odniesienie do kodu z głównej klasy Main >

}
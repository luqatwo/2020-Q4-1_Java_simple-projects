import java.util.ArrayList;

/// < komentarz 35-40... import listy ArrayList do klasy Journey w celu odpowiedniego działania poszczególnych metod wykorzystujących tą metodę >

class Journey extends FlightDatabase {
  Flight first;
  Flight second;

  public Journey (Flight first, Flight second) {
    this.first = first;
    this.second = second;
  }
  
  public String toString () {
    return "Flight from " + first.departue + " to " + second.arrival + " with stop at " + first.arrival + " costs " + (first.price + second.price);
  }
  
  public ArrayList <Journey> getFlights (String start, String end) {
    ArrayList <Flight> starting = getFlightsFromCity (start);
    ArrayList <Flight> ending = getFlightsToCity (end);
    ArrayList <Journey> results = new ArrayList <Journey> ();
    for (Flight first : starting) {
      for (Flight second : ending) {
        if (first.arrival.equals (second.departue)) {
          results.add (new Journey (first, second));
        }
      }
    }
    return results;
  }

  /// < komentarz 36-40... wyszukiwanie wszystkich lotów z miasta A (startowego) do miasta B (końcowego) z wyszczególnieniem miast, gdzie jest przesiadka oraz ceny za cały/e lot/y - odniesienie do kodu z głównej klasy Main >

  /// < komentarz 37-40... kod z linijki 133 z głównej klasy Main do poprawy !!! >
  
  /// < komentarz 38-40... do uzupełnienia w przypadku dodania nowej metody >
  /// < komentarz 39-40... do uzupełnienia w przypadku dodania nowej metody >
  /// < komentarz 40-40... do uzupełnienia w przypadku dodania nowej metody >

}
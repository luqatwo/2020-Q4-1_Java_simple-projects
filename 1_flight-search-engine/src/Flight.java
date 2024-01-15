class Flight {
  String departue;
  String arrival;
  int price;
  /// int distance; (dodać po naprawie błędu z linijki 133 z głównej klasy Main)
  
  public Flight (String departue, String arrival, int price) {
    this.departue = departue;
    this.arrival = arrival;
    this.price = price;
    /// this.distance = distance; (dodać po naprawie błędu z linijki 133 z głównej klasy main)
  }

  public String getDetails () {
    return "Flight from " + this.departue + " to " + this.arrival + " cost: $" + this.price + "!";
  }

  /// public void displayValues() {
    /// System.out.println ("Flight from " + this.departue + " to " + this.arrival);
  /// }
  
  /// < komentarz 20-40... ponowione wyświetlanie tekstu - odniesienie do kodu z głównej klasy Main >
  
  /// public String getParameters() {
    /// return "Flight from " + this.departue + " to " + this.arrival;
  /// }
  
  /// < komentarz 21-40... ponowione wyświetlanie tekstu - odniesienie do kodu z głównej klasy Main >
  
}
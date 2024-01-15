class Flight {
  String departue;
  String arrival;
  int price;
  int distance;
  
  public Flight (String departue, String arrival, int price, int distance) {
    this.departue = departue;
    this.arrival = arrival;
    this.price = price;
    this.distance = distance;
  }

  public String getDetails () {
    return "Flight from " + this.departue + " to " + this.arrival + " cost: $" + this.price;
  }

  public String getDetails2 () {
    return "Distance from " + this.departue + " to " + this.arrival + " is " + this.distance + " km";
  }

  /// public void displayValues() {
    /// System.out.println ("Flight from " + this.departue + " to " + this.arrival);
  /// }
  
  /// < komentarz 19-37... ponowione wyświetlanie tekstu - odniesienie do kodu z głównej klasy Main >
  
  /// public String getParameters() {
    /// return "Flight from " + this.departue + " to " + this.arrival;
  /// }
  
  /// < komentarz 20-37... ponowione wyświetlanie tekstu - odniesienie do kodu z głównej klasy Main >
  
}
class Flight {
  String departue;
  String arrival;
  
  public Flight (String departue, String arrival) {
    this.departue = departue;
    this.arrival = arrival;
  }
  
  public String getDetails () {
    return "This flight is from " + this.departue + " to " + this.arrival;
  }

  /// public void displayValues() {
    /// System.out.println ("Flight from " + this.departue + " to " + this.arrival);
  /// }
  
  /// < komentarz 12-21... ponowione wyświetlanie tekstu - odniesienie do kodu z głównej klasy Main >
  
  /// public String getParameters() {
    /// return "Flight from " + this.departue + " to " + this.arrival;
  /// }
  
  /// < komentarz 13-21... ponowione wyświetlanie tekstu - odniesienie do kodu z głównej klasy Main >
  
}
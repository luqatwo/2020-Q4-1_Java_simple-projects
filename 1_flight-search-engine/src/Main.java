class Main {
  public static void main(String[] args) {
    Flight plane = new Flight ("Gdansk", "Warsaw");
    System.out.println ("Flight from " + plane.departue + " to " + plane.arrival);
    plane.displayValues();
    String parameters = plane.getParameters();
    System.out.println (parameters);
    
  }
}

class Flight {
  String departue;
  String arrival;
  
  public Flight (String departue, String arrival) {
    this.departue = departue;
    this.arrival = arrival;
  }
  
  public void displayValues() {
    System.out.println ("Flight from " + this.departue + " to " + this.arrival);
  }
  
  public String getParameters() {
    return "Flight from " + this.departue + " to " + this.arrival;
  }
}
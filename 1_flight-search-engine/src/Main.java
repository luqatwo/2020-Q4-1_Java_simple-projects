import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Flight plane = new Flight ("Warsaw", "Gdansk");
    System.out.println ("");
    System.out.println ("Flight from " + plane.departue + " to " + plane.arrival);
    System.out.println ("");

    /// < komentarz 1-7 [A]... wyświetlenie tekstu o locie z miasta A do miasta B >

    /// plane.displayValues();
    
    /// String parameters = plane.getParameters();
    /// System.out.println (parameters);

    /// < komentarz 2-7... ponowione wyświetlanie tekstu - odniesienie do kodu z klasy Flight >

    FlightDatabase database = new FlightDatabase ();
    database.checkIfFlightExist ("Warsaw", "Gdansk");
    
    /// < komentarz 3-7... powyższy kod do poprawy >
  }
}
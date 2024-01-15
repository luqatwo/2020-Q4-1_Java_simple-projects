import java.util.ArrayList;

class Main {
  public static void main(String[] args) {

    System.out.println ("");
    System.out.println ("Welcome to WSE - Flight Search Engine!");
    System.out.println ("Search, find and compare any flight path!");
    System.out.println ("Thanks to WSE you can travel across the Poland!");

    Flight plane = new Flight ("Warsaw", "Gdansk");
    System.out.println ("");
    System.out.println ("If you wish you can travel, e.g. from " + plane.departue + " to " + plane.arrival + "!");
    System.out.println ("");

    /// < komentarz 1-21 [A]... wyświetlenie tekstu o locie z miasta A do miasta B >

    /// plane.displayValues();
    
    /// String parameters = plane.getParameters();
    /// System.out.println (parameters);

    /// < komentarz 2-21... ponowione wyświetlanie tekstu - odniesienie do kodu z klasy Flight >
    
    System.out.println ("Are you wondering if you can get to your destination?");
    System.out.println ("");
    System.out.println ("There's no need to worry anymore! We can assure you that:");
    
    FlightDatabase database = new FlightDatabase ();

    /// < komentarz 3-21... baza danych lotów - odniesienie do kodu z klasy FlightDatabase >

    database.checkIfFlightExist_A ("Warsaw", "Krakow");
    database.checkIfFlightExist_A ("Warsaw", "Gdansk");
    database.checkIfFlightExist_A ("Warsaw", "Gdynia");
    database.checkIfFlightExist_A ("Krakow", "Warsaw");
    database.checkIfFlightExist_A ("Gdansk", "Warsaw");

    /// < komentarz 4-21 [C1]... weryfikowanie danych lotów poprzez ustalone wartości w bazie danych - odniesienie do kodu z klasy FlightDatabase >

    System.out.println ("");
    System.out.println ("... but if you find out, that e.g.:");

    database.checkIfFlightExist_A ("Krakow", "Gdynia");
    database.checkIfFlightExist_A ("Gdansk", "Krakow");
    
    /// < komentarz 5-21... weryfikowanie danych lotów poprzez ustalone wartości w bazie danych - odniesienie do kodu z klasy FlightDatabase >

    System.out.println ("... do not worry!" + " We have new flight connections each month!");
    System.out.println ("");
    System.out.println ("... and you can be sure, that:");
    
    database.checkIfFlightExist_B ("Gdynia", "Warsaw");
    database.checkIfFlightExist_B ("Gdynia", "Krakow");
    
    /// < komentarz 6-21... weryfikowanie danych lotów poprzez ustalone wartości w bazie danych (z wykorzystaniem przerwania pętli poprzez instrukcję break w celu uniknęcia zbędnych interakcji w pętli) - odniesienie do kodu z klasy FlightDatabase >

    database.checkIfFlightExist_C ("Krakow", "Gdansk");
    database.checkIfFlightExist_C ("Gdansk", "Gdynia");
    database.checkIfFlightExist_C ("Gdynia", "Gdansk");
    
    /// < komentarz 7-21... weryfikowanie danych lotów poprzez ustalone wartości w bazie danych (z wykorzystaniem przerwania pętli poprzez instrukcję return w celu zmniejszenia objętości kodu oraz uniknęcia zbędnych interakcji w pętli) - odniesienie do kodu z klasy FlightDatabase >

    System.out.println ("");
    System.out.println ("Are you looking for flight connections from Warsaw?");
    System.out.println ("You found it already! From Warsaw you will be able to reach:");

    database.getFlightsFromCity_A ("Warsaw");
    
    /// < komentarz 8-21... wyświetlanie wszystkich dostępnych połączeń lotniczych (dostępnych w bazie danych) z wybranego miasta (w tym przypadku z Warsaw) - odniesienie do kodu z klasy FlightDatabase >

    System.out.println ("");
    System.out.println ("... and do not worry, when your flight connection is not found!");
    System.out.println ("");
    System.out.println ("/// /// /// /// /// /// ///");

    database.getFlightsFromCity_B ("Lodz");
    
    /// < komentarz 9-21... wyświetlanie wszystkich dostępnych połączeń lotniczych (dostępnych w bazie danych) z wybranego miasta, a jeśli nie istnieją połączenia lotnicze to zwrócenie informacji, iż nie znaleziono lotów (w tym przypadku dotyczy to miasta Lodz) - odniesienie do kodu z klasy FlightDatabase >

    System.out.println ("/// /// /// /// /// /// ///");
    System.out.println ("");
    System.out.println ("New flight connections will be established soon!");

    System.out.println ("");
    System.out.println ("Find your flight connections to Gdansk!");

    database.getFlightsToCity_A ("Gdansk");
    
    /// < komentarz 10-21... wyświetlanie wszystkich połączeń lotniczych do wybranego miasta bądź zwrócenie informacji, iż nie znaleziono lotów (w tym przypadku dotyczy to połączeń do miasta Gdansk) - odniesienie do kodu z klasy FlightDatabase >

    System.out.println ("");
    System.out.println ("... or get to know, that flight doesn't exist!");
    System.out.println ("");
    System.out.println ("/// /// /// /// /// /// ///");

    database.getFlightsToCity_B ("Lodz");
    
    /// < komentarz 11-21... wyświetlanie wszystkich połączeń lotniczych do wybranego miasta bądź zwrócenie informacji, iż nie znaleziono lotów (w tym przypadku dotyczy to braku połączeń do miasta Lodz) - odniesienie do kodu z klasy FlightDatabase >

    System.out.println ("/// /// /// /// /// /// ///");
    System.out.println ("");
    
    ArrayList <Flight> fromCity = database.getFlightsFromCity ("Warsaw");
    System.out.println ("");
    ArrayList <Flight> toCity = database.getFlightsToCity ("Gdansk");
    
    /// komentarz 24-24... wyświetlanie miast, do których doleci samolot z konkretnego miasta oraz z których doleci samolot do konkretnego miasta (w tym przypadku dotyczy to miast z Warsaw oraz do Gdansk) - odniesienie do kodu z klasy FlightDatabase >

  }
}
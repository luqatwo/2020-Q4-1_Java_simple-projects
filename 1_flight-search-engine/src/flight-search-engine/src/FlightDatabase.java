import java.util.ArrayList;

/// < komentarz 21-37... import listy ArrayList do klasy FlightDatabase w celu odpowiedniego działania poszczególnych metod wykorzystujących tą metodę >

class FlightDatabase {
    ArrayList <Flight> flights = new ArrayList <Flight> ();

    public FlightDatabase () {
        this.flights.add (new Flight ("Warsaw", "Krakow", 175, 247));
        this.flights.add (new Flight ("Warsaw", "Gdansk", 209, 297));
        this.flights.add (new Flight ("Warsaw", "Gdynia", 199, 307));
        this.flights.add (new Flight ("Krakow", "Warsaw", 188, 247));
        this.flights.add (new Flight ("Gdansk", "Warsaw", 209, 297));
        this.flights.add (new Flight ("Gdynia", "Warsaw", 146, 307));
        this.flights.add (new Flight ("Krakow", "Gdansk", 170, 485));
    }

    /// < komentarz 22-37 [B2]... baza danych lotów - odniesienie do kodu z głównej klasy Main >

    public void checkIfFlightExist_A (String start, String end) {
        boolean nonExist = true;
        for (Flight flight : this.flights) {
            if (start.equals (flight.departue) && end.equals (flight.arrival)) {
                System.out.println ("-> Flight from " + start + " to " + end + " exist!");
                nonExist = false;
            }
        }
        if (nonExist) {
            System.out.println ("-> Flight from " + start + " to " + end + " doesn't exist!");
        }
    }

    /// < komentarz 23-37 [C2]... weryfikowanie danych lotów poprzez ustalone wartości w bazie danych - odniesienie do kodu z głównej klasy Main >

    public void checkIfFlightExist_B (String start, String end) {
        boolean nonExist = true;
        for (Flight flight : this.flights) {
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

    /// < komentarz 24-37... weryfikowanie danych lotów poprzez ustalone wartości w bazie danych (z wykorzystaniem przerwania pętli poprzez instrukcję break w celu uniknęcia zbędnych interakcji w pętli) - odniesienie do kodu z głównej klasy Main >

    public void checkIfFlightExist_C (String start, String end) {
        for (Flight flight : this.flights) {
            if (start.equals (flight.departue) && end.equals (flight.arrival)) {
                System.out.println ("=> Flight from " + start + " to " + end + " is available right now!");
                return;
            }
        }
        System.out.println ("=> Flight from " + start + " to " + end + " will be available soon!");
    }

    /// < komentarz 25-37... weryfikowanie danych lotów poprzez ustalone wartości w bazie danych (z wykorzystaniem przerwania pętli poprzez instrukcję return w celu zmniejszenia objętości kodu oraz uniknęcia zbędnych interakcji w pętli) - odniesienie do kodu z głównej klasy Main >

    public void getFlightsFromCity_A (String city) {
        boolean isNotFound = true;
        for (Flight flight : this.flights) {
            if (city.equals (flight.departue)) {
                System.out.println ("- " + flight.arrival);
                isNotFound = false;
            }
        }
        if (isNotFound) {
            System.out.println ("Flight from " + city + " not found!");
        }
    }

    /// < komentarz 26-37... wyświetlanie wszystkich dostępnych połączeń lotniczych (dostępnych w bazie danych) z wybranego miasta (w tym przypadku z Warsaw) - odniesienie do kodu z głównej klasy Main >

    public void getFlightsFromCity_B (String city) {
        boolean isNotFound = true;
        for (Flight flight : this.flights) {
            if (city.equals (flight.departue)) {
                System.out.println ("- " + flight.arrival);
                isNotFound = false;
            }
        }
        if (isNotFound) {
            System.out.println ("Flight from " + city + " not found!");
        }
    }

    /// < komentarz 27-37... wyświetlanie wszystkich dostępnych połączeń lotniczych (dostępnych w bazie danych) z wybranego miasta, a jeśli nie istnieją połączenia lotnicze to zwrócenie informacji, iż nie znaleziono lotów (w tym przypadku dotyczy to miasta Lodz) - odniesienie do kodu z głównej klasy Main >

    public void getFlightsToCity_A (String city) {
        boolean isNotFound = true;
        for (Flight flight : this.flights) {
            if (city.equals (flight.arrival)) {
                System.out.println ("[>] " + flight.departue);
                isNotFound =false;
            }
        }
        if (isNotFound) {
            System.out.println ("Flight to " + city + " not found!");
        }
    }

    /// < komentarz 28-37... wyświetlanie wszystkich połączeń lotniczych do wybranego miasta bądź zwrócenie informacji, iż nie znaleziono lotów (w tym przypadku dotyczy to połączeń do miasta Warsaw) - odniesienie do kodu z głównej klasy Main >

    public void getFlightsToCity_B (String city) {
        boolean isNotFound = true;
        for (Flight flight : this.flights) {
            if (city.equals (flight.arrival)) {
                System.out.println ("[>] " + flight.departue);
                isNotFound = false;
            }
        }
        if (isNotFound) {
            System.out.println ("Flight to " + city + " not found!");
        }
    }

    /// < komentarz 29-37... wyświetlanie wszystkich połączeń lotniczych do wybranego miasta bądź zwrócenie informacji, iż nie znaleziono lotów (w tym przypadku dotyczy to braku połączeń do miasta Lodz) - odniesienie do kodu z głównej klasy Main >

    public ArrayList <Flight> getFlightsFromCity (String City) {
        ArrayList <Flight> results = new ArrayList <Flight> ();
        System.out.println ("");
        System.out.println ("From " + City + " you can reach:");
        for (Flight flight : this.flights) {
            if (City.equals (flight.departue)) {
                results.add (flight);
                System.out.println ("[->] " + flight.arrival);
            }
        }
        return results;
    }

    /// komentarz 30-37... wyświetlanie miast, do których doleci samolot z konkretnego miasta (w tym przypadku z Warsaw) - odniesienie do kodu z głównej klasy Main >

    public ArrayList <Flight> getFlightsToCity (String City) {
        ArrayList <Flight> results = new ArrayList <Flight> ();
        System.out.println ("");
        System.out.println ("... and to " + City + " you can fly from:");
        for (Flight flight : this.flights) {
            if (City.equals (flight.arrival)) {
                results.add (flight);
                System.out.println ("[->] " + flight.departue);
            }
        }
        return results;
    }

    /// komentarz 31-37... wyświetlanie miast, z których doleci samolot do konkretnego miasta (w tym przypadku do Gdansk) - odniesienie do kodu z głównej klasy Main >

    public ArrayList <String> getCities () {
        ArrayList <String> Cities = new ArrayList <> ();
        for (Flight flight : this.flights) {
            if (!Cities.contains (flight.departue)) {
                Cities.add (flight.departue);
            }
            if (!Cities.contains (flight.arrival)) {
                Cities.add (flight.arrival);
            }
        }
        return Cities;
    }

    /// < komentarz 32-37 [D2]... wyświetlanie listy miast, z których i do których są połączenia lotnicze (w tym przypadku są to cztery miasta) - odniesienie do kodu z głównej klasy Main >

    public Flight getCheapestFlight () {
        Flight CheapestFlight = null;
        for (Flight flight : this.flights) {
            if (CheapestFlight == null || flight.price < CheapestFlight.price) {
                CheapestFlight = flight;
            }
        }
        return CheapestFlight;
    }

    public Flight getExpensiveFlight () {
        Flight ExpensiveFlight = null;
        for (Flight flight : this.flights) {
            if (ExpensiveFlight == null || flight.price > ExpensiveFlight.price) {
                ExpensiveFlight = flight;
            }
        }
        return ExpensiveFlight;
    }

    /// < komentarz 33-37... wyświetlenie najtańszego i najdroższego dostępnego lotu, który jest zawarty w bazie danych - odniesienie do kodu z głównej klasy Main >

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

    /// < komentarz 34-37... wyszukiwanie wszystkich lotów z miasta A (startowego) do miasta B (końcowego) z wyszczególnieniem miast, gdzie jest przesiadka oraz ceny za cały/e lot/y - odniesienie do kodu z głównej klasy Main >

    public Flight getShortestFlight () {
        Flight ShortestFlight = null;
        for (Flight flight : this.flights) {
            if (ShortestFlight == null || flight.distance < ShortestFlight.distance) {
                ShortestFlight = flight;
            }
        }
        return ShortestFlight;
    }

    public Flight getLongestFlight () {
        Flight LongestFlight = null;
        for (Flight flight : this.flights) {
            if (LongestFlight == null || flight.distance > LongestFlight.distance) {
                LongestFlight = flight;
            }
        }
        return LongestFlight;
    }

    /// < komentarz 35-37 [E2]... wyświetlenie najkrótszego i najdłuższego dostępnego lotu, który jest zawarty w bazie danych - odniesienie do kodu z głównej klasy Main >

}
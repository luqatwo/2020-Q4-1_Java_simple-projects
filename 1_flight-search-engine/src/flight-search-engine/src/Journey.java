import java.util.ArrayList;

/// < komentarz 36-37... import listy ArrayList do klasy Journey w celu odpowiedniego działania poszczególnych metod wykorzystujących tą metodę >

class Journey extends FlightDatabase {
    Flight first;
    Flight second;

    public Journey (Flight first, Flight second) {
        this.first = first;
        this.second = second;
    }

    public String toString () {
        System.out.println ("");
        return "... and flight from " + first.departue + " to " + second.arrival + " with stop at " + first.arrival + " costs $" + (first.price + second.price + "!");
    }

    /// < komentarz 37-37... wyświetlanie lotu z miasta A do miasta B z wyszczególnieniem przesiadki oraz pełnej ceny za lot/y - odniesienie do kodu z głównej klasy Main >

}
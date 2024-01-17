class MobilePhone {
  String brand;
  String weight;
  int price;
  int discount;

  public MobilePhone (String brand, String weight, int price, int discount) {
    this.weight = weight;
    this.brand = brand;
    this.price = price;
    this.discount = discount;
  }
  
   ///public void displayValues () {
     /// System.out.println ("");
     /// < komentarz 13-24... dodatkowa pusta linijka >
     /// System.out.println (this.brand + " - the highest quality: " + this.weight + " - shop for $" + this.price + " in LUQASZ SHOP!");
     /// System.out.println ("");
     /// < komentarz 14-24... dodatkowa pusta linijka >
  /// }

  /// < komentarz 15-24... ponowione wyświetlanie tekstu (brand, weight, price) - odniesienie do kodu z głównej klasy Main >

  
  /// public String getParameters () {
    /// return this.brand + " - the highest quality: " + this.weight + " - shop for $" + this.price + " in LUQASZ SHOP!";
  /// }

  /// < komentarz 16-24... ponowione wyświetlanie tekstu (brand, weight, price) - odniesienie do kodu z głównej klasy Main >

  public void displayValues () {
    System.out.println (this.weight + "" + this.price);
  }

  public String getParameters () {
    return this.weight + "" + this.price;
  }

  public void checkPrice () {
    if (this.price > 500 && this.discount < 15) {
      System.out.println ("");
      System.out.println ("Buy and start to use the latest LuqaszPhone 3s LTE phone - see the future thanks to the latest technology hidden in the phone... for a new price!");
    }
    
    /// < komentarz 17-24... weryfikowanie, sprawdzanie ceny poszczególnych telefonów komórkowych LuqaszPhone przy wykorzystaniu warunku (w tym przypadku jeśli jest cena wyższa niż 500 oraz przecena mniejsza niż 15 wyświetl tekst) - odniesienie do kodu z głównej klasy Main >
    
    if (this.price < 300) {
      System.out.println ("");
      System.out.println ("The cheapest (and the first of its kind) it's the LuqaszPhone 1s 3G - get to know how all has started!");
    }
    else if (this.price < 700) {
      System.out.println ("");
      System.out.println ("Cheaper phone it is LuqaszPhone 2s 4G - it contains past and future!");
    }
    else if (this.price < 900) {
     System.out.println ("");
     System.out.println ("The most expensive (but the best build quality) it is the LuqaszPhone 3s LTE - now the future is in your hands!");
    }
    else {
      System.out.println ("");
      System.out.println ("Unfortunately... or even fortunately we don't offer more expensive phones.");
    }
  }
  
  /// < komentarz 18-24... weryfikowanie, sprawdzanie ceny poszczególnych telefonów komórkowych LuqaszPhone przy wykorzystaniu warunku (w tym przypadku wykorzystano kilka warunków, zamiast jednego, złożonego i długiego warunku - odniesienie do kodu z głównej klasy Main >
  
  public void text0 () {
    System.out.println ("");
    System.out.println ("Open days - come, see and learn about the latest technology that is hidden in LuqaszPhones on:");
  }

  public void displayNumbers (int min, int max) {
    for (int i=min; i<max; i++) {
      if (i%3==0) {
        System.out.println ("-> the " + i + "th of December 2020");
      }
    }
  }

  /// < komentarz 19-24... wyświetlanie poszczególnych numerów z zakresów min i max, które są podzielne przez liczbę 3 - odniesienie do kodu z głównej klasy Main >
  
  public void text1 () {
    System.out.println ("");
    System.out.println ("Open days will also take place in the New Year! Let's welcome the New Year with technology the world has never seen before! Everyone will be able to see the latest and extraordinary technology on:");
  }

  public void isDividedA (int min, int max) {
    for (int i=min; i<=max; i++) {
      if (i%3==0) {
        System.out.println ("-> the " + i + "th of January 2021");
      }
    }
  }
  
  public void isDividedB (int min, int max) {
    for (int i=min; i<=max; i++) {
      if (i%5==0) {
        System.out.println ("-> " + i + "th of February 2021");
      }
    }
  }
  
  /// < komentarz 20-24 [B1.2]... wyświetlanie liczb z zakresów min i max (4,18 oraz 3,12), które są podzielne przez liczbę 3 (dla 4,18) oraz 5 (dla 3,12) - odniesienie do kodu z głównej klasy Main >
  
  public void text2 () {
    System.out.println ("");
    System.out.println ("Hurry up if you want extra discount to existing discount!");
  }
  
  public void getEvenSum (int min, int max) {
    for (int i=min; i<=max; i++) {
      if (i%2==0) {
        System.out.println ("-> " + i + "% discount!");
      }
    }
  }
  
  /// < komentarz 21-24 [B2.2]... wyświetlanie liczb parzystych z zakresów min i max (5,9), które są podzielne przez 2 - odniesienie do kodu z głównej klasy Main >

  public void text3 () {
    System.out.println ("");
  }
  
  public void getNumber (int min, int max) {
    for (int i=min; i>=max; i--) {
      if (i%1==0) {
        System.out.println (i);
      }
    }
  }

  public void text4 () {
    System.out.println ("");
    System.out.println ("What are you waiting for?! Come and be the first person, who will own the latest technology! Don't wait and get it... right now!");
  }
  
  /// < komentarz 22-24 [B3.2]... wyświetlanie wszystkich liczb z zakresów min i max (5,9) w kolejności malejącej - odniesienie do kodu z głównej klasy Main >

  /// < komentarz 23-24... do uzupełnienia w przypadku dodania nowych linijek kodu >

  /// < komentarz 24-24... do uzupełnienia w przypadku dodania nowych linijek kodu >

}
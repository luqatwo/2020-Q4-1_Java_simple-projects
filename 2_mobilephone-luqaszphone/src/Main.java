class Main {
  public static void main(String[] args) {

    MobilePhone phone = new MobilePhone ("LuqaszPhone 3s LTE", "250 g", 750, 10);

    System.out.println ("");
    /// < komentarz 1-24... dodatkowa pusta linijka >
    System.out.println (phone.brand + " - the highest quality: " + phone.weight + " - shop for $" + phone.price + " in LUQASZ SHOP!");
    System.out.println ("Get up to " + phone.discount + "% off during first week of the New Year!" + " It is a limited time offer!");

    int itemValue = phone.price;
    System.out.println ("Regular price for a LuqaszPhone 3s LTE it is: $" + itemValue + " - but you can buy it much cheaper!");
    /// < komentarz 2-24 [A1]... metoda wyświetaljąca cenę regularną za jeden telefon LuqaszPhone 3s LTE - w tym przypadku jest to 750$ >

    int newitemValue = phone.price - (phone.price / phone.discount);
    /// < komentarz 3-24 [A2]... metoda obniżająca cenę o ustaloną wartość procentową - w tym przypadku obniżka to 10% >
    System.out.println ("Buy it now! It's only: $" + newitemValue + " !!! " + "Do not wait! Time is running out!" + " Get it right now !!!");

    int anotheritemValue = phone.price + 150;
    System.out.println ("If you do not get it, you will regret! Price will rise as never before... up to $" + anotheritemValue + " !");
    /// < komentarz 4-24 [A3]... metoda zwiększająca cenę o wartość przekazaną w argumencie - w tym przypadku jest to zwiększenie ceny o wartość wynoszącą 150 >

    /// phone.displayValues();

    /// String parameters = phone.getParameters();
    /// System.out.println(parameters);

    /// < komentarz 5-24... ponowione wyświetlanie tekstu (brand, weight, price) - odniesienie do kodu z klasy MobilePhone >

    MobilePhone renewedphone = new MobilePhone ("LuqaszPhone 2s 4G", "400 g", 500, 15);
    System.out.println ("");
    System.out.println (renewedphone.brand + " - renewed phone: " + renewedphone.weight + " - shop for $" + renewedphone.price + " in LUQASZ SHOP!");
    System.out.println ("You can get up to " + renewedphone.discount + "% off during first week of the New Year!!!");
    
    int reneweditemValue = renewedphone.price;
    int renewednewitemValue = renewedphone.price - (renewedphone.price / renewedphone.discount);
    int renewedanotheritemValue = renewedphone.price + 100;
    
    System.out.println ("Buy it now for $" + renewednewitemValue + " before it will rise from $" + reneweditemValue + " to $" + renewedanotheritemValue + " !");

    /// < komentarz 6-24... wyświetlanie wartości dla kolejnego (odnowionego) telefonu wraz z wykorzystaniem metod obliczeniowych, tj. wyświetlenie ceny regularnej, obliczenie nowej ceny po przecenie oraz kolejnej ceny po podwyższce >

    MobilePhone oldphone = new MobilePhone ("LuqaszPhone 1s 3G", "500 g", 250, 25);
    System.out.println ("");
    System.out.println (oldphone.brand + " was our first mobile phone: " + oldphone.weight + " - shop for $" + oldphone.price + " !");
    System.out.println ("Now you can get up to " + oldphone.discount + "% off during first week of the New Year!");
    
    int olditemValue = oldphone.price;
    int oldnewitemValue = oldphone.price - (oldphone.price / oldphone.discount);
    int oldanotheritemValue = oldphone.price + 50;
    
    System.out.println ("Buy it now for $" + oldnewitemValue + " before it will rise from $" + olditemValue + " to $" + oldanotheritemValue + " !");
    
    /// < komentarz 7-24... wyświetlanie wartości dla kolejnego (starego) telefonu wraz z wykorzystaniem metod obliczeniowych, tj. wyświetlenie ceny regularnej, obliczenie nowej ceny po przecenie oraz kolejnej ceny po podwyższce >
    
    phone.checkPrice ();
    renewedphone.checkPrice ();
    oldphone.checkPrice ();

    /// < komentarz 8-24... weryfikowanie, sprawdzanie ceny poszczególnych telefonów komórkowych LuqaszPhone - odniesienie do kodu z klasy MobilePhone >

    phone.text0 ();

    phone.displayNumbers (1,7);
    renewedphone.displayNumbers (8,14);
    oldphone.displayNumbers (15,21);
    
    /// < komentarz 9-24... wyświetlanie poszczególnych numerów z zakresów min i max, które są podzielne przez wskazaną liczbę - odniesienie do kodu z klasy MobilePhone >

    phone.text1 ();

    phone.isDividedA (4,18);
    renewedphone.isDividedB (3,12);
    
    /// < komentarz 10-24 [B1.1]... wyświetlanie liczb z zakresów min i max (4,18 oraz 3,12), które są podzielne przez liczbę 3 (dla 4,18) oraz 5 (dla 3,12) - odniesienie do kodu z klasy MobilePhone >

    phone.text2 ();

    phone.getEvenSum (5,9);

    /// < komentarz 11-24 [B2.1]... wyświetlanie liczb parzystych z zakresów min i max (5,9), które są podzielne przez 2 - odniesienie do kodu z klasy MobilePhone >

    phone.text3 ();

    phone.getNumber (5,-2);
    
    /// < komentarz 12-24 [B3.1]... wyświetlanie wszystkich liczb z zakresów min i max (5,9) w kolejności malejącej - odniesienie do kodu z klasy MobilePhone >

    phone.text4 ();

  }
}
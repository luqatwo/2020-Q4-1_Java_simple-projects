class Main {
  public static void main(String[] args) {
    MobilePhone phone = new MobilePhone ("LuqaszPhone", "250 g", 50);
    System.out.println (phone.brand + " - the highest quality: " + phone.weight + " - shop for $" + phone.price + " in LUQASZ SHOP!");
    phone.displayValues();
    String parameters = phone.getParameters();
    System.out.println(parameters);
  }
}

class MobilePhone {
  String brand;
  String weight;
  int price;
  
  public MobilePhone (String brand, String weight, int price) {
    this.weight = weight;
    this.brand = brand;
    this.price = price;
  }
  
  public void displayValues () {
    System.out.println (this.brand + " - the highest quality: " + this.weight + " - shop for $" + this.price + " in LUQASZ SHOP!");
  }
  
  public String getParameters () {
    return this.brand + " - the highest quality: " + this.weight + " - shop for $" + this.price + " in LUQASZ SHOP!";
  }
}
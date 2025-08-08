public class Laptop {
    String brand;
    String ram;
    String processor;
    int ryzen;
    Laptop(String Brand,String Ram,String Processor){
      this.brand=Brand;
      this.ram=Ram;
      this.processor=Processor;
    }
    Laptop(String Brand,String Ram,String Processor,int Ryzen){
      this.brand=Brand;
      this.ram=Ram;
      this.processor=Processor;
      this.ryzen=Ryzen;
    }
}
class Four{
    public static void main(String[] args){
        Laptop l1=new Laptop("ThinkPad","8GB" , null)
    }
}

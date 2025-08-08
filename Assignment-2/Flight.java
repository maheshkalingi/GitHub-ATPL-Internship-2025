public class Flight {
    int flightNumber;
    String Destination;
    int Time;
    Flight(){
        System.out.println("This is Default Constructor");
        System.out.println("Flght Number 101");
        System.out.println("Destination: Bombay");
        System.out.println("Duration:4 Hrs");
    }
    Flight(int flno,String des,int time){
       this.flightNumber=flno;
       this.Destination=des;
       this.Time=time;
    }
    public void displayFlightDetails(){
        System.out.println("this is Parameterized Constructor");
        System.out.println("Flght Number: "+flightNumber);
        System.out.println("Flght Destination: "+Destination);
        System.out.println("Flght Duration: "+Time);
    }
}
class Three{
  public static void main(String[] args){
    Flight f1=new Flight();
    System.out.println();
    Flight f2=new Flight(77,"Banglore",1);
    f2.displayFlightDetails();
  }
}

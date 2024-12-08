package _02_03e;

public class Ticket {

  public Ticket() {

  }

  private String destination;
  private double price;
  private boolean isReturn;

  // Add three methods to set the value of each field, called setDestination,
  // setPrice and setIsReturn.
  public void setDestination(String _destination){
    this.destination = _destination;
  }

  public void setPrice(double _price){
    this.price = _price;
  }

  public void setIsReturn(boolean _isReturn){
    this.isReturn = _isReturn;
  }
  // Add a separate method to get the value of each field, called getDestination,
  // getPrice and getIsReturn.
  public String getDestination(){
    return destination;
  }

  public double getPrice(){
    return price;
  }

  public boolean getIsReturn(){
    return isReturn;
  }
}

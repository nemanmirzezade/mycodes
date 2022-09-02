package javaoca;
public class Bike {
     private String model;
     private String color;
     private int maxSpeed;
     private double tireSize;
     private double chainSize;
     private String brakeType;
     private int bikeyear;
     private double priceofBike;


     public Bike(){

     }


    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed=maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setBrakeType(String brakeType){
        this.brakeType=brakeType;
    }

    public String getBrakeType(){
        return brakeType;
    }


    public void setBikeyear(int bikeyear){
        this.bikeyear=bikeyear;
    }

    public int getBikeyear(){
        return bikeyear;
    }

    public void setChainSize(double chainSize){
        this.chainSize=chainSize;
    }

    public double getChainSize(){
        return chainSize;
    }

    public void setTireSize(double tireSize){
        this.tireSize=tireSize;
    }

    public double getTireSize() {
        return tireSize;
    }

    public void setPriceofBike(double priceofBike) {
        this.priceofBike = priceofBike;
    }

    public double getPriceofBike() {
        return priceofBike;
    }


    public static void bikedetail(Bike bike){
        System.out.println("bike model: "+bike.model);
        System.out.println("bike color: "+bike.color);
        System.out.println("bike max speed: "+bike.maxSpeed);
        System.out.println("bike tire size: "+ bike.tireSize);
        System.out.println("bike chain size: "+bike.chainSize);
        System.out.println("bike brake type: "+bike.brakeType);
        System.out.println("bike year: "+bike.bikeyear);
        System.out.println("bike price: "+bike.priceofBike);

    }

    public void bikedetail(){
        System.out.println("bike model: "+model);
        System.out.println("bike color: "+color);
        System.out.println("bike max speed: "+maxSpeed);
        System.out.println("bike tire size: "+ tireSize);
        System.out.println("bike chain size: "+chainSize);
        System.out.println("bike brake type: "+brakeType);
        System.out.println("bike year: "+bikeyear);
        System.out.println("bike price: "+priceofBike);

    }

}

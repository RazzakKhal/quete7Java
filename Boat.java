public class Boat extends Vehicle{
    Boat(String brand,int kilometers){
        super(brand, kilometers);
    }

    public String doStuff(){
        return  "Je suis " + this.getBrand() + " et je fais glou glou !";
    }
}

public abstract class Vehicle{
    private String brand;
    private int kilometers;

    Vehicle(String br, int km){
        this.brand = br;
        this.kilometers = km;
    }

    String getBrand(){
        return this.brand;
    }

    void setBrand(String br){
        this.brand = br;
    }

    int getKilometers(){
        return this.kilometers;
    }

    void setKilometers(int km){
        this.kilometers = km;
    }


    public abstract String doStuff();
}
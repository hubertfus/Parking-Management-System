public class Car {
    private String brand;
    private String model;
    private String plate;

    public Car(){
        this.brand = "";
        this.model = "";
        this.plate = "";

    }
    public Car(String newBrand, String newModel, String newPlate){
        this.setBrand(newBrand);
        this.setModel(newModel);
        this.setPlate(newPlate);
    }

    public String toString(){
        return (this.brand + " " + this.model + " " + this.plate);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPlate(String plate){
        plate = plate.replace(" ", "");
        plate = plate.toUpperCase();
        if(plate.length() > 8){
            System.out.println("WARNING: PLATE LENGTH IS TOO LONG");
        }
        this.plate = plate;
    }
}

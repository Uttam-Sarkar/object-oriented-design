public class CarBuilder{
    private String model = "Default Model";
    private String engin = "Prtrol";
    private String color = "White";
    private String transmission = "Manual";
    private Boolean sunroof = false;
    private Boolean infotainment = false;
    
    public CarBuilder setModel(String model){
        this.model = model;
        return this;
    }
    public CarBuilder setEngin(String engin){
        this.engin = engin;
        return this;
    }
    public CarBuilder setColor(String color){
        this.color = color;
        return this;
    }
    public CarBuilder setTransmission(String transmission){
        this.transmission = transmission;
        return this;
    }
    public CarBuilder setSunroof(Boolean sunroof){
        this.sunroof = sunroof;
        return this;

    }
    public CarBuilder setInfotainment(Boolean infortainment){
        this.infotainment = infortainment;
        return this;
    }

    public Car build() {
        return new Car(model, engin, color, transmission, sunroof, infotainment);
    }

}

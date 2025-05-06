public class Car{
    private String model ;
    private String engin ;
    private String color ;
    private String transmission ;
    private Boolean sunroof ;
    private Boolean infotainment ;

    public Car(String model, String engin, String color, String transmission, boolean sunroof, boolean infotainment){
        this.model = model;
        this.engin = engin;
        this.color = color;
        this.transmission = transmission;
        this.sunroof = sunroof;
        this.infotainment = infotainment;
    }

    public void displayinfo(){
        System.out.println("Car Information:");
        System.out.println("Model Name: " + model);
        System.out.println("Engin: " + engin);
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        
        System.out.println("Sunroof: " + (sunroof ? "Yes" : "No"));
        System.out.println("Infotainment: " + (infotainment ? "Yes" : "No"));
    }





    
    

}